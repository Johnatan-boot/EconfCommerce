import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { BolostradcionaisComponent } from './bolostradicionais';
import { CardsComponent } from '../components';
import { BolosRoutingModule } from './bolos-routing.module';
import { BoloscoberturaComponent } from './boloscobertura';
import {MatCardModule} from '@angular/material/card';
import { BolosfestasComponent } from './bolosfestas';



@NgModule({
  declarations: [
    BolostradcionaisComponent,
    CardsComponent,
    BoloscoberturaComponent,
    BolosfestasComponent,
  ],
  imports: [
    CommonModule,
    BolosRoutingModule,
    MatCardModule,
  ]
})
export class BolosModule { }
