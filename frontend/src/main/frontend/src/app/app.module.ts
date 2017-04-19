import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {FormsModule} from '@angular/forms';
import {HttpModule} from '@angular/http';
import {MaterializeModule} from 'angular2-materialize';


/* App Root - Componente Principal */
import {AppComponent} from './app.component';

/* Routing */
import {AppRoutingModule} from './app-routing.module';
/* Feature Modules -- modulos secundarios */
import {HomeModule} from './home/home.module';
import {FooterComponent} from './footer/footer.component';

@NgModule({
  declarations: [ // TODO -- ?? pendiente ??
    AppComponent,
    FooterComponent
  ],
  imports: [
    // modulo para render
    BrowserModule,
    // modulo para formularios
    FormsModule,
    // modulo para consumo de servicios rest
    HttpModule,
    // modulo para el estilo Materialized
    MaterializeModule,
    // modulo principal de routing
    AppRoutingModule,
    // modulos secundarios
    HomeModule
  ],
  // objetos para el inyector de dependencias
  providers: [],
  // arranca el componente principal
  bootstrap: [AppComponent, FooterComponent]
})
export class AppModule {
}
