import { Routes } from '@angular/router';
import {TestComponent} from "./page/test/test.component";
import {Test2Component} from "./page/test2/test2.component";
import {Test3Component} from "./page/test3/test3.component";
import {Test4Component} from "./page/test4/test4.component";
import {MoneyListComponent} from "./page/money-list/money-list.component";

export const routes: Routes = [
  {path:'ada',component:TestComponent},
  {path:'ada2',component:Test2Component},
  {path:'ada3',component:Test3Component},
  {path:'ada4',component:Test4Component},
  {path:'ada5',component:MoneyListComponent}
];
