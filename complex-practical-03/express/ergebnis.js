class Ergebnis
{
    constructor(umfrage)
    {
        if(!umfrage._id)
        {
            throw new Error("Please persist Umfrage");
        }
        this.umfrage = umfrage._id;
        this.antworten = new Array(umfrage.antworten.length).fill(0);
    }

    count(nr)
    {
        this.antworten[nr]++;
    }
}

module.exports = Ergebnis;
