import { BolosfestasComponent } from './bolosfestas/components/bolosfestas/bolosfestas.component';
import { BolostradcionaisComponent } from './bolostradicionais/components/bolostradcionais/bolostradcionais.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BoloscoberturaComponent } from './boloscobertura';

const routes: Routes = [
   {path:'bolostradicionais', component: BolostradcionaisComponent},

   {path:'boloscomcobertura', component: BoloscoberturaComponent},
   {path:'bolosfestas', component: BolosfestasComponent},

];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class BolosRoutingModule { }



