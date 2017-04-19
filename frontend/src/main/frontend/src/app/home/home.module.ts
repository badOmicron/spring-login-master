import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {HomeComponent} from './home.component';
import {HomeRoutingModule} from './home-routing.module';
/**
 * Modulo para los componentens del home
 */
@NgModule({
  imports: [
    CommonModule,
    HomeRoutingModule  // se importa el douter que pertenece al modulo
  ],
  declarations: [HomeComponent]
})

export class HomeModule  {
}
