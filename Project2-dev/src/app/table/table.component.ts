import { Component, OnInit } from '@angular/core';
import { Expense } from '../models/models';
import { ExpenseService } from '../expense.service';

declare interface TableData {
    headerRow: string[];
    dataRows: string[][];
}

@Component({
    selector: 'table-cmp',
    moduleId: module.id,
    templateUrl: 'table.component.html'
})

export class TableComponent implements OnInit{

    expenses: Expense[];

    public tableData1: TableData;
    public tableData2: TableData;

    table1Values: string[][];
    table2Values: string[][];

    constructor(private expenseService: ExpenseService) { }

    ngOnInit(){
        this.getExpenses();
    }

    getExpenses(): void {
        this.expenseService.getExpenses().subscribe( expenses => this.onTableUpdate(expenses));
    }

    onTableUpdate(ea: Expense[]): void {
        this.expenses = ea;
        this.table2Values = new Array<string[]>(this.expenses.length);
        for (let i = 0; i < this.expenses.length; i++) {
            let tableRow = new Array<string>();
            tableRow.push('' + this.expenses[i].expenseId);
            tableRow.push(this.expenses[i].type);
            tableRow.push('$' + this.expenses[i].amount);
            tableRow.push(this.expenses[i].location);
            this.table2Values[i] = tableRow;
        }
        this.populateTables();
    }

    populateTables(): void {
        this.tableData1 = {
            headerRow: [ 'ID', 'Name', 'Amount', 'Place', 'Date'],
            dataRows: [
                ['1', 'Dakota Rice', 'Niger', 'Oud-Turnhout', '$36,738'],
                ['2', 'Minerva Hooper', 'Curaçao', 'Sinaai-Waas', '$23,789'],
                ['3', 'Sage Rodriguez', 'Netherlands', 'Baileux', '$56,142'],
                ['4', 'Philip Chaney', 'Korea, South', 'Overland Park', '$38,735'],
                ['5', 'Doris Greene', 'Malawi', 'Feldkirchen in Kärnten', '$63,542'],
                ['6', 'Mason Porter', 'Chile', 'Gloucester', '$78,615']
            ]
        };
        
        this.tableData2 = {
            headerRow: [ 'ID', 'Name', 'Amount', 'Place'],
            dataRows: this.table2Values
        };
        // this.tableData1 = {
        //     headerRow: [ 'ID', 'Name', 'Amount', 'Place', 'Date'],
        //     dataRows: [
        //         ['1', 'Dakota Rice', 'Niger', 'Oud-Turnhout', '$36,738'],
        //         ['2', 'Minerva Hooper', 'Curaçao', 'Sinaai-Waas', '$23,789'],
        //         ['3', 'Sage Rodriguez', 'Netherlands', 'Baileux', '$56,142'],
        //         ['4', 'Philip Chaney', 'Korea, South', 'Overland Park', '$38,735'],
        //         ['5', 'Doris Greene', 'Malawi', 'Feldkirchen in Kärnten', '$63,542'],
        //         ['6', 'Mason Porter', 'Chile', 'Gloucester', '$78,615']
        //     ]
        // };
        
        // this.tableData2 = {
        //     headerRow: [ 'ID', 'Name', 'Amount', 'Place'],
        //     dataRows: [
        //         ['1', 'Dakota Rice','$36,738', 'Niger', 'Oud-Turnhout'],
        //         ['2', 'Minerva Hooper', '$23,789', 'Curaçao', 'Sinaai-Waas'],
        //         ['3', 'Sage Rodriguez', '$56,142', 'Netherlands', 'Baileux'],
        //         ['4', 'Philip Chaney', '$38,735', 'Korea, South', 'Overland Park'],
        //         ['5', 'Doris Greene', '$63,542', 'Malawi', 'Feldkirchen in Kärnten'],
        //         ['6', 'Mason Porter', '$78,615', 'Chile', 'Gloucester']
        //     ]
        // };
    }
}
