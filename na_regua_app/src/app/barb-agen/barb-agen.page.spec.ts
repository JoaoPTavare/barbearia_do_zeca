import { ComponentFixture, TestBed } from '@angular/core/testing';
import { BarbAgenPage } from './barb-agen.page';

describe('BarbAgenPage', () => {
  let component: BarbAgenPage;
  let fixture: ComponentFixture<BarbAgenPage>;

  beforeEach(async(() => {
    fixture = TestBed.createComponent(BarbAgenPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
