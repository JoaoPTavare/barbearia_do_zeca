import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { HomeBarbPageRoutingModule } from './home-barb-routing.module';

import { HomeBarbPage } from './home-barb.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    HomeBarbPageRoutingModule
  ],
  declarations: [HomeBarbPage]
})
export class HomeBarbPageModule {}
