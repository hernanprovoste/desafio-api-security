package com.desafio.desafioapisecurity.repository;

import com.desafio.desafioapisecurity.model.UserRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserRequest, String> {

    Optional<UserRequest> findByEmail(String email);
}
