import {Component, OnInit } from '@angular/core';
import {FlightService} from "../../services/shared/flight.service";
import {ActivatedRoute} from "@angular/router";
import {TicketService} from "../../services/shared/ticket.service";
import {AirportService} from "../../services/shared/airport.service";

@Component({
  selector: 'app-flight',
  templateUrl: './flight.component.html',
  styleUrls: ['./flight.component.css']
})
export class FlightComponent implements OnInit {

  departureAirport: string;
  arrivalAirport: string;
  departureDate : string;


  airportOptions = [];

  message:string;///

  constructor(private route: ActivatedRoute,
              private flightService : FlightService,
              private ticketService: TicketService,
              private airportService : AirportService,
  ) {


  }

  ngOnInit() {
    this.loadAirports();


  }


  getFlightSearchDetails(){
    debugger;
    this.flightService.setFlight(0, this.airportOptions[this.departureAirport]);
    this.flightService.setFlight(1, this.airportOptions[this.arrivalAirport]);
    this.flightService.setFlight(2, this.departureDate);
  }


  private loadAirports() {
    this.airportService.getAll().subscribe(response => {
      this.airportOptions = response;
    })
  }
  selectChangeHandlerDeparture(event : any ) {
    this.departureAirport = event.target.selectedIndex;

    console.log(this.airportOptions[this.departureAirport]);
  }
  selectChangeHandlerArrival(event : any ) {
    this.arrivalAirport = event.target.selectedIndex;

    console.log(this.airportOptions[this.arrivalAirport]);
  }
  selectChangeHandlerDepDate(event : any ) {

    this.departureDate=event.target.valueAsDate.toLocaleDateString();

    console.log(this.departureDate);
  }

  // getFlightSearchDetails($event: Event) {
  //   console.log(this.departureDate);
  //   console.log(this.airportOptions[this.arrivalAirport]);
  //   console.log(this.airportOptions[this.departureAirport]);
  //
  // }
}
