import { Component} from '@angular/core';
import { NavController, } from '@ionic/angular';
import { ActivatedRoute } from '@angular/router';
import { SelecBarbPage } from '../selec-barb/selec-barb.page';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {

  public items = [
    {id:'1', titulo:'Corte padrão R$ 35.00', adicionado: false},
    {id:'2',titulo:'Barba R$ 30.00', adicionado: false},
    {id:'3',titulo:'Sobrancelha R$ 20.00', adicionado: false }
  ];

  public horarios ={
    id: '',
    titulo: '',
    adicionado: false
  };
  

  public barbeariaLogo=[ {imagem:'img01.jpg'} ];
 
  public barberImg = '../../assets/imagens/';
 
  public segment = '1';
  
  public categoria = [
    { id: '1', home: this.items },
    { id: '2', home: this.horarios}  
  ]

  public barbeiro = {
    id: '',
    titulo: ''
    };

  constructor(public navCtrl: NavController, private  route: ActivatedRoute) {  
    this.route.queryParams.subscribe(params => {
    this.horarios = params['items'];
  });
}

  addItem(item:any){
    item.adicionado = true;
  }

  removeItem(item:any){
    item.adicionado = false;
  }

  pushPage(){
    this.navCtrl.navigateForward('selec-barb', {
    });
  }
  ngOnInit() {
    };
}
