import { BehaviorSubject, Observable } from 'rxjs';
import { Bolos } from 'src/app/models';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class BoloscartService {

  private _bolos : Bolos[] = [];
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
