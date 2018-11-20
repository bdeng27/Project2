import { Component, OnInit } from '@angular/core';
import { User, BankAccount } from '../models/models';
import { UserService } from '../user.service';
import { BankAccountService } from '../bank-account.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {
 
  user: User;
  bankAccount: BankAccount;

  constructor(private userService: UserService, 
    private bankAccountService: BankAccountService) { }

  ngOnInit() {
    this.getUser();
    this.getBankAccount();
  }
  
  getUser(): void {
    this.userService.getUser().subscribe( user => this.user = user);
  }

  getBankAccount(): void {
    this.bankAccountService.getBankAccount().subscribe( ba => this.bankAccount = ba);
  }

}
