import { Component, Input, OnInit,  } from '@angular/core';

@Component({
  selector: 'app-cards',
  templateUrl: './cards.component.html',
  styleUrls: ['./cards.component.scss']

})
export class CardsComponent implements OnInit {

  urlBoloTrad1:string = './assets/bolotradcional/slidebolot1Alt.png';
  urlBoloTrad2:string = './assets/bolotradcional/slidebolot12Alt.png';
  urlBoloTrad3:string = './assets/bolotradcional/slidebolot13Alt.png';

  urlBoloCob1:string = './assets/bolocobert/slidebc1alt.png';
  urlBoloCob2:string = './assets/bolocobert/slidebc2alt.png';
  urlBoloCob3:string = './assets/bolocobert/slidebc3alt.png';

  urlBoloBf1:string = './assets/bolofesta/slidebf1alt.png';
  urlBoloBf2:string = './assets/bolofesta/slidebf2alt.png';
  urlBoloBf3:string = './assets/bolofesta/slidebf3alt.png';





  @Input() valor:number = 0;

  incrementa(){
  this.valor++;
  }

  decrementa(){
   this.valor--;

  }
  constructor() {}

  ngOnInit(): void {
  }



}
