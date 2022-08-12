import { Clientes } from 'src/app/models';
import { environment as env } from './../../../../environments/environment';
import { CadastroPf } from './../../../models';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable()

export class CadastroPfService {

  private readonly PATH: string = 'cadastro-pf';

  constructor(private http: HttpClient) { }

  cadastrar(cadastroPf: CadastroPf): Observable<any> {
  	  return this.http.post(env.baseApiUrl + this.PATH, cadastroPf);
  }

//metodo responsavel Por receber o Registro
  save(record:Clientes){
  console.log(record);
  }

}
