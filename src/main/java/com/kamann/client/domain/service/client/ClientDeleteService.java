package com.kamann.client.domain.service.client;

public interface ClientDeleteService {

    boolean deleteIfIdExists(Long id);

    boolean clientListIsEmpty();
}
