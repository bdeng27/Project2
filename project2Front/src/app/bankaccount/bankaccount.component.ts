import { Component, OnInit } from '@angular/core';

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
    public tableData1: TableData;
    public tableData2: TableData;
    ngOnInit(){
        this.tableData1 = {
            headerRow: [ 'ID','Bank', 'Type', 'Amount', 'Edit', 'Delete'],
            dataRows: [
                ['1', 'PNC', 'Checking', '$36,738', 'Edit', 'Delete'],
                ['2', 'TD', 'Checking', '$23,789', 'Edit', 'Delete'],
                ['3', 'BBT', 'Saving','$56,142', 'Edit', 'Delete'],
                ['4', 'Chase', 'Credit','$38,735', 'Edit', 'Delete'],
            ]
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
    }
}
