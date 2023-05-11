import { ComponentFixture, TestBed } from '@angular/core/testing';
import { AgenBarberPage } from './agen-barber.page';

describe('AgenBarberPage', () => {
  let component: AgenBarberPage;
  let fixture: ComponentFixture<AgenBarberPage>;

  beforeEach(async(() => {
    fixture = TestBed.createComponent(AgenBarberPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
