import { Component } from '@angular/core';
import { NavController, PopoverController,  } from '@ionic/angular';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {


  public items = [
    {titulo:'Corte padrão', adicionado :false},
    {titulo:'Barba', adicionado :false},
    {titulo:'Sobrancelha', adicionado :false }
  ];

  public barbeariaLogo=[ {imagem:'img01.jpg'} ];
 
  public barberImg = '../../assets/imagens/';
 

  constructor(private PopoverController: PopoverController, private navCtrl: NavController) {}

  addItem(item:any){
    item.adicionado = true;
  }

  removeItem(item:any){
    item.adicionado = false;
  }
  selectRow(item:any){
   this.selectRow = item.adicionado;
   }
}

