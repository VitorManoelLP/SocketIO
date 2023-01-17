package com.socketio.socket.resource;

import com.socketio.socket.service.MessagingService;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(MockitoJUnitRunner.class)
public class SocketResourceTest {

    @InjectMocks
    private SocketResource resource;

    private MockMvc mockMvc;

    @Mock
    private MessagingService messagingService;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(resource).build();
    }

    @Test
    public void onSocket() {
        Assertions.assertThat("").isNotEmpty();
    }

}
