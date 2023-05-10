import { Routes } from '@angular/router';

export const routes: Routes = [
  {
    path: 'home',
    loadComponent: () => import('./home/home.page').then((m) => m.HomePage),
  },
  {
    path: '',
    redirectTo: 'home',
    pathMatch: 'full',
  },
  {
    path: 'dados',
    loadComponent: () => import('./dados/dados.page').then( m => m.DadosPage)
  },  {
    path: 'login',
    loadComponent: () => import('./login/login.page').then( m => m.LoginPage)
  },
  {
    path: 'cadastro',
    loadComponent: () => import('./cadastro/cadastro.page').then( m => m.CadastroPage)
  },
  {
    path: 'selec-barb',
    loadComponent: () => import('./selec-barb/selec-barb.page').then( m => m.SelecBarbPage)
  },
  {
    path: 'agen-barber',
    loadComponent: () => import('./agen-barber/agen-barber.page').then( m => m.AgenBarberPage)
  },
  {
    path: 'final-barb',
    loadComponent: () => import('./final-barb/final-barb.page').then( m => m.FinalBarbPage)
  },

];
