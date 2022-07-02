// Interface für ein Umfragen-Objekt
export interface Umfrage
{
    readonly titel: string;
    readonly text: string;
    readonly antworten: string[];
    readonly _id: string;
}
