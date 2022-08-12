import { first, tap } from 'rxjs';
import { Clientes } from 'src/app/models';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ClientesService {

  private readonly API = 'api/clientes';

  constructor(private httpClient: HttpClient) { }

  list() {
    return this.httpClient.get<Clientes[]>(this.API)
      .pipe(
        first(),
        // delay(5000),
        tap(clientes => console.log(clientes))
      );
  }

 /* save(record: Partial<Clientes>) {
    return this.httpClient.post<Clientes>(this.API, record).pipe(first());
  }*/

  //metodo responsavel Por receber o Registro
  save(record:Clientes){
    console.log(record);
    return this.httpClient.post<Clientes>(this.API, record).pipe(first());
    }





}








