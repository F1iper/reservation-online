package com.kamann.client.controller;

import com.kamann.client.dto.ClientDto;
import lombok.Data;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest(showSql = true)
public abstract class ClientControllerTest {

    @Test
    void getClientById() {
        String text = "Test 1";

        Assertions.assertSame("Test 2", text);

    }

    @Test
    void getClients() {
    }

    @Test
    void createClient() {
    }

    @Test
    void deleteClient() {
    }
}