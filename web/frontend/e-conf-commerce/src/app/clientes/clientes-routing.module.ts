import { CadastroPfComponent } from './../cadastro/cadastro-pf/components/cadastro-pf.component';
import { ClientesListComponent } from './components/clientes-list.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CadastroPjComponent } from '../cadastro';



export const ClientesRoutes: Routes = [
	{
		path: 'clientes',
		component: ClientesListComponent,

	},
  {path:'clientes/new', component:CadastroPfComponent},
  {path:'clientes/new', component:CadastroPjComponent},

];

@NgModule({
  imports: [
  	RouterModule.forChild(ClientesRoutes)
  ],
  exports: [
    RouterModule,

  ]
})
export class ClientesRoutingModule { }
