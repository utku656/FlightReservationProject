import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { TicketComponent } from './ticket.component';
import {TicketRoutingModule} from "./ticket.routing.module";
import {TicketService} from "../../services/shared/ticket.service";
import {MatRadioModule} from "@angular/material";



@NgModule({
  declarations: [TicketComponent],
  providers: [TicketService],

  imports: [
    TicketRoutingModule,
    CommonModule,
    MatRadioModule
  ]
})
export class TicketModule {

}
