package com.socketio.socket.resource;

import com.socketio.socket.service.MessagingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SocketResource {

    @Autowired
    private MessagingService messagingService;

    @MessageMapping("/on-socket/{topic}")
    public void onSocket(@Payload String message, @PathVariable String topic) {
        messagingService.sendMessageOnTopic(String.format("/topic/%s", topic), message);
    }

}
