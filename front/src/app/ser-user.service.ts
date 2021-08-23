import { NgForm } from '@angular/forms';
import { User } from './../User';
import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class SerUserService {

apiURL: string = 'http://localhost:8082/user';
httpHeaders = new HttpHeaders().set('Content-Type', 'application/json');

constructor(private http : HttpClient) { }

listUser(): Observable<User[]>{
  return this.http.get<User[]>(`${this.apiURL}/list`);
}
addUser(fordata:NgForm){
  return this.http.post(`${this.apiURL}/list`, fordata);

}
}
