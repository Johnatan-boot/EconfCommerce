import {Component, Input} from '@angular/core';
import {NgbActiveModal, NgbModal} from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'ngbd-modal-content',
  template: `
    <div class="modal-header">
      <h4 class="modal-title">Bolo de Chocolate</h4>
      <button type="button" class="btn-close" aria-label="Close" (click)="activeModal.dismiss('Cross click')"></button>
    </div>
    <div class="modal-body">
      <p>{{name}}!</p>
    </div>
    <div class="modal-footer">
      <button type="button" class="btn btn-outline-dark" (click)="activeModal.close('Close click')">Close</button>
    </div>




  `


})
export class NgbdModalContent {
  @Input() name;
  titleBoloBaunilha:string = 'Bolo de Baunilha';
  contentBoloBaunilha: string = 'Aqui Será o Conteudo do '+
  'Bolo de Baunilha!';

  constructor(public activeModal: NgbActiveModal) {}
}

@Component({
selector: 'app-modal-component',
templateUrl: './modal.component.html'})
export class ModalComponent {
  constructor(private modalService: NgbModal) {}

  openBc() {
    const modalRef = this.modalService.open(NgbdModalContent);
    modalRef.componentInstance.name = 'Aqui será o Conteudo de'+
    ' Informações Bolo de Chocolate!';


  }

}
