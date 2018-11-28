import { Component, OnInit } from '@angular/core';

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
    public tableData1: TableData;
    public tableData2: TableData;
    ngOnInit(){
        this.tableData1 = {
            headerRow: [ 'ID', 'Name', 'Amount', 'Place', 'Date', 'Edit'],
            dataRows: [
                ['1', 'Dakota Rice', 'Niger', 'Oud-Turnhout', '$36,738', 'edit'],
                ['2', 'Minerva Hooper', 'Curaçao', 'Sinaai-Waas', '$23,789','edit'],
                ['3', 'Sage Rodriguez', 'Netherlands', 'Baileux', '$56,142','edit'],
                ['4', 'Philip Chaney', 'Korea, South', 'Overland Park', '$38,735','edit'],
                ['5', 'Doris Greene', 'Malawi', 'Feldkirchen in Kärnten', '$63,542','edit'],
                ['6', 'Mason Porter', 'Chile', 'Gloucester', '$78,615','edit']
            ]
        };
        this.tableData2 = {
            headerRow: [ 'ID', 'Name', 'Amount', 'Place', 'Date', 'Edit'],
            dataRows: [
                ['1', 'Dakota Rice','$36,738', 'Niger', 'Oud-Turnhout','edit'],
                ['2', 'Minerva Hooper', '$23,789', 'Curaçao', 'Sinaai-Waas','edit'],
                ['3', 'Sage Rodriguez', '$56,142', 'Netherlands', 'Baileux','edit'],
                ['4', 'Philip Chaney', '$38,735', 'Korea, South', 'Overland Park','edit'],
                ['5', 'Doris Greene', '$63,542', 'Malawi', 'Feldkirchen in Kärnten','edit'],
                ['6', 'Mason Porter', '$78,615', 'Chile', 'Gloucester','edit']
            ]
        };
    }
}
