import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { AgenBarberPageRoutingModule } from './agen-barber-routing.module';

import { AgenBarberPage } from './agen-barber.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    AgenBarberPageRoutingModule
  ],
  declarations: [AgenBarberPage]
})
export class AgenBarberPageModule {}
