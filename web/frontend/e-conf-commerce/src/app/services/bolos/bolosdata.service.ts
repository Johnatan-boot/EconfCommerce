import { environment } from './../../../environments/environment';
import { HttpClient } from '@angular/common/http';
import { BehaviorSubject, Observable } from 'rxjs';
import { Injectable } from '@angular/core';
import { Bolos } from 'src/app/models';


const URL = environment.baseApiUrl + 'bolos';
@Injectable({
  providedIn: 'root'
})
export class BolosdataService {
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
  
  constructor(private http: HttpClient) { 
    this.http.get<Bolos[]>(URL).subscribe(data => {
      this._bolos.push(...data);
    });
  }

  create(bolo: Bolos): void{
    this.http.post<Bolos>(URL, bolo).subscribe({
      error: error => {
        console.error('There was an error!', error);
    },
      next: data => {
        this._bolos.push(data)
      }
    });
  }

}
