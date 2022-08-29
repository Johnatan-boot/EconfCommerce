import { CardsbfComponent } from './../components';
import { CardsbcComponent } from './../components';
import {
ModalbbComponent
} from './../components/home/components/reutilizaveis/modal/components/modalbb/modalbb.component';
import {
CarrinhoComprasComponent
} from './../vendas/carrinhoCompras/components/carrinho-compras/carrinho-compras.component';
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
import {
ModalblComponent
} from '../components/home/components/reutilizaveis/modal/components/modalbl';
import { ImagesService } from '../services';



@NgModule({
  declarations: [
    BolostradcionaisComponent,
    CardsComponent,
    CardsbcComponent,
    CardsbfComponent,
    BoloscoberturaComponent,
    BolosfestasComponent,
    ModalComponent,
    ModalblComponent,
    ModalbbComponent,
    CarrinhoComprasComponent,
    ListabolosComponent,

  ],
  imports: [
    CommonModule,
    BolosRoutingModule,
    MatCardModule,
    ModalModule,

  ],
  exports:[
    ModalComponent,
  ],
  providers:[
    ImagesService,
  ]
})
export class BolosModule { }
