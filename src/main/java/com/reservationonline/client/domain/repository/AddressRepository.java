package com.reservationonline.client.domain.repository;

import com.reservationonline.client.domain.entitty.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
