import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FlightComponent } from './flight.component';
import {FlightRoutingModule} from "./flight.routing.module";



@NgModule({
  declarations: [FlightComponent],
  imports: [
    CommonModule,
    FlightRoutingModule
  ]

})
export class FlightModule {

}
