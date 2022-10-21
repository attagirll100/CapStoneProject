import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule,Routes } from '@angular/router';
import { BasketballplayersComponent } from './basketballplayers/basketballplayers.component';
import { TeamsComponent } from './teams/teams.component';


const routes: Routes = [
  {path: 'basketballplayers', component: BasketballplayersComponent},
  {path: 'teams', component: TeamsComponent}
]


@NgModule({
  declarations: [],
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
