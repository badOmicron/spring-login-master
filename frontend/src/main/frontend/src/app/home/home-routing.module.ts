import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {HomeComponent} from './home.component';

/**
 * URL` para el modulo HOME
 * @type {[{path: string; component: HomeComponent}]}
 */
const routes: Routes = [
  /**
   * la URL /server:port/home nos llevara al componente HomeComponent
   */
  {path: 'home', component: HomeComponent}
];

/**
 * A diferencia del modulo principal de ruteo, aqui se hace uso del metodo estatico forChild, con esto se
 * arrojan las rutas del hijo al Módulo Padre.
 *
 * Es importante señalar que en modulos secundarios siempre se debe usar forChild
 */
@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule] // y deben estar expuestos
})
export class HomeRoutingModule {
}
