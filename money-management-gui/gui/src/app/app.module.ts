import { NgModule } from '@angular/core';
import {HttpClientModule} from "@angular/common/http";
import {MoneyListComponent} from "./page/money-list/money-list.component";
import {MoneyListDataSource} from "./page/money-list/money-list-datasource";



@NgModule({
  declarations: [],
  imports: [
    HttpClientModule
  ],providers:[
    MoneyListComponent
  ],bootstrap:[
    MoneyListComponent,
  ]
})
export class AppModule { }
