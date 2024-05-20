package dio.challenge.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClientTest {
    Client client = new Client.ClientBuilder()
            .name("Joao Pedro")
            .birthdate("1982-10-17")
            .healthProblems(new ArrayList<>())
            .createdAt(LocalDateTime.now())
            .updatedAt(LocalDateTime.now())
            .build();

    @Test
    public void testClientBuilder() {
        assertEquals("Joao Pedro", client.getName());

    }
}
