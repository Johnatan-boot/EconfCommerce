import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BoloscoberturaComponent } from './boloscobertura.component';

describe('BoloscoberturaComponent', () => {
  let component: BoloscoberturaComponent;
  let fixture: ComponentFixture<BoloscoberturaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BoloscoberturaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BoloscoberturaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
