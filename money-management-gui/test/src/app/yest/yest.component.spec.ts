import { ComponentFixture, TestBed } from '@angular/core/testing';

import { YestComponent } from './yest.component';

describe('YestComponent', () => {
  let component: YestComponent;
  let fixture: ComponentFixture<YestComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [YestComponent]
    });
    fixture = TestBed.createComponent(YestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
