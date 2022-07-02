const mongo = require('mongodb').MongoClient;
const express = require('express');
const Controller = require('./controller');
const sleep = require('util').promisify(setTimeout);

const URL = "mongodb://" + (process.env.DBURL || "localhost:27017"); // Default könnte man weglassen, nur zu Debug-Zwecken
const DB = "umfrage";

const HOST = "0.0.0.0";
const PORT = "1499";

async function getDatabase()
{
    console.log(`Connecting to database on ${URL}...`);

    let client;
    while (true)
    {
        try
        {
            client = await mongo.connect(URL, { useNewUrlParser: true });
            break;
        }
        catch (e)
        {
            console.log(e.toString());
            if (e.name === "MongoNetworkError")
            {
                await sleep(2000);
            }
            else
            {
                throw e;
            }
        }
    }

    let db = client.db(DB);
    console.log("Database connected...");
    return new Controller(db);
}

function allowCrossUse(req, res, next)
{
  res.header("Access-Control-Allow-Origin", "*");
  res.header("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
  res.header("Access-Control-Allow-Methods", "GET, PUT, PUSH");
  next();
}

async function startRest(controller)
{
    console.log("Starting REST interface...");

    let app = express();
    app.use(express.json());
    app.use(allowCrossUse);
    app.post("/umfragen", controller.addUmfrage.bind(controller));
    app.get("/umfragen", controller.listUmfragen.bind(controller));
    app.get("/umfragen/:id", controller.getUmfrage.bind(controller));
    app.put("/umfragen/:id/vote/:nr", controller.vote.bind(controller));
    app.get("/umfragen/:id/stats", controller.getStatistic.bind(controller));
    app.listen(PORT, HOST);

    console.log("REST interface ready...");
    console.log(`Running on http://${HOST}:${PORT}`);
}

async function main()
{
    try
    {
        let controller = await getDatabase();
        await startRest(controller);
    }
    catch (e)
    {
        console.log(e);
    }
}

main();

