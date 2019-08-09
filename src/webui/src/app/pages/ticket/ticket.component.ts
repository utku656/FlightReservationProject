import { Component, OnInit } from '@angular/core';
import {TicketService} from "../../services/shared/ticket.service";
import {ActivatedRoute} from "@angular/router";
import {FlightService} from "../../services/shared/flight.service";
import {AirportService} from "../../services/shared/airport.service";
import {PassengerService} from "../../services/shared/passenger.service";

@Component({
  selector: 'app-ticket',
  templateUrl: './ticket.component.html',
  styleUrls: ['./ticket.component.css']
})
export class TicketComponent implements OnInit {

  // route parameter options
  public data;
  message:string;
  // Dropdown values

  flightOptions = [];
  passengers = [];
  constructor(private route: ActivatedRoute,
              private flightService : FlightService,
              private ticketService: TicketService,
              private airportService : AirportService,
              private passengerService : PassengerService
  ) {
    debugger;
    this.data = this.flightService.getFlight();

  }

  ngOnInit() {

    // - Flights  dolacak
    this.loadFlights();
    this.loadPassengers();


  }



  private loadPassengers() {
    this.passengerService.getAll().subscribe(response => {

      this.passengers = response;

    })
  }
  private loadFlights() {
    this.flightService.getAll().subscribe(response => {

      this.flightOptions = response;

    })
  }



}
