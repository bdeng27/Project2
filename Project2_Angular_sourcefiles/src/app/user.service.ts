import { Injectable } from '@angular/core';
import { of, Observable } from 'rxjs';
import { User } from './models/models';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  user: User = {
    id: 1,
    name: "temp",
    email: "temp@temp.com",
    password: "temp",
    isManager: false,
    income: 50000
  };

  constructor() { }

  getUser(): Observable<User> {
    return of(this.user);
  }
}
