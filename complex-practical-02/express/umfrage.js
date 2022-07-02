class Umfrage
{
    constructor(titel, text, antworten)
    {
        this.titel = titel;
        this.text = text;
        this.antworten = antworten;
    }

    isValid()
    {
        return this.titel && this.text && this.antworten && this.antworten.length>1;
    }
}

module.exports = Umfrage;