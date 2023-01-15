import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import {SocketIoService} from "./socketIO/socket-io.service";

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [SocketIoService],
  bootstrap: [AppComponent]
})
export class AppModule { }
