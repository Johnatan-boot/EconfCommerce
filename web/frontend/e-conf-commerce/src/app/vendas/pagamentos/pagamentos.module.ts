import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { PagamentosRoutingModule } from './pagamentos-routing.module';


import { PagamentosComponent } from './components/pagamentos/pagamentos.component';



@NgModule({
  declarations: [
    PagamentosComponent
  ],
  imports: [
    CommonModule,
    HttpClientModule,
    PagamentosRoutingModule,
  ]
})
export class PagamentosModule { }
