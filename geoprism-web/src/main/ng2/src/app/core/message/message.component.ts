import { Component, OnInit } from '@angular/core';

import { EventService, IEventListener } from '../service/core.service';

@Component({
  
  selector: 'message',
  templateUrl: './message.component.html',
  styles: [
    '.error-container { text-align: center; border-width: 1px; border-color: #8c0000; border-style: solid; margin-left: 10%; margin-right: 10%; color: #8c0000; }',
    '.message-container { text-align: center; border-width: 1px; border-color: #106828; border-style: solid; margin-left: 10%; margin-right: 10%; color: #106828; }'
  ]
})
export class MessageComponent implements OnInit, IEventListener {
	
  private error: any = null;
  
  private message: string = "";

  constructor(private service: EventService) { }

  ngOnInit(): void {
    this.service.registerListener(this);
  }
  
  ngOnDestroy(): void {
    this.service.deregisterListener(this);
  }
  
  start(): void {
    this.error = null;
  }
  
  complete(): void {
    console.log('complete');
  }  
  
  onError(error: any): void {
    this.error = error;
  }
  
  onMessage(msg: string): void {
    this.message = msg;
  }
}
