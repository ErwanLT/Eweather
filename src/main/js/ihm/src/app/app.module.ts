import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';

import {WeatherServiceService} from './services/weather-service.service';

import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { ServiceWorkerModule } from '@angular/service-worker';
import { environment } from '../environments/environment';
import {MatTabsModule} from '@angular/material/tabs';
import {MatExpansionModule} from '@angular/material/expansion';
import { LeafletModule } from '@asymmetrik/ngx-leaflet';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import {ForecastComponent} from './forecast/forecast.component';
import {CurrentlyComponent} from './currently/currently.component';
import {HourlyComponent} from './hourly/hourly.component';
import {DailyComponent} from './daily/daily.component';
import {FormComponent} from './form/form.component';
import {FooterComponent} from './footer/footer.component';
import {MapComponent} from './map/map.component';

@NgModule({
  declarations: [
    AppComponent,
    ForecastComponent,
    CurrentlyComponent,
    HourlyComponent,
    DailyComponent,
    FormComponent,
    FooterComponent,
    MapComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        HttpClientModule,
        FormsModule,
        NgbModule,
        BrowserAnimationsModule,
        ServiceWorkerModule.register('ngsw-worker.js', {enabled: environment.production}),
        MatTabsModule,
        MatExpansionModule,
        LeafletModule,
        FontAwesomeModule
    ],
  providers: [WeatherServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
