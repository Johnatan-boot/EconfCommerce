import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BolostradcionaisComponent } from './bolostradcionais.component';

describe('BolostradcionaisComponent', () => {
  let component: BolostradcionaisComponent;
  let fixture: ComponentFixture<BolostradcionaisComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BolostradcionaisComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BolostradcionaisComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
