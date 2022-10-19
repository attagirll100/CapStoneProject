import { Component, OnInit } from '@angular/core';
import { BasketballplayersService } from '../basketballplayers.service';
import { Basketballplayers } from '../types/Basketballplayers';

@Component({
  selector: 'app-basketballplayers',
  templateUrl: './basketballplayers.component.html',
  styleUrls: ['./basketballplayers.component.css']
})
export class BasketballplayersComponent implements OnInit {
  basketballplayers: Basketballplayers[] = [];

  constructor(private basketballplayersService: BasketballplayersService) { }

  ngOnInit(): void {
    this.getPlayers();
  }

  getPlayers(): void {
    this.basketballplayersService.getPlayers()
      .subscribe(data => {
        console.log(data);
        this.basketballplayers = data});
  }

}
