import { Component, OnInit } from '@angular/core';
import { McuService } from '../mcu.service';
import { Birthplace } from '../types/Birthplace';


@Component({
  selector: 'app-birthplace',
  templateUrl: './birthplace.component.html',
  styleUrls: ['./birthplace.component.css']
})
export class BirthplaceComponent implements OnInit {
  birthplace: Birthplace[] = [];

  constructor(private mcuService: McuService) { }

  ngOnInit(): void {
    this.getPlaces();
  }

  getPlaces(): void {
    this.mcuService.getPlaces()
    .subscribe(data => this.birthplace = data);
  
  }

  

}
