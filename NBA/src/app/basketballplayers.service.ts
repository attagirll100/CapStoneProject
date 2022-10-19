import { Injectable } from '@angular/core';
import { HttpClient} from "@angular/common/http";
import {Observable} from 'rxjs';
import { Basketballplayers } from './types/Basketballplayers';

@Injectable({
  providedIn: 'root'
})
export class BasketballplayersService {
  base_url = 'http://localhost:8081/';

  constructor(private http: HttpClient) { }

  getPlayers(): Observable<Basketballplayers[]> {
    return this.http.get<Basketballplayers[]>('/basketballplayers')
  }


}
