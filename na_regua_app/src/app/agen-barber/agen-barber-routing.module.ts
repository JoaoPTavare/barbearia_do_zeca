import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { AgenBarberPage } from './agen-barber.page';

const routes: Routes = [
  {
    path: '',
    component: AgenBarberPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class AgenBarberPageRoutingModule {}
