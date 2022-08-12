import { TestBed } from '@angular/core/testing';

import { BolosdataService } from './bolosdata.service';

describe('BolosdataService', () => {
  let service: BolosdataService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(BolosdataService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
