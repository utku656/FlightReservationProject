import {NgModule} from "@angular/core";
import {RouterModule, Routes} from "@angular/router";
import {AppComponent} from "./app.component";

const routes: Routes = [
  {
    path: '',
    component: AppComponent,
    children:[
      {path: 'flight' , loadChildren:'./pages/flight/flight.module#FlightModule'},
      {path: 'ticket' , loadChildren:'./pages/ticket/ticket.module#TicketModule'},
      {path: 'passenger' , loadChildren:'./pages/passenger/passenger.module#PassengerModule'}
      ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
