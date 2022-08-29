import { ModalModule } from './components/reutilizaveis/modal/modal.module';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import {MatCardModule} from '@angular/material/card';


import { HomeComponent } from './components/home';
import {
CarrosselComponent
} from './components/reutilizaveis/carrossel/components/carrossel';





@NgModule({
  declarations: [
    HomeComponent,
    CarrosselComponent,


  ],
  imports: [
    CommonModule,
    NgbModule,
    ModalModule,
    MatCardModule,


  ],
  exports:[
    CarrosselComponent
  ]
})
export class HomeModule { }
