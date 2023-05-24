import { ComponentFixture, TestBed } from '@angular/core/testing';
import { SelecBarbPage } from './selec-barb.page';

describe('SelecBarbPage', () => {
  let component: SelecBarbPage;
  let fixture: ComponentFixture<SelecBarbPage>;

  beforeEach(async(() => {
    fixture = TestBed.createComponent(SelecBarbPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
