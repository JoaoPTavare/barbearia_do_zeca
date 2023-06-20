import { NgModule } from '@angular/core';
import { PreloadAllModules, RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {
    path: 'login',
    loadChildren: () => import('./login/login.module').then( m => m.LoginPageModule)
  },
  {
    path: '',
    redirectTo: 'login',
    pathMatch: 'full'
  },
  {
    path: 'home',
    loadChildren: () => import('./home/home.module').then( m => m.HomePageModule)
  },
  {
    path: 'agen-barber',
    loadChildren: () => import('./agen-barber/agen-barber.module').then( m => m.AgenBarberPageModule)
  },
  {
    path: 'api',
    loadChildren: () => import('./api/api.module').then( m => m.ApiPageModule)
  },
  {
    path: 'cadastro',
    loadChildren: () => import('./cadastro/cadastro.module').then( m => m.CadastroPageModule)
  },
  {
    path: 'dados',
    loadChildren: () => import('./dados/dados.module').then( m => m.DadosPageModule)
  },
  {
    path: 'final-barb',
    loadChildren: () => import('./final-barb/final-barb.module').then( m => m.FinalBarbPageModule)
  },
  {
    path: 'login',
    loadChildren: () => import('./login/login.module').then( m => m.LoginPageModule)
  },
  {
    path: 'selec-barb',
    loadChildren: () => import('./selec-barb/selec-barb.module').then( m => m.SelecBarbPageModule)
  },
  {
    path: 'home-barb',
    loadChildren: () => import('./home-barb/home-barb.module').then( m => m.HomeBarbPageModule)
  },
  {
    path: 'data-barb',
    loadChildren: () => import('./data-barb/data-barb.module').then( m => m.DataBarbPageModule)
  },
  {
    path: 'barb-agen',
    loadChildren: () => import('./barb-agen/barb-agen.module').then( m => m.BarbAgenPageModule)
  },

];

@NgModule({
  imports: [
    RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules })
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
