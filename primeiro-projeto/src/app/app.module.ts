import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import {AccordionModule} from 'primeng/accordion';
import {MenuItem} from 'primeng/api';                  //api


import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';


@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AccordionModule,
    BrowserAnimationsModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
