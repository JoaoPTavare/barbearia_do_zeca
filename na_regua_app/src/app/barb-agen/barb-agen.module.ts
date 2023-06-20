import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { BarbAgenPageRoutingModule } from './barb-agen-routing.module';

import { BarbAgenPage } from './barb-agen.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    BarbAgenPageRoutingModule
  ],
  declarations: [BarbAgenPage]
})
export class BarbAgenPageModule {}
