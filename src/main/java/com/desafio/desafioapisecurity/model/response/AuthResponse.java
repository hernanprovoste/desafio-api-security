package com.desafio.desafioapisecurity.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthResponse {
    String id;
    Date crated;
    Date modified;
    Date last_login;
    String token;
    boolean isactive;
}
