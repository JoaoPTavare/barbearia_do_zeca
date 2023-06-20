import { Component, OnInit } from '@angular/core';
import { NavController, } from '@ionic/angular';
import { ActivatedRoute } from '@angular/router';


@Component({
  selector: 'app-selec-barb',
  templateUrl: './selec-barb.page.html',
  styleUrls: ['./selec-barb.page.scss'],
})
export class SelecBarbPage{

  public barbeiros = [
    {id:'1',titulo:'Matheus de Almeida', adicionado :false},
    {id:'2',titulo:'João Pedro Aguiar ', adicionado :false},
    {id:'3',titulo:'Jonathan Tavares', adicionado :false }
  ];

  public barbeiro = {
    id: '',
    titulo: ''
    };

    constructor(private route: ActivatedRoute, public navCtrl: NavController) {
      this.route.queryParams.subscribe(params => {
        this.barbeiro = params['barbeiros'];
      });
   }

  isButtonActive = false;

  changeColor() {
    this.isButtonActive = !this.isButtonActive;
  }
  ngOnInit() {
  }
}

