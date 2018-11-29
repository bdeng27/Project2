import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from './models/models';
import { of } from 'rxjs/observable/of';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class UserService {

  url: string = "http://localhost:8080/ProjectTwo";

  constructor(private http: HttpClient) { }

  // getTestFromDB(): Observable<String> {
  //   return this.http.get<String>("http://localhost:8080/ProjectTwo/hello");
  // }

  getUser(): Observable<User> {
    //return of(this.user);
    return this.http.get<User>("http://localhost:8080/ProjectTwo/UserInfo");
  }
}
