package com.example.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
@Table(name = "partidos")
public class Partidos {
    @Id
    private String sigla;

    @Column(name = "nome")
    @Size(max = 45)
    @NotBlank
    private String nome;

    @Column(name = "programa")
    @Size(max = 45)
    @NotBlank
    private String programa;
}
