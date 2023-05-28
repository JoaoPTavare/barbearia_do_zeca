import { Component} from '@angular/core';
import { NavController, PopoverController} from '@ionic/angular';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {

  public items = [
    {titulo:'Corte padrão R$ 35.00 ', adicionado :false},
    {titulo:'Barba R$ 30.00', adicionado :false},
    {titulo:'Sobrancelha R$ 20.00', adicionado :false }
  ];

  public horarios = [
   
  ];

  public barbeariaLogo=[ {imagem:'img01.jpg'} ];
 
  public barberImg = '../../assets/imagens/';
 
  public segment = '1';
  
  public categoria = [
    { id: '1', home: this.items },
    { id: '2', home: this.horarios}  
  ]

  constructor(private PopoverController: PopoverController, private navCtrl: NavController) {}

  addItem(item:any){
    item.adicionado = true;
  }

  removeItem(item:any){
    item.adicionado = false;
  }
}
