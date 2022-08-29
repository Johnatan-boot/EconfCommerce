import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ModalbbComponent } from './modalbb.component';

describe('ModalbbComponent', () => {
  let component: ModalbbComponent;
  let fixture: ComponentFixture<ModalbbComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ModalbbComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ModalbbComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
