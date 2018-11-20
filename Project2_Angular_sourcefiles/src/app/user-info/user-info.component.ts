import { Component, OnInit } from '@angular/core';
import { User, BankAccount } from '../models/models';
import { UserService } from '../user.service';
import { BankAccountService } from '../bank-account.service';

@Component({
  selector: 'app-user-info',
  templateUrl: './user-info.component.html',
  styleUrls: ['./user-info.component.css']
})
export class UserInfoComponent implements OnInit {

  // user: User = {
  //   id: 1,
  //   name: "temp",
  //   email: "temp@temp.com",
  //   password: "temp",
  //   isManager: false,
  //   income: 50000
  // };

  user: User;
  bankAccount: BankAccount;

  constructor(private userService: UserService, 
    private bankAccountService: BankAccountService) { }

  ngOnInit() {
    this.getUser();
  }
  
  getUser(): void {
    this.userService.getUser().subscribe( user => this.user = user);
  }

  getBankAccount(): void {
    this.bankAccountService.getBankAccount().subscribe( ba => this.bankAccount = ba);
  }
}
