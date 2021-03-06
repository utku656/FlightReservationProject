import {Injectable} from "@angular/core";
import {ApiService} from "../api.service";
import {Observable} from "rxjs";
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class AirportService {

  private AIRPORT_PATH="/airport/airportlist"
  constructor(private apiService : ApiService){

  }
  getAll():Observable<any>{
    return this.apiService.get(this.AIRPORT_PATH).pipe(map(
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
    return this.apiService.get(this.AIRPORT_PATH,id).pipe(map(
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
    return this.apiService.post(this.AIRPORT_PATH,flight).pipe(map(
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
    return this.apiService.post(this.AIRPORT_PATH,id).pipe(map(
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
