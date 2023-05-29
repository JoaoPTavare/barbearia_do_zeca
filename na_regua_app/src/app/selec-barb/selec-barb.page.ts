import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-selec-barb',
  templateUrl: './selec-barb.page.html',
  styleUrls: ['./selec-barb.page.scss'],
})
export class SelecBarbPage{

  public items = [
    {titulo:'Matheus de Almeida', adicionado :false},
    {titulo:'João Pedro Aguiar ', adicionado :false},
    {titulo:'Jonathan Tavares', adicionado :false }
  ];


  constructor() { }

  addItem(item:any){
    item.adicionado = true;
  }

  removeItem(item:any){
    item.adicionado = false;
  }

}
