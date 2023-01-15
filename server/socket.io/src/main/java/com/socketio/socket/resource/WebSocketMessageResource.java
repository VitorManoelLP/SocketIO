package com.socketio.socket.resource;

import com.socketio.socket.dto.MessageDTO;
import com.socketio.socket.service.MessagingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/socket-io")
public class WebSocketMessageResource {

    private final MessagingService messagingService;

    @PostMapping("/send")
    public void sendMessageOnTopic(@RequestBody MessageDTO messageDTO) {
        messagingService.sendMessageOnTopic(messageDTO.getTopic(), messageDTO.getMessage());
    }

}
