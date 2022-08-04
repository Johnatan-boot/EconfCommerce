import { Observable, catchError, of } from 'rxjs';
import { Clientes } from 'src/app/models';
import { Component, OnInit } from '@angular/core';
import { ClientesService } from 'src/app/services';
import { MatDialog } from '@angular/material/dialog';
import { ActivatedRoute, Router } from '@angular/router';
import { ErrorDialogComponent } from 'src/app/components';

@Component({
  selector: 'app-clientes-list',
  templateUrl: './clientes-list.component.html',
  styleUrls: ['./clientes-list.component.scss']
})
export class ClientesListComponent implements OnInit {
  clientes$: Observable<Clientes[]>;

 /*clientes: Clientes[] = [
  {_id:'1',nome:'johnatan',cpf:'123456789',
  telefone:'2222-4444',endereco:'rua do johnatan',cidade:'Taboao Da Serra',estado:'SP',email:'johnatan@mail.com'},
  {_id:'2',nome:'Lara',cpf:'123456789',
  telefone:'2222-4444',endereco:'rua da Lara',cidade:'Taboao Da Serra',estado:'SP',email:'lara@mail.com'}
 ];*/

  displayedColumns: string[] = ['nome', 'cpf', 'telefone',
   'endereco','cidade','estado','email','actions'];

  constructor(
    private clientesService: ClientesService,
    public dialog: MatDialog,
    private router: Router,
    private route: ActivatedRoute
  ) {
    this.clientes$ = this.clientesService.list()
    .pipe(
      catchError(error => {
        this.onError('Erro ao carregar Clientes.');
        return of([])
      })
    );

  }

  onError(errorMsg: string) {
    this.dialog.open(ErrorDialogComponent, {
      data: errorMsg
    });
  }

  ngOnInit(): void {
  }


  onAdd() {
    this.router.navigate(['new'], {relativeTo: this.route});
  }


}
