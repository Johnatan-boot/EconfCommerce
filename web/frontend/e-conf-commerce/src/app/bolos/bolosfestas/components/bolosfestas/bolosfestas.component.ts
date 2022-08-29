import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bolosfestas',
  templateUrl: './bolosfestas.component.html',
  styleUrls: ['./bolosfestas.component.scss'],
})
export class BolosfestasComponent implements OnInit {
  imgUrlBannerBoloFesta:string = './assets/bolofesta/slidebf1alt.png';
  constructor() { }

  ngOnInit(): void {
  }

}
