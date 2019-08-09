import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FlightComponent } from './flight.component';
import {FlightRoutingModule} from "./flight.routing.module";
import {FlightService} from "../../services/shared/flight.service";


@NgModule({
  declarations: [FlightComponent],
  providers: [FlightService],
  imports: [
    CommonModule,
    FlightRoutingModule,

  ]

})
export class FlightModule {

}
