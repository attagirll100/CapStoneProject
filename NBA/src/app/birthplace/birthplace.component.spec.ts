import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BirthplaceComponent } from './birthplace.component';

describe('BirthplaceComponent', () => {
  let component: BirthplaceComponent;
  let fixture: ComponentFixture<BirthplaceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BirthplaceComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BirthplaceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
