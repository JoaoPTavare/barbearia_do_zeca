import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { SelecBarbPageRoutingModule } from './selec-barb-routing.module';

import { SelecBarbPage } from './selec-barb.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    SelecBarbPageRoutingModule
  ],
  declarations: [SelecBarbPage]
})
export class SelecBarbPageModule {}
