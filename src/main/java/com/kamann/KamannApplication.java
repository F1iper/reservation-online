package com.kamann;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KamannApplication {
    public static void main(String[] args) {

//        Client client = new Client(1L, "John", "Doe", Date.from(Instant.now()), "password", "124314135", "male", new Address(700900800, "test@test.com", "Pulawska", "53b", "02-508", "Warsaw"));
//        System.out.println("id: " + client.getId() + " created at: " + client.getCreatedAt() + " info " + client.getAddress());
    SpringApplication.run(KamannApplication.class, args);
    }

}
