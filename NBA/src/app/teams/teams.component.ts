import { Component, OnInit } from '@angular/core';
import { TeamsService } from '../teams.service';
import { Teams } from '../types/Teams';

@Component({
  selector: 'app-teams',
  templateUrl: './teams.component.html',
  styleUrls: ['./teams.component.css']
})
export class TeamsComponent implements OnInit {
  teams: Teams[] = [];

  constructor(private teamsService: TeamsService) { }

  ngOnInit(): void {
    this.getTeams();
  }

  getTeams(): void {
    this.teamsService.getTeams()
    .subscribe((data: Teams[]) => {
      this.teams= data}) 
}
}
