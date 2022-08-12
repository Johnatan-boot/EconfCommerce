import { CarrinhoComprasComponent } from './components/carrinho-compras/carrinho-compras.component';
import { Routes, RouterModule } from '@angular/router';
import { NgModule } from '@angular/core';

const routes: Routes = [
  {path:'produto/carrinhoCompras', component: CarrinhoComprasComponent},

];

@NgModule({
 imports: [RouterModule.forChild(routes)],
 exports: [RouterModule]
})
export class CarrinhoComprasRoutingModule { }
