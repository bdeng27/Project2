import { Injectable } from '@angular/core';
import { User } from './models/models';
import { Observable } from 'rxjs';
import { of } from 'rxjs/observable/of';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class ExpenseService {

  url: string = "http://localhost:8080/ProjectTwo";

  constructor(private http: HttpClient) { }

  tryLogin(): Observable<User[]> {
    return this.http.get<User[]>(this.url + "/UserInfo");
  }
}
