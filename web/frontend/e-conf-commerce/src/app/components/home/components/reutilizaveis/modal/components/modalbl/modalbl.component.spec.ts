import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ModalblComponent } from './modalbl.component';

describe('ModalblComponent', () => {
  let component: ModalblComponent;
  let fixture: ComponentFixture<ModalblComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ModalblComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ModalblComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
