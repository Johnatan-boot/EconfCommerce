import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-carrossel',
  templateUrl: './carrossel.component.html',
  styleUrls: ['./carrossel.component.scss']
})
export class CarrosselComponent implements OnInit {
  slideCarrossel1: string = './assets/home/1011.png';
  slideCarrossel2: string = './assets/home/944.png';
  slideCarrossel3: string = './assets/home/984.png';
  constructor() { }

  ngOnInit(): void {
  }

}
