import { Component, OnInit } from '@angular/core';
import { Bolos } from 'src/app/models';
import { BoloscartService, BolosdataService } from 'src/app/services/bolos';

@Component({
  selector: 'app-listabolos',
  templateUrl: './listabolos.component.html',
  styleUrls: ['./listabolos.component.scss']
})
export class ListabolosComponent implements OnInit {

 bolos : Bolos[]  = [];
 
  constructor(private bolosDataService: BolosdataService, private bolosCartService: BoloscartService) { }

  ngOnInit(): void {
    this.bolosDataService.bolos.subscribe( bolos => this.bolos = bolos);
  }

  upQuantity(bolo : Bolos): void{
    if(bolo.stock > bolo.quantidade) {
      bolo.quantidade++;
      this.bolosCartService.addToCart(bolo);
    }
  }

  downQuantity(bolo : Bolos): void{
    if(bolo.quantidade > 0) {
      bolo.quantidade--;
      this.bolosCartService.addToCart(bolo);
    }
  }

  verifyBeerQuantity(bolo : Bolos): void {
    if(bolo.stock < bolo.quantidade) {
      alert("Estoque em Falta de Bolos");
      bolo.quantidade = bolo.stock;
    }

    if(bolo.quantidade < 0) {
      alert("Nao Pode pedir menos que 0 Bolos");
      bolo.quantidade = 0;
    }
  }

}
