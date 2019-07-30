import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { TicketComponent } from './ticket.component';
import {TicketRoutingModule} from "./ticket.routing.module";



@NgModule({
  declarations: [TicketComponent],

  imports: [
    TicketRoutingModule,
    CommonModule
  ]
})
export class TicketModule { }
