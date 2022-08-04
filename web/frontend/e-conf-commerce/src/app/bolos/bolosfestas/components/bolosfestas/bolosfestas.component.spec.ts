import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BolosfestasComponent } from './bolosfestas.component';

describe('BolosfestasComponent', () => {
  let component: BolosfestasComponent;
  let fixture: ComponentFixture<BolosfestasComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BolosfestasComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BolosfestasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
