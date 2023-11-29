package com.desafio.desafioapisecurity.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_phones")
public class PhonesRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String number;
    private String citycode;
    private String contrycode;
}
