import {Injectable} from "@angular/core";
import {ApiService} from "../api.service";
import {BehaviorSubject, Observable} from "rxjs";
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class FlightService {


  public data = {};

  private FLIGHT_PATH="/flight/flightlist"
  constructor(private apiService : ApiService){

  }


  setFlight(option, value) {

    debugger;
    this.data[option] = value;

  }

  getFlight() {
    debugger;
    console.log(this.data);

    return this.data;

  }








  getAll():Observable<any>{
    return this.apiService.get(this.FLIGHT_PATH).pipe(map(
      res=>{
        if(res){
          return res;
        }
        else{
          console.log(res);
          return {};
        }
      }
    ));
  }
  getById(id):Observable<any>{
    return this.apiService.get(this.FLIGHT_PATH,id).pipe(map(
      res=>{
        if(res){
          return res;
        }
        else{
          console.log(res);
          return {};
        }
      }
    ));
  }
  getByDepartureTime(id):Observable<any>{
    return this.apiService.get(this.FLIGHT_PATH,id).pipe(map(
      res=>{
        if(res){
          return res;
        }
        else{
          console.log(res);
          return {};
        }
      }
    ));
  }
  save(flight):Observable<any>{
    return this.apiService.post(this.FLIGHT_PATH,flight).pipe(map(
      res=>{
        if(res){
          return res;
        }
        else{
          console.log(res);
          return {};
        }
      }
    ));
  }
  delete(id):Observable<any>{
    return this.apiService.post(this.FLIGHT_PATH,id).pipe(map(
      res=>{
        if(res){
          return res;
        }
        else{
          console.log(res);
          return {};
        }
      }
    ));
  }
}
