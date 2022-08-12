import { CarrinhoComprasComponent } from './../vendas/carrinhoCompras/components/carrinho-compras/carrinho-compras.component';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { BolostradcionaisComponent } from './bolostradicionais';
import { CardsComponent } from '../components';
import { BolosRoutingModule } from './bolos-routing.module';
import { ModalModule } from './../components';
import {MatCardModule} from '@angular/material/card';

import { ModalComponent } from './../components';
import { BoloscoberturaComponent } from './boloscobertura';
import { BolosfestasComponent } from './bolosfestas';
import { ListabolosComponent } from './listaBolos';



@NgModule({
  declarations: [
    BolostradcionaisComponent,
    CardsComponent,
    BoloscoberturaComponent,
    BolosfestasComponent,
    ModalComponent,
    CarrinhoComprasComponent,
    ListabolosComponent,
   
  ],
  imports: [
    CommonModule,
    BolosRoutingModule,
    MatCardModule,
    ModalModule,
   
  ]
})
export class BolosModule { }
