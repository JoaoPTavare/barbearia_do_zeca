import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { SelecBarbPage } from './selec-barb.page';

const routes: Routes = [
  {
    path: '',
    component: SelecBarbPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class SelecBarbPageRoutingModule {}
