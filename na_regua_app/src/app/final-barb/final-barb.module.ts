import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { FinalBarbPageRoutingModule } from './final-barb-routing.module';

import { FinalBarbPage } from './final-barb.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    FinalBarbPageRoutingModule
  ],
  declarations: [FinalBarbPage]
})
export class FinalBarbPageModule {}
