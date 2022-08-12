import { TestBed } from '@angular/core/testing';

import { BoloscartService } from './boloscart.service';

describe('BoloscartService', () => {
  let service: BoloscartService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(BoloscartService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
