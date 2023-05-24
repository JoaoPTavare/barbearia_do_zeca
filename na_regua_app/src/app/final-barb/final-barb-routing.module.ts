import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { FinalBarbPage } from './final-barb.page';

const routes: Routes = [
  {
    path: '',
    component: FinalBarbPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class FinalBarbPageRoutingModule {}
