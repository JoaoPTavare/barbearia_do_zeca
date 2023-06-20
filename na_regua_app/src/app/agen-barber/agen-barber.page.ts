import { Component, OnInit } from '@angular/core';
<<<<<<< HEAD
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { ClienteServiceService } from '../api/cliente-service.service';
import { AlertController, NavController, ToastController } from '@ionic/angular';
=======
import { NavController } from '@ionic/angular';
import { ActivatedRoute, } from '@angular/router';


>>>>>>> d161d996e7add5deccb8e1e46574c462a3b85ccb

@Component({
  selector: 'app-agen-barber',
  templateUrl: './agen-barber.page.html',
  styleUrls: ['./agen-barber.page.scss'],
})
export class AgenBarberPage implements OnInit {

<<<<<<< HEAD
  nome: FormControl | undefined;
  senha: FormControl | undefined;
  email: FormControl | undefined;
  formulario: FormGroup;
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

  ngOnInit() {}

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

    const cliente: any = {
      id: 0,
      nome: nome,
      email: email,
      senha: senha,
    };

    this.service.postCliente(cliente);
=======
  constructor(private route: ActivatedRoute, public navCtrl: NavController) {
    this.route.queryParams.subscribe(params => {
      this.barbeiro = params['barbeiro'];
      });
}
  public barbeiro = {
    id: '',
    titulo: '',
    adicionado: false
  };

  pushPage(barbeiro:any){
    this.navCtrl.navigateForward('home', {
      queryParams: { barbeiro: barbeiro}
    });
    
  }
>>>>>>> d161d996e7add5deccb8e1e46574c462a3b85ccb

  }
}
