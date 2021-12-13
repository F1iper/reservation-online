package com.kamann.client.repository;

import com.kamann.client.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ClientRepository extends JpaRepository<User, Long> {

    void deleteById(UUID id);
}
