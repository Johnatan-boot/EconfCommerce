import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import {MatCardModule} from '@angular/material/card';
import { CollapseModule } from 'ngx-bootstrap/collapse';
import { ToastrModule } from 'ngx-toastr';



@NgModule({
  declarations: [

  ],
  imports: [
    CommonModule,
    NgbModule,
    MatCardModule,
    CollapseModule.forRoot(),
    ToastrModule.forRoot()


  ],
  
})
export class SidebarModule { }
