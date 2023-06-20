import { ComponentFixture, TestBed } from '@angular/core/testing';
import { DataBarbPage } from './data-barb.page';

describe('DataBarbPage', () => {
  let component: DataBarbPage;
  let fixture: ComponentFixture<DataBarbPage>;

  beforeEach(async(() => {
    fixture = TestBed.createComponent(DataBarbPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
