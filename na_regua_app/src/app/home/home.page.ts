import { Component } from '@angular/core';
import { NavController, PopoverController,  } from '@ionic/angular';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {


  public items = [
    {titulo:'Corte padrão'},
    {titulo:'Barba'},
    {titulo:'Sobrancelha' }
  ];

  public barbeariaLogo=[ {imagem:'img01.jpg'} ];
 
  public barberImg = '../../assets/imagens/';
 

  constructor(private PopoverController: PopoverController, private navCtrl: NavController) {}

  addItem(item:any){
    item.adicionado = true;
  }

  removeItem(itens:any){
    itens.adicionado = false;
  }
}

