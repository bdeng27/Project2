import { Component, OnInit } from '@angular/core';
import { BankAccount } from '../models/models';
import { BankAccountService } from '../bank-account.service';

declare interface TableData {
    headerRow: string[];
    dataRows: string[][];
}

@Component({
    selector: 'bankaccount-cmp',
    moduleId: module.id,
    templateUrl: 'bankaccount.component.html'
})

export class BankaccountComponent implements OnInit{

    accounts: BankAccount[]

    public tableData1: TableData;
    public tableData2: TableData;

    table1Values: string[][];
    table2Values: string[][];

    constructor(private bankAccountService: BankAccountService) { }

    ngOnInit(){
        this.getBankAccount();
        this.populateTables();
    }

    getBankAccount(): void {
        this.bankAccountService.getBankAccounts().subscribe( accounts => this.onTableUpdate(accounts));
    }

    onTableUpdate(ba: BankAccount[]): void {
        this.accounts = ba;
        this.table1Values = new Array<string[]>(this.accounts.length);
        for (let i = 0; i < this.accounts.length; i++) {
            let tableRow = new Array<string>();
            tableRow.push('' + this.accounts[i].accountId);
            tableRow.push('Barclays');
            tableRow.push(this.accounts[i].type);
            tableRow.push('$' + this.accounts[i].amount);
            tableRow.push('Edit');
            tableRow.push('Delete');
            console.log(tableRow);
            this.table1Values[i] = tableRow;
            console.log(this.table1Values);
            console.log(i);
        }
        //console.log(this.accounts.length);
        console.log(this.table1Values.length);
        this.populateTables();
    }

    populateTables(): void {
        this.tableData1 = {
            headerRow: [ 'ID','Bank', 'Type', 'Amount', 'Edit', 'Delete'],
            dataRows: this.table1Values
        };
         this.tableData2 = {
            headerRow: [ 'ID','Type', 'Amount', 'Date', 'Edit', 'Delete'],
            dataRows: [
                ['1', 'Student loan', '$36,738', '11/11/2018', 'Edit', 'Delete'],
                ['2', 'Bank loan', '$23,789', '11/11/2018', 'Edit', 'Delete'],
                ['3', 'Monthly bills','$56,142', '11/11/2018', 'Edit', 'Delete'],
                ['4', 'Car bills','$38,735', '11/11/2018', 'Edit', 'Delete'],
            ]
        };
        // this.tableData1 = {
        //     headerRow: [ 'ID','Bank', 'Type', 'Amount', 'Edit', 'Delete'],
        //     dataRows: [
        //         ['1', 'PNC', 'Checking', '$36,738', 'Edit', 'Delete'],
        //         ['2', 'TD', 'Checking', '$23,789', 'Edit', 'Delete'],
        //         ['3', 'BBT', 'Saving','$56,142', 'Edit', 'Delete'],
        //         ['4', 'Chase', 'Credit','$38,735', 'Edit', 'Delete'],
        //     ]
        // };
        //  this.tableData2 = {
        //     headerRow: [ 'ID','Type', 'Amount', 'Date', 'Edit', 'Delete'],
        //     dataRows: [
        //         ['1', 'Student loan', '$36,738', '11/11/2018', 'Edit', 'Delete'],
        //         ['2', 'Bank loan', '$23,789', '11/11/2018', 'Edit', 'Delete'],
        //         ['3', 'Monthly bills','$56,142', '11/11/2018', 'Edit', 'Delete'],
        //         ['4', 'Car bills','$38,735', '11/11/2018', 'Edit', 'Delete'],
        //     ]
        // };
    }
}
