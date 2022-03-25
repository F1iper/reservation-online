package com.reservationonline.client.domain.repository;

import com.reservationonline.client.domain.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    void deleteById(Long id);
}
