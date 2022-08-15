import { Component, OnInit } from '@angular/core';
import { Bolos } from 'src/app/models';
import { BoloscartService } from 'src/app/services/bolos';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.scss']
})
export class CartComponent implements OnInit {

  bolos : Bolos[] = [
    {
      imageUrl:"./assets/bannercadastro/bannerCadastro.png",
      tipoBolo:"Bolo Tradcional",
      nome:"Bolo de Chocolate",
      preco:13,
      codigo:"1234",
      quantidade:1,
      peso:"2kg",
      stock: 50,
      clearance: true
    },
    {
      imageUrl:"./assets/bannercadastro/bannerCadastro.png",
      tipoBolo:"Bolo Tradcional",
      nome:"Bolo de Baunilha",
      preco:14,
      codigo:"5678",
      quantidade:2,
      peso:"2.5kg",
      stock: 60,
      clearance: true
    },
    
  ];
  constructor(private bolosCartService: BoloscartService) { }

  ngOnInit(): void {
    this.bolosCartService.bolos
    .subscribe(data => this.bolos = data);
  }

  total(){
    let som = 0;
    this.bolos.forEach(bolo => {
      som += bolo.quantidade * bolo.preco
    });
    return som;
  }

}
