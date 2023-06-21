import { FuncionarioServiceService } from './../api/funcionario-service.service';
import { Component, OnInit } from '@angular/core';
import { NavController } from '@ionic/angular';
import { ActivatedRoute, } from '@angular/router';

@Component({
  selector: 'app-selec-barb',
  templateUrl: './selec-barb.page.html',
  styleUrls: ['./selec-barb.page.scss'],
})
export class SelecBarbPage implements OnInit {

  public barbeiros = [
    { id: '1', titulo: 'Matheus de Almeida', adicionado: false },
    { id: '2', titulo: 'João Pedro Aguiar', adicionado: false },
    { id: '3', titulo: 'Jonathan Tavares', adicionado: false }
  ];

  public barbeiro = {
    id: '',
    titulo: '',
    adicionado: false
  };

  FuncionarioServiceService: any;
  listaFuncionario: any[] = []

  constructor(private route: ActivatedRoute, 
    private service: FuncionarioServiceService,
    public navCtrl: NavController) {
    this.route.queryParams.subscribe(params => {
    this.barbeiro = params['barbeiro'];
    });
  }

 async barbeiroSelec() {
  this.service.getAllDados().then((funcionario: any) => {
    this.listaFuncionario = funcionario;
  });;


  }
  
  pushPage(barbeiro: any){
    this.navCtrl.navigateForward('agen-barber', {
    queryParams: { barbeiro: barbeiro}
    });
  }
  ngOnInit() {
  }
}