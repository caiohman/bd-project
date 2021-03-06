package com.example.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "doadores")
public class Doadores {
    @Id
    @JoinColumn(name = "individuos")
    private long cpf;

    @Column(name = "fonteDeRenda")
    @Size(max = 30)
    @NotBlank
    private String fonteDeRenda;
}
