import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListabolosComponent } from './listabolos.component';

describe('ListabolosComponent', () => {
  let component: ListabolosComponent;
  let fixture: ComponentFixture<ListabolosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListabolosComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListabolosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
