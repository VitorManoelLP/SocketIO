package com.socketio.socket.resource;

import com.socketio.socket.service.MessagingService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.messaging.simp.SimpMessagingTemplate;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;

public class MessagingServiceTest {

    private AutoCloseable closeable;

    @InjectMocks
    private MessagingService messagingService;

    @Mock
    private SimpMessagingTemplate simpMessagingTemplate;

    @BeforeEach
    public void setup() {
        closeable = MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    public void teardown() throws Exception {
        closeable.close();
    }

    @Test
    public void onSocket() {
        messagingService.sendMessageOnTopic("topic", "message");
        verify(simpMessagingTemplate, atLeastOnce()).convertAndSend("topic", "message");
    }

}
