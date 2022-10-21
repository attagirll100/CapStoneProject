import { Component, OnInit } from '@angular/core';
import { McuService } from '../mcu.service';
import { Basketballplayers } from '../types/Basketballplayers';

@Component({
  selector: 'app-basketballplayers',
  templateUrl: './basketballplayers.component.html',
  styleUrls: ['./basketballplayers.component.css']
})
export class BasketballplayersComponent implements OnInit {
  basketballplayers: Basketballplayers[] = [];

  constructor(private mcuService: McuService) { }

  ngOnInit(): void {
    this.getPlayers();
  }

  getPlayers(): void {
    this.mcuService.getPlayers()
    .subscribe(data => this.basketballplayers = data);
  
  }
}
