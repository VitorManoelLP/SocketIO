import { Injectable } from '@angular/core';
import * as Stomp from 'stompjs';
// @ts-ignore
import SockJS = require("sockjs-client");

@Injectable()
export class SocketIoService {

  public message: string;
  private url: string = 'http://localhost:8080/socket-io';
  private stompClient: any;

  public on(topic: string) {
    const ws = new SockJS(this.url);
    this.stompClient = Stomp.over(ws);
    let that = this;
    this.stompClient.connect({}, () => {
      that.stompClient.subscribe(`/topic/${topic}`, (message: any) => {
        if(message.body) {
          this.message = message.body;
        }
      });
    });
  }

  public send(message: string, topic: string) {
    this.stompClient.send(`/app/on-socket/${topic}`, {}, JSON.stringify(message));
  }

}
