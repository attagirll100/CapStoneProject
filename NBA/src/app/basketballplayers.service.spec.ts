import { TestBed } from '@angular/core/testing';

import { BasketballplayersService } from './basketballplayers.service';

describe('BasketballplayersService', () => {
  let service: BasketballplayersService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(BasketballplayersService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
