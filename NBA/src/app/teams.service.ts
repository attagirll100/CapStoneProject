import { Injectable } from '@angular/core';
import { Teams } from './types/Teams';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TeamsService {
  base_url = 'http://localhost:8081/';
  getTeam: any;

  constructor(private http: HttpClient) { }

  getTeams(): Observable<Teams[]> {
    return this.http.get<Teams[]>(this.base_url + 'teams')
  }


}
