import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { ClienteServiceService } from '../api/cliente-service.service';
import { AlertController, NavController, ToastController } from '@ionic/angular';

@Component({
  selector: 'app-agen-barber',
  templateUrl: './agen-barber.page.html',
  styleUrls: ['./agen-barber.page.scss'],
})
export class AgenBarberPage implements OnInit {

  cliente: FormControl | undefined;
  funcionario: FormControl | undefined;
  tempo: FormControl | undefined;
  data: FormControl | undefined;
 
 
 
 
 
  formulario: FormGroup;
  ClienteServiceService: any;

  constructor(   private navCtrl: NavController,
    private formBuilder: FormBuilder,
    private service: ClienteServiceService,
    private toastController: ToastController,
    private alertController: AlertController,
) {
   
 

    this.formulario = this.formBuilder.group({
      cliente: this.cliente,
      funcionario: this.funcionario,
      tempo: this.tempo,
      data: this.data,
    });
 }

  ngOnInit() {}

  async cadastrar() {
    const cliente = this.formulario.value.cliente;
    const funcionario = this.formulario.value.funcionario;
    const data = this.formulario.value.data;
    const tempo = this.formulario.value.tempo;
  
    const Agendamento: any = {
      
      id: 0,
      cliente: cliente,
      funcionario: funcionario,
      data: data,
      tempo: tempo,
    };

    this.service.postAgendamento(Agendamento);

  }
}
