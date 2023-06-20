import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { BarbAgenPage } from './barb-agen.page';

const routes: Routes = [
  {
    path: '',
    component: BarbAgenPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class BarbAgenPageRoutingModule {}
