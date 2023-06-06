import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HomeBarbPage } from './home-barb.page';

const routes: Routes = [
  {
    path: '',
    component: HomeBarbPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class HomeBarbPageRoutingModule {}
