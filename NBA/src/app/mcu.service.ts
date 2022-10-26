import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Observable} from 'rxjs';
import { Basketballplayers } from './types/Basketballplayers';
import { Teams } from './types/Teams';
import { Stadium } from './types/Stadium';
import { Birthplace } from './types/Birthplace';
 

@Injectable({
  providedIn: 'root'
})
export class McuService {
  base_url = 'http://localhost:8081/';

  constructor(private http: HttpClient) { }

  getPlayers(): Observable<Basketballplayers[]> {
    return this.http.get<Basketballplayers[]>(this.base_url + 'basketballplayers');
  }

  getTeams(): Observable<Teams[]> {
    return this.http.get<Teams[]>(this.base_url + 'teams');
  }

  getArenas(): Observable<Stadium[]> {
    return this.http.get<Stadium[]>(this.base_url + 'stadium')
  }

  getPlaces(): Observable<Birthplace[]> {
    return this.http.get<Birthplace[]>(this.base_url + "birthplace")
  }

}
