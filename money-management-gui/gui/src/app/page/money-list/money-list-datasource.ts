import { DataSource } from '@angular/cdk/collections';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort } from '@angular/material/sort';
import { map } from 'rxjs/operators';
import { Observable, of as observableOf, merge } from 'rxjs';
import {HttpClient, HttpHandler} from "@angular/common/http";
import {Component, Injectable} from "@angular/core";

// @ts-ignore
@Component(
  {
    standalone:true
  }
)
// TODO: Replace this with your own data model type
export interface MoneyListItem {
  idTransaction: number ;
  idNorekening: string;

  tanggal:string;
  saldo:number;
  nominal:number;

}

const ELEMENT_DATA : MoneyListItem[] =[
  {
    "idTransaction": 2,
    "idNorekening": "12121212",
    "tanggal": "2023-10-31 07:14:17",
    "saldo": 0,
    "nominal": 114444
  },
  {
    "idTransaction": 3,
    "idNorekening": "12121212",
    "tanggal": "2023-10-31 07:14:17",
    "saldo": 0,
    "nominal": 2131
  },
  {
    "idTransaction": 4,
    "idNorekening": "12121212",
    "tanggal": "2023-10-31 07:14:17",
    "saldo": 0,
    "nominal": 2323
  },
  {
    "idTransaction": 5,
    "idNorekening": "12121212",
    "tanggal": "2023-10-31 07:14:17",
    "saldo": 0,
    "nominal": 32323
  },
  {
    "idTransaction": 6,
    "idNorekening": "12121212",
    "tanggal": "2023-10-31 07:14:17",
    "saldo": 0,
    "nominal": 2323
  },
  {
    "idTransaction": 7,
    "idNorekening": "12121212",
    "tanggal": "2023-10-31 07:14:17",
    "saldo": 0,
    "nominal": 23
  }
];


/**
 * Data source for the MoneyList view. This class should
 * encapsulate all logic for fetching and manipulating the displayed data
 * (including sorting, pagination, and filtering).
 */
@Injectable()
export class MoneyListDataSource extends DataSource<MoneyListItem> {
  data: MoneyListItem[] =ELEMENT_DATA;
  paginator: MatPaginator | undefined;
  sort: MatSort | undefined;
  private baseUrl = 'http://localhost/transaction/all';
  //private http: HttpClient= new HttpClient();


  constructor(private http: HttpClient) {

    super();
  }

  /**
   * Connect this data source to the table. The table will only update when
   * the returned stream emits new items.
   * @returns A stream of the items to be rendered.
   */
  connect(): Observable<MoneyListItem[]> {

      return this.http.get<MoneyListItem[]>(`${this.baseUrl}`);

  }

  /**
   *  Called when the table is being destroyed. Use this function, to clean up
   * any open connections or free any held resources that were set up during connect.
   */
  disconnect(): void {}

  /**
   * Paginate the data (client-side). If you're using server-side pagination,
   * this would be replaced by requesting the appropriate data from the server.
   */
  private getPagedData(data: MoneyListItem[]): MoneyListItem[] {
    if (this.paginator) {
      const startIndex = this.paginator.pageIndex * this.paginator.pageSize;
      return data.splice(startIndex, this.paginator.pageSize);
    } else {
      return data;
    }
  }

  /**
   * Sort the data (client-side). If you're using server-side sorting,
   * this would be replaced by requesting the appropriate data from the server.
   */

}

/** Simple sort comparator for example ID/Name columns (for client-side sorting). */
function compare(a: string | number, b: string | number, isAsc: boolean): number {
  return (a < b ? -1 : 1) * (isAsc ? 1 : -1);
}
