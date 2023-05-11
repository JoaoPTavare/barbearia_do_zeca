import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { IonicModule } from '@ionic/angular';

@Component({
  selector: 'app-agen-barber',
  templateUrl: './agen-barber.page.html',
  styleUrls: ['./agen-barber.page.scss'],
  standalone: true,
  imports: [IonicModule, CommonModule, FormsModule]
})
export class AgenBarberPage implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
