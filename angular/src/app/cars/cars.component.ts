import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cars',
  templateUrl: './cars.component.html',
  styleUrls: ['./cars.component.css']
})
export class CarsComponent implements OnInit {
   carData:any='';
  cars=[{
    model:"audi",
    image:"https://cdn.pixabay.com/photo/2017/05/16/11/12/s5-2317509__340.jpg",
    description:"a awesome audi car"
  },{

    model:"volvo",
    image:"https://cdn.pixabay.com/photo/2019/07/01/08/24/volvo-4309447__340.png",
    description:"a awesome volvo car"
  }]

  constructor() { }

  
  

  ngOnInit() {
  }
  sendCar(c){
    this.carData;
      console.log(c)
  }
}
