package com.desafio.desafioapisecurity.services;

import com.desafio.desafioapisecurity.model.LoginRequest;
import com.desafio.desafioapisecurity.model.PhonesRequest;
import com.desafio.desafioapisecurity.model.Role;
import com.desafio.desafioapisecurity.model.UserRequest;
import com.desafio.desafioapisecurity.model.response.AuthResponse;
import com.desafio.desafioapisecurity.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;

    public AuthResponse login(LoginRequest request) {
        return null;
    }

    public AuthResponse register(UserRequest request) {
        UserRequest user = UserRequest.builder()
                .email(request.getEmail())
                .password(request.getPassword())
                .name(request.getName())
                .role(Role.ADMIN)
                .build();

        userRepository.save(user);

        return AuthResponse.builder().token(jwtService.getToken(user)).build();
    }
}
