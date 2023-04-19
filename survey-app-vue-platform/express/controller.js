const Umfrage = require('./umfrage');
const Ergebnis = require('./ergebnis');
const ObjectId = require('mongodb').ObjectID;

class Controller
{
    constructor(db)
    {
        this.umfragen = db.collection("Umfragen");
        this.ergebnisse = db.collection("Ergebnisse");
    }

    error(res, code, text, err)
    {
        console.log("Error: "+text);
        if(err)
        {
            console.log(err);
        }

        res.status(code);
        if(err)
        {
            res.json({info: text, errormessage: err.toString()});
        }
        else
        {
            res.send("Error: "+text);
        }
    }

    ok(res, code, text)
    {
        console.log(text);
        res.status(code);

        if(typeof text==="string")
        {
            res.send(text);
        }
        else
        {
            res.json(text);
        }
    }

    async addUmfrage(req, res)
    {
        console.log("Adding new survey...");
        let umf = Object.assign(new Umfrage, req.body);

        console.log(umf);
        if (!umf.isValid())
        {
            this.error(res, 406, "Survey data invalid.");
            return;
        }

        console.log("Survey data valid");
        await this.umfragen.insertOne(umf);
        let erg = new Ergebnis(umf);
        await this.ergebnisse.insertOne(erg);
        this.ok(res, 201, "Survey created.");
    }

    async listUmfragen(req, res)
    {
        console.log("Listing all surveys...");
        let cursor = this.umfragen.find({}, { fields: { "titel": 1 } });
        let all = await cursor.toArray();
        console.log(all.length);
        this.ok(res, 200, all);
    }

    async getUmfrage(req, res)
    {
        console.log("Retrieving a survey...");
        let id = req.params.id;
        console.log(id);
        try
        {
            let umf = await this.umfragen.findOne({ "_id": new ObjectId(id) });
            this.ok(res, 200, umf);
        }
        catch (e)
        {
            this.error(res, 400, "Some error.", e);
        }
    }


    async vote(req, res)
    {
        console.log("Registering vote");
        let id = req.params.id;
        let nr = req.params.nr;
        console.log(id);
        console.log(nr);

        try
        {
            let erg = await this.ergebnisse.findOne({ "umfrage": new ObjectId(id) });
            console.log(erg);
            if (nr < 0 || nr >= erg.antworten.length)
            {
                this.error(res, 406, "Nr not existing");
            }
            else
            {
                erg = Object.assign(Ergebnis.prototype, erg);
                erg.count(nr);
                await this.ergebnisse.save(erg);
                this.ok(res, 200, "Vote counted.");
            }
        }
        catch (e)
        {
            this.error(res, 400, "Some error.", e);
        }
    }

    async getStatistic(req, res)
    {
        console.log("Retrieving statistics...");
        let id = req.params.id;
        console.log(id);

        try
        {
            let erg = await this.ergebnisse.findOne({ "umfrage": new ObjectId(id) }, { fields: { "_id": 0 } });
            this.ok(res, 200, erg);
        }
        catch (e)
        {
            this.error(res, 400, "Some error.", e);
        }
    }
}

module.exports = Controller;
