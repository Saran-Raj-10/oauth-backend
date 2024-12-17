package com.example.oauthbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.oauthbackend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
