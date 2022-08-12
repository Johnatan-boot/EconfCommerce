 import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-listabolos',
  templateUrl: './listabolos.component.html',
  styleUrls: ['./listabolos.component.scss']
})
export class ListabolosComponent implements OnInit {

 //bolos : Bolos[]  = [];
  
  constructor(/*private bolosDataService: BolosDataService, private bolosCartService: BolosCartService*/) { }

  ngOnInit(): void {
    //this.bolosDataService.bolos.subscribe( bolos => this.bolos = bolos);
  }

  /*upQuantity(bolo : Bolo): void{
    if(bolo.stock > bolo.quantidade) {
      bolo.quantidade++;
      this.bolosCartService.addToCart(bolo);
    }
  }

  downQuantity(bolo : Bolo): void{
    if(bolo.quantidade > 0) {
      bolo.quantidade--;
      this.beersCartService.addToCart(bolo);
    }
  }

  verifyBeerQuantity(bolo : Bolo): void {
    if(bolo.stock < bolo.quantidade) {
      alert("Estoque em Falta de Bolos");
      bolo.quantidade = bolo.stock;
    }

    if(bolo.quantidade < 0) {
      alert("Nao Pode pedir menos que 0 Bolos");
      bolo.quantidade = 0;
    }
  }*/

}
