import { Injectable } from '@angular/core';
import { BankAccount } from './models/models';
import { Observable } from 'rxjs';
import { of } from 'rxjs/observable/of';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class BankAccountService {

  url: string = "http://localhost:8080/ProjectTwo";

  constructor(private http: HttpClient) { }

  getBankAccounts(): Observable<BankAccount[]> {
    return this.http.get<BankAccount[]>(this.url + "/BankInfo");
  }
}
