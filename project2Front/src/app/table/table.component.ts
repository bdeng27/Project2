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
            headerRow: [ 'ID', 'Name', 'Amount', 'Place', 'Date'],
            dataRows: [
                ['1', 'Dakota Rice', '$36,738', 'Oud-Turnhout','2/2/2018'],
                ['2', 'Minerva Hooper', '$23,789', 'Sinaai-Waas','2/2/2018'],
                ['3', 'Sage Rodriguez', '$56,142', 'Baileux','2/2/2018'],
                ['4', 'Philip Chaney', '$38,735', 'Overland Park','2/2/2018'],
                ['5', 'Doris Greene', '$63,542', 'Feldkirchen in Kärnten','2/2/2018' ],
                ['6', 'Mason Porter',  '$78,615', 'Gloucester','2/2/2018',]
            ]
        };
        
        this.tableData2 = {
            headerRow: [ 'ID', 'Name', 'Amount', 'Place','Date'],
            dataRows: [
                ['1', 'Dakota Rice','$36,738', 'Niger', '2/2/2018'],
                ['2', 'Minerva Hooper', '$23,789', 'Curaçao', '2/2/2018'],
                ['3', 'Sage Rodriguez', '$56,142', 'Netherlands', '2/2/2018'],
                ['4', 'Philip Chaney', '$38,735', 'Korea, South', '2/2/2018'],
                ['5', 'Doris Greene', '$63,542', 'Malawi', '2/2/2018'],
                ['6', 'Mason Porter', '$78,615', 'Chile', '2/2/2018']
            ]
        };
    }
}
