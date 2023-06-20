import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { DataBarbPageRoutingModule } from './data-barb-routing.module';

import { DataBarbPage } from './data-barb.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    DataBarbPageRoutingModule
  ],
  declarations: [DataBarbPage]
})
export class DataBarbPageModule {}
