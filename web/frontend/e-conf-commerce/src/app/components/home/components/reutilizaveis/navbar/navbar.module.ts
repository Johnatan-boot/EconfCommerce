import { AppMaterialModule } from './../app-material.module';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { CollapseModule } from 'ngx-bootstrap/collapse';
import { ToastrModule } from 'ngx-toastr';


@NgModule({
  declarations: [

  ],
  imports: [
    CommonModule,
    NgbModule,
    AppMaterialModule,
   
    CollapseModule.forRoot(),
    ToastrModule.forRoot()
  ],
  
})
export class NavbarModule { }
