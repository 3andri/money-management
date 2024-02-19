import {AfterViewInit, Component, Injectable, ViewChild} from '@angular/core';
import {MatTableModule, MatTable} from '@angular/material/table';
import {MatPaginatorModule, MatPaginator} from '@angular/material/paginator';
import {MatSortModule, MatSort} from '@angular/material/sort';
import {MoneyListDataSource, MoneyListItem} from './money-list-datasource';
import {HttpClient} from "@angular/common/http";
import {MatButton} from "@angular/material/button";

@Component({
  selector: 'app-money-list',
  templateUrl: './money-list.component.html',
  styleUrl: './money-list.component.scss',
  standalone: true,
  imports: [MatTableModule, MatPaginatorModule, MatSortModule, MatButton]
})
@Injectable({providedIn: 'root'})
export class MoneyListComponent implements AfterViewInit {
  @ViewChild(MatPaginator) paginator!: MatPaginator;
  @ViewChild(MatSort) sort!: MatSort;
  @ViewChild(MatTable) table!: MatTable<MoneyListItem>;
  private  dataSource=new MoneyListDataSource(this.http);


  /** Columns displayed in the table. Columns IDs can be added, removed, or reordered. */
  displayedColumns = ['id', 'name'];

  constructor(private http:HttpClient) {
    console.log("test");

  }

  ngAfterViewInit(): void {
    // this.dataSource.sort = this.sort;
    // this.dataSource.paginator = this.paginator;
     this.table.dataSource = this.dataSource.connect();
  }
}
