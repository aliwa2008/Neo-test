import { TestBed } from '@angular/core/testing';

import { SerUserService } from './ser-user.service';

describe('SerUserService', () => {
  let service: SerUserService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SerUserService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
