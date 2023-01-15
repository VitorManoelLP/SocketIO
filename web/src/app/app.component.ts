import {Component, OnInit} from '@angular/core';
import {SocketIoService} from "./socketIO/socket-io.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'socket-io';
}
