import { Login } from './../../models/login/login.model';
import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from 'rxjs';
import { environment as  env  } from './../../../environments/environment.prod';






@Injectable()
export class LoginService {

  private readonly PATH: string = 'auth';

  constructor(private http: HttpClient) { }

  logar(login: Login): Observable<any> {
 	return this.http.post(env.baseUrl + this.PATH, login);
  }

}
