package com.socketio.socket.resource;

import com.socketio.socket.service.MessagingService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class SocketResourceTest {

    @InjectMocks
    private SocketResource resource;

    private MockMvc mockMvc;

    private AutoCloseable closeable;

    @Mock
    private MessagingService messagingService;

    @BeforeEach
    public void setup() {
        closeable = MockitoAnnotations.openMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(resource).build();
    }

    @AfterEach
    public void teardown() throws Exception {
        closeable.close();
    }

    @Test
    public void onSocket() {
        Assertions.assertThat("").isNotEmpty();
    }

}
