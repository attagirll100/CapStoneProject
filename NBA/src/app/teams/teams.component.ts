import { Component, OnInit } from '@angular/core';
import { McuService } from '../mcu.service';
import { Teams } from '../types/Teams';

@Component({
  selector: 'app-teams',
  templateUrl: './teams.component.html',
  styleUrls: ['./teams.component.css']
})
export class TeamsComponent implements OnInit {
  teams: Teams[] = [];

  constructor(private mcuService: McuService) { }

  ngOnInit(): void {
    this.getTeams();
  }

  getTeams(): void {
    this.mcuService.getTeams()
    .subscribe(data => this.teams = data); 
  }
}
