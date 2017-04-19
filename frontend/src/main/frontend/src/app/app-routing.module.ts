/**
 * Created by bhit on 15/04/17.
 *
 * Modulo con el routing Padre.
 * Este contiene la configuracion de las URL de la aplicacion.
 * Es necesario importar esta calse en la modulo principal de la app {app.module.ts}
 */

/**
 * Se importan los modulos base de angular.
 */
import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';


/**
 * Constante que almacena las rutas [URL] principales de la aplicacion.
 * @type {[{path: string; redirectTo: string; pathMatch: string},{path: string; redirectTo: string; pathMatch: string}]}
 */
export const routes: Routes = [

  {path: '', redirectTo: 'home', pathMatch: 'full'},

  /**
   Esta ruta  no esta definida aquí, está definida dentro del módulo contacto, dentro de su propio objeto de
   ruteo, home-routing.module.ts
   Esto es una buena práctica cuando los módulos definen su propio ruteo.
   */
  // {path: 'home', redirectTo: 'home', pathMatch: 'full'},

  /*Esta ruta usa lazy loading, esto le dice al enrutador en que modulos puede encontrar las rutas
   Una carga perezosa para un modulo escape indicada mediante una cadena String, esta cadena identifica ambos
   ArchivoModulo#ClaseModulo, separados por un #*/
  // {path: 'team', loadChildren: 'app/team/team.module#TeamModule'}

];

/**
 * Decorador para crea un modulo Angular
 */
@NgModule({
  /*forRoot -->  es un método estatico, que resguarda la configuración proporcionada y la expone por medio de un
   arreglo para hacer el 'ruteo' para los modulos correspondientes*/
  // Never call RouterModule.forRoot in a feature-routing module.
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
// Se exporta la clase para que otras clases puedan importarla
export class AppRoutingModule {
  /*La clase que retorna el modulo AppRoutingModule es una clase Route Module que contiene el Modulo de Ruteo así como las
   directivas necesarias para la inyección de dependencia para generar un objeto Router*/
}
