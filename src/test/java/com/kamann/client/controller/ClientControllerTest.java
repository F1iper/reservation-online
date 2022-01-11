package com.kamann.client.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

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