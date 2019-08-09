import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';


const routes: Routes = [

  {
    path: '',
    children: [
      {path: '', pathMatch: 'full', redirectTo: 'flight'},
      {path: 'flight', loadChildren: './pages/flight/flight.module#FlightModule'},
      {path: 'ticket', loadChildren: './pages/ticket/ticket.module#TicketModule'},
      {path: 'passenger', loadChildren: './pages/passenger/passenger.module#PassengerModule'}
              ]
  }

    ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
