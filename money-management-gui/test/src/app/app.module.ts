import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { Test2Component } from './test2/test2.component';
import { YestComponent } from './yest/yest.component';

@NgModule({
  declarations: [
    AppComponent,
    Test2Component,
    YestComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
