import { Component, OnInit } from '@angular/core';
import { Bolos } from 'src/app/models';
import { BoloscartService } from 'src/app/services/bolos';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.scss']
})
export class CartComponent implements OnInit {

  bolos : Bolos[] = [];
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
