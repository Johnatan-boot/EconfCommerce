import { BehaviorSubject, Observable } from 'rxjs';
import { Bolos } from 'src/app/models';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class BoloscartService {
 
  private _bolos : Bolos[] = [
    {
      imageUrl:"./assets/bannercadastro/bannerCadastro.png",
      tipoBolo:"Bolo Tradcional",
      nome:"Bolo de Chocolate",
      preco:13,
      codigo:"1234",
      quantidade:1,
      peso:"2kg",
      stock: 50,
      clearance: true
    },
    {
      imageUrl:"./assets/bannercadastro/bannerCadastro.png",
      tipoBolo:"Bolo Tradcional",
      nome:"Bolo de Laranja",
      preco:14,
      codigo:"5678",
      quantidade:2,
      peso:"2.5kg",
      stock: 60,
      clearance: true
    },
    {
      imageUrl:"./assets/bannercadastro/bannerCadastro.png",
      tipoBolo:"Bolo Tradcional",
      nome:"Bolo de Baunilha",
      preco:15,
      codigo:"9191",
      quantidade:2,
      peso:"2.5kg",
      stock: 80,
      clearance: true
    },
    {
      imageUrl:"./assets/bannercadastro/bannerCadastro.png",
      tipoBolo:"Bolo Tradcional",
      nome:"Bolo de Baunilha",
      preco:15,
      codigo:"9191",
      quantidade:2,
      peso:"2.5kg",
      stock: 80,
      clearance: true
    },
  ];
  private _bolosSubjects : BehaviorSubject<Bolos[]> = new BehaviorSubject(this._bolos);
  public bolos : Observable<Bolos[]> = this._bolosSubjects.asObservable();
  constructor() { }

  addToCart(bolo:Bolos){
    let index = this._bolos.findIndex(b => b.nome === bolo.nome);
    if(index === -1)
      this._bolos.push(bolo);
    else
      this._bolos[index].quantidade = bolo.quantidade;
    if (bolo.quantidade == 0){
      this._bolos.splice(index,1);
    }
  }
}
