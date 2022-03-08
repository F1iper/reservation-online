package com.reservationonline.client.domain.service.client;

public interface ClientDeleteService {

    boolean deleteIfIdExists(Long id);

    boolean clientListIsEmpty();
}
