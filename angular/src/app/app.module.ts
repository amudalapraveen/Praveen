import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CarsComponent } from './cars/cars.component';
import { HeaderComponent } from './header/header.component';
import { CardetailsComponent } from './cardetails/cardetails.component';

@NgModule({
  declarations: [
    AppComponent,
    CarsComponent,
    HeaderComponent,
    CardetailsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
