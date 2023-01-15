package com.socketio.socket.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessagingService {

    @Autowired
    private SimpMessagingTemplate template;

    public void sendMessageOnTopic(String topic, String message) {
        template.convertAndSend(topic, message);
    }

}
