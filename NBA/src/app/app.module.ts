import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import {HttpClientModule} from '@angular/common/http';
import { BasketballplayersComponent } from './basketballplayers/basketballplayers.component';
import { TeamsComponent } from './teams/teams.component';
import { AppRoutingModule } from './app-routing.module';
import { StadiumComponent } from './stadium/stadium.component';
import { BirthplaceComponent } from './birthplace/birthplace.component'

@NgModule({
  declarations: [
    AppComponent,
    BasketballplayersComponent,
    TeamsComponent,
    StadiumComponent,
    BirthplaceComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
