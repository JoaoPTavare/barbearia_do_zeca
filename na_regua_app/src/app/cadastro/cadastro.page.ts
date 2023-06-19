import { Component, OnInit } from '@angular/core';
import { ClienteServiceService } from '../api/cliente-service.service';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { AlertController, NavController, ToastController } from '@ionic/angular';
 
import { cliente } from 'src/app/interface/interface.cliente';


@Component({
  selector: 'app-cadastro',
  templateUrl: './cadastro.page.html',
  styleUrls: ['./cadastro.page.scss'],
})
export class CadastroPage implements OnInit {

  nome: FormControl | undefined;
  senha: FormControl | undefined;
  email: FormControl | undefined;
  formulario: any;
  ClienteServiceService: any;

  constructor(   private navCtrl: NavController,
    private formBuilder: FormBuilder,
    private service: ClienteServiceService,
    private toastController: ToastController,
    private alertController: AlertController,
) {
   
    this.nome = new FormControl('', Validators.required);
    this.email = new FormControl('', Validators.required);
    this.senha = new FormControl('', Validators.required);
 

    this.formulario = this.formBuilder.group({
      nome: this.nome,
      email: this.email,
      senha: this.senha,
 
    });
 }

  ngOnInit(

 


  ) {

  }

  async cadastrar() {
    const nome = this.formulario.value.nome;
    const email = this.formulario.value.email;
    const senha = this.formulario.value.senha;

    if (!nome || !email || !senha) {
      const alert = await this.alertController.create({
        header: 'Erro',
        message: 'Por favor, preencha todos os campos.',
        buttons: ['OK'],
      });
      alert.present();
      return;
    }

    const cliente: Cliente = {
      id: 0,
      nome: nome,
      email: email,
      senha: senha,
    };

    this.ClienteServiceService.ClienteServiceService(cliente);


}
}