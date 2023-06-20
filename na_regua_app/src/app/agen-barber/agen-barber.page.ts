import { Component, OnInit } from '@angular/core';
import { NavController } from '@ionic/angular';
import { ActivatedRoute, } from '@angular/router';



@Component({
  selector: 'app-agen-barber',
  templateUrl: './agen-barber.page.html',
  styleUrls: ['./agen-barber.page.scss'],
})
export class AgenBarberPage implements OnInit {

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

  pushPage(){
    this.navCtrl.navigateForward('home', {
      queryParams:{ barbeiro : this.barbeiro}
    });
  }

  ngOnInit() {
  }

}
