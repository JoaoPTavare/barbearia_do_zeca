import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { IonicModule } from '@ionic/angular';

@Component({
  selector: 'app-final-barb',
  templateUrl: './final-barb.page.html',
  styleUrls: ['./final-barb.page.scss'],
  standalone: true,
  imports: [IonicModule, CommonModule, FormsModule]
})
export class FinalBarbPage implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
