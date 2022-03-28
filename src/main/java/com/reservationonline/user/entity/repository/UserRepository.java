package com.reservationonline.user.entity.repository;

import com.reservationonline.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
