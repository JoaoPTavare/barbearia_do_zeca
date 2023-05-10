import { ComponentFixture, TestBed } from '@angular/core/testing';
import { FinalBarbPage } from './final-barb.page';

describe('FinalBarbPage', () => {
  let component: FinalBarbPage;
  let fixture: ComponentFixture<FinalBarbPage>;

  beforeEach(async(() => {
    fixture = TestBed.createComponent(FinalBarbPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
