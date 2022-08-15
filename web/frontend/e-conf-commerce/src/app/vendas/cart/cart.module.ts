import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CartComponent } from './components';
import { CartRoutingModule } from './cart-routing.module';



@NgModule({
  declarations: [
    CartComponent,
    
  ],
  imports: [
    CommonModule,
    CartRoutingModule,
  ]
})
export class CartModule { }
