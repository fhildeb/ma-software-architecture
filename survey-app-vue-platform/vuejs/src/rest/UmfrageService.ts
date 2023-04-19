// Imports aus dem Axios-Framework
import axios, { AxiosResponse } from 'axios';

// Imports unserer Model-Interfaces
import { UmfrageInfo } from './UmfrageInfo';
import { Umfrage } from './Umfrage';
import { Ergebnis } from './/Ergebnis';

// URL: Achtung, hier müsste die IP unserer Docker-Maschine rein,
//      sodass die Client-Anfagen funktionieren. Solange es lokal
//      getestet wird, sollte 127.0.0.1 ausreichen.
const URL = `http://${process.env.VUE_APP_REST_HOST}:${process.env.VUE_APP_REST_PORT}`;

// UmfragenService für den Zugriff auf den REST-Server
export class UmfrageService
{
    // Listet alle Umfragen in der Kurzform (Titel, ID) auf.
    public static async listUmfragen(): Promise<UmfrageInfo[]>
    {
        const response: AxiosResponse<UmfrageInfo[]> = await axios.get(`${URL}/umfragen`);
        return response.data;
    }

    // Liefert eine Umfrage mit allen Informationen.
    public static async getUmfrage(id: string): Promise<Umfrage>
    {
        const response: AxiosResponse<Umfrage> = await axios.get(`${URL}/umfragen/${id}`);
        return response.data;
    }

    // Gibt eine Stimme ab.
    public static async vote(umf: Umfrage, nr: number)
    {
        await axios.put(`${URL}/umfragen/${umf._id}/vote/${nr}`);
    }

    // Liefert die Statistik zu einer Umfrage.
    public static async getStats(umf: Umfrage): Promise<number[]>
    {
        const response: AxiosResponse<Ergebnis> = await axios.get(`${URL}/umfragen/${umf._id}/stats`);
        return response.data.antworten;
    }
}

// Reexportieren der Datenklassen, zum einfacheren Import
export { UmfrageInfo, Umfrage };
