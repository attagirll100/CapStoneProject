import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import {HttpClientModule} from '@angular/common/http';
import { BasketballplayersComponent } from './basketballplayers/basketballplayers.component';
import { TeamsComponent } from './teams/teams.component'

@NgModule({
  declarations: [
    AppComponent,
    BasketballplayersComponent,
    TeamsComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
