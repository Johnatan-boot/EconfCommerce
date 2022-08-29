import {Component, Input} from '@angular/core';
import {NgbActiveModal, NgbModal} from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'app-modal-content-bl',
  template: `
    <div class="modal-header">
      <h4 class="modal-title">Bolo de Baunilha</h4>
      <button type="button" class="btn-close" aria-label="Close" (click)="activeModal.dismiss('Cross click')"></button>
    </div>
    <div class="modal-body">
      <p>{{name2}}!</p>
    </div>
    <div class="modal-footer">
      <button type="button" class="btn btn-outline-dark" (click)="activeModal.close('Close click')">Close</button>
    </div>




  `


})
export class NgbdModalContent {
  @Input() name2;
 constructor(public activeModal: NgbActiveModal) {}
}

@Component({
selector: 'app-modalbb-component',
templateUrl: './modalbb.component.html'})
export class ModalbbComponent {
  constructor(private modalService: NgbModal) {}

  open() {
    const modalRef = this.modalService.open(NgbdModalContent);
    modalRef.componentInstance.name2 = 'Aqui será o Conteudo de'+
    ' Informações Bolo de Baunilha!';


  }

}
