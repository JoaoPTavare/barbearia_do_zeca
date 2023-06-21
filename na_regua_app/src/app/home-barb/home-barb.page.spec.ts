import { ComponentFixture, TestBed, async } from '@angular/core/testing';
import { HomeBarbPage } from './home-barb.page';

describe('HomeBarbPage', () => {
  let component: HomeBarbPage;
  let fixture: ComponentFixture<HomeBarbPage>;

  beforeEach(async(() => {
    fixture = TestBed.createComponent(HomeBarbPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
