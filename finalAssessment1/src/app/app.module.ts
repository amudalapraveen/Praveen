import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { TaskmanagerComponent } from './taskmanager/taskmanager.component';
import { UsersComponent } from './users/users.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    HeaderComponent,
    TaskmanagerComponent,
    UsersComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      
       { path : '',component: HomeComponent },
       { path : 'task', component: TaskmanagerComponent },
       { path : 'users' , component : UsersComponent }
       
      
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
