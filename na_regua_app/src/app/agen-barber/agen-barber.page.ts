import { AgendamentoServiceService } from './../api/agendamento-service.service';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { ClienteServiceService } from '../api/cliente-service.service';
import { AlertController, NavController, ToastController } from '@ionic/angular';
import { ActivatedRoute, } from '@angular/router';

@Component({
  selector: 'app-agen-barber',
  templateUrl: './agen-barber.page.html',
  styleUrls: ['./agen-barber.page.scss'],
})
export class AgenBarberPage implements OnInit {


  public barbeiro =  "";
  public cliente =  "";
  public data =  "";
  public tempo =  "";
 

 
  formulario={};
  AgendamentoServiceService: any;
 

  constructor( private navCtrl: NavController,
    private formBuilder: FormBuilder,
    private service: AgendamentoServiceService,
    private toastController: ToastController,
    private alertController: AlertController,
    private route: ActivatedRoute
  
) {
   
    this.route.queryParams.subscribe(params => {
      this.cliente = params['cliente'];
    this.barbeiro = params['barbeiro'];

  
  });
 }



  async pushPage(funcionario:any){
    console.log('frazinha')
    this.cadastrar();

  this.navCtrl.navigateForward('home');
  } 

  ngOnInit() {}

  async cadastrar() {

    const cliente = this.cliente;
    const barbeiro = this.barbeiro;
    const data = this.data;
    const tempo = this.tempo;
  
    const Agendamento: any = {
      
      id: 0,
      cliente: cliente,
      funcionario: barbeiro,
      data: data,
      tempo: tempo,
    };

   this.service.postAgendamento(Agendamento);

  }
  
}