package com.kamann.client.repository;

import com.kamann.client.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    void deleteById(Long id);
}
