import { RouterModule } from '@angular/router';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { BodyComponent } from './components';



@NgModule({
  declarations: [
    BodyComponent
  ],
  imports: [
    CommonModule,
    RouterModule,
  ],
  exports:[
    BodyComponent,
  ]
})
export class BodyModule { }
