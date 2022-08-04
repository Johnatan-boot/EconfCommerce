import { ClientesListComponent } from './components/clientes-list.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';



export const ClientesRoutes: Routes = [
	{
		path: 'clientes',
		component: ClientesListComponent,

	}
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
