import {Injectable} from "@angular/core";
import {ApiService} from "../api.service";
import {Observable} from "rxjs";
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class PassengerService {

  private PASSENGER_PATH="/passenger/passengerlist"
  constructor(private apiService : ApiService){

  }
  getAll():Observable<any>{
    return this.apiService.get(this.PASSENGER_PATH).pipe(map(
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
    return this.apiService.get(this.PASSENGER_PATH,id).pipe(map(
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
  save(passenger):Observable<any>{
    return this.apiService.post(this.PASSENGER_PATH,passenger).pipe(map(
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
    return this.apiService.post(this.PASSENGER_PATH,id).pipe(map(
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
