import { Component, OnInit } from '@angular/core';
import { McuService } from '../mcu.service';
import { Stadium } from '../types/Stadium';

@Component({
  selector: 'app-stadium',
  templateUrl: './stadium.component.html',
  styleUrls: ['./stadium.component.css']
})
export class StadiumComponent implements OnInit {
  stadium: Stadium[] = [];

  constructor(private mcuService: McuService) { }

  ngOnInit(): void {
    this.getArenas();
  }

  getArenas(): void {
    this.mcuService.getArenas()
    .subscribe(data => this.stadium = data);
  }

}
