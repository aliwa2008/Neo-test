import { AppModule } from './../../../Neopolis/src/app/app.module';
import { AppComponent } from './app.component';
import { AddUserComponent } from './add-user/add-user.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {
    path: 'home',
    loadChildren: () => import('./app.component').then( m => m.AppComponent)
  },

  {
    path: '',
    redirectTo: 'home',
    pathMatch: 'full'
  },  {path:'add',component:AddUserComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
