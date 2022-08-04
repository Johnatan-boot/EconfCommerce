import { CadastroPjModule, CadastroPjRoutingModule } from './cadastro';
import { CadastroPfModule, CadastroPfRoutingModule } from './cadastro';
import { ClientesModule, ClientesRoutingModule } from './clientes';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { LoginModule } from './autenticacao/login';
import { LoginRoutingModule } from './autenticacao';
import { HomeModule, HomeRoutingModule } from './components';
import { AppMaterialModule, NavbarComponent, SidebarComponent } from './components';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatCardModule} from '@angular/material/card';
import {MatToolbarModule} from '@angular/material/toolbar';
import { HttpClientModule } from '@angular/common/http';
import { MatDialogModule } from '@angular/material/dialog';
import { BolosModule } from './bolos';
import { BolosRoutingModule } from './bolos/bolos-routing.module';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    SidebarComponent,

  ],
  imports: [
    BrowserModule,
    NgbModule,
    AppMaterialModule,
    MatCardModule,
    MatToolbarModule,
    HttpClientModule,
    MatDialogModule,
    CadastroPjModule,
    CadastroPjRoutingModule,
    BolosModule,
    BolosRoutingModule,
    CadastroPfModule,
    CadastroPfRoutingModule,
    ClientesModule,
    ClientesRoutingModule,
    HomeModule,
    HomeRoutingModule,
    LoginModule,
    LoginRoutingModule,
    //Raiz
    AppRoutingModule,
    BrowserAnimationsModule,

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
