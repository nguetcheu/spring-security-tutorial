package com.nguetcheSpring.springsecurityclient.repository;

import com.nguetcheSpring.springsecurityclient.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
