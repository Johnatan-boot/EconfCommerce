import { AppMaterialModule } from './../../components';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';

import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {MatCardModule} from '@angular/material/card';
import { ReactiveFormsModule } from '@angular/forms';
import { MatInputModule } from '@angular/material/input';
import { MatButtonModule } from '@angular/material/button';
import { MatListModule } from '@angular/material/list';
import { MatTooltipModule } from '@angular/material/tooltip';
import { MatIconModule } from '@angular/material/icon';
import { MatSnackBarModule } from '@angular/material/snack-bar';
import { FlexLayoutModule } from '@angular/flex-layout';
import { CadastroPfComponent } from './components';
import { CadastroPfRoutingModule } from './cadastro-pf-routing.module';
import { CadastroPfService } from 'src/app/services';

@NgModule({
  declarations: [
          CadastroPfComponent,
  ],
  imports: [
    CommonModule,
    AppMaterialModule,
    MatCardModule,
    ReactiveFormsModule,
    MatInputModule,
    MatButtonModule,
    MatListModule,
    MatTooltipModule,
    MatIconModule,
    MatSnackBarModule,
    CadastroPfRoutingModule,
    FlexLayoutModule,
    RouterModule,
    HttpClientModule,
  ],
  providers: [
    CadastroPfService,
  ]
})
export class CadastroPfModule { }
