import { Injectable } from '@angular/core';
import { BankAccount } from './models/models';
import { of, Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BankAccountService {

  bankAccount: BankAccount = {
    id: 1,
    amount: 10000,
    type: "checking"
  };

  constructor() { }

  getBankAccount(): Observable<BankAccount> {
    return of(this.bankAccount);
  }
}
