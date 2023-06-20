import { Component, OnInit} from '@angular/core';
import { NavController, } from '@ionic/angular';
import { ActivatedRoute } from '@angular/router';


@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage implements OnInit {

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
  
  public itensAdc:any = []

  public barbeariaLogo=[ {imagem:'img01.jpg'} ];
 
  public barberImg = '../../assets/imagens/';
 
  public segment = '1';
  
  public categoria = [
    { id: '1', home: this.items },
    { id: '2', home: this.horarios}  
  ]

  public barbeiro = {
    id: '',
    titulo: '',
    adicionado: false
    };

  constructor(public navCtrl: NavController, private  route: ActivatedRoute) {  
    this.route.queryParams.subscribe(params => {
      this.barbeiro = params['barbeiro'];
      this.horarios = params['items'];
  });
 
  }

  addItem(item:any){
    item.adicionado = true;
    this.itensAdc.push(item);
  }

  removeItem(item:any){
    item.adicionado = false;
    let ix = this.itensAdc.findIndex((el:any) => el.cod == item.cod);
    this.itensAdc.splice(ix, 1)
  }

  pushPage(){
    this.navCtrl.navigateForward('selec-barb', {
    });
  }
  
  ngOnInit() {
    }

}
