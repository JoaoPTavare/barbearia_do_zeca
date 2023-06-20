import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { DataBarbPage } from './data-barb.page';

const routes: Routes = [
  {
    path: '',
    component: DataBarbPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class DataBarbPageRoutingModule {}
