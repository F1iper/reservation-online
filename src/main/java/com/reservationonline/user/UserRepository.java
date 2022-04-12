package com.reservationonline.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    
    Optional<User> findByEmail(String email);
    
    @Transactional
    @Modifying
    @Query("UPDATE User a " +
            "SET a.enabled = TRUE " +
            "WHERE a.email = ?1")
    void enableUser(String email);
}
