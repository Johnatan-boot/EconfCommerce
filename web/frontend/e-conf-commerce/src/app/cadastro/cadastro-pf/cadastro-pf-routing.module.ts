import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CadastroPfComponent } from './components';

const routes: Routes = [
   {path:'cadastro-pf', component: CadastroPfComponent},

];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CadastroPfRoutingModule { }



