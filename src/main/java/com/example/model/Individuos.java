package com.example.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "individuos")
public class Individuos {
    @Id
    private long cpf;

    @Column(name = "nome" , nullable = false)
    @Size(max = 40)
    @NotBlank
    private String nome;

    @Column(name = "estado")
    @Size(max = 2)
    @NotBlank
    private String estado;

    @Column(name = "cidade")
    @Size(max = 30)
    @NotBlank
    private String cidade;

    @Column(name = "dataNascimento")
    @NotBlank
    private LocalDate dataNascimento;

    @Column(name = "fichaLimpa")
    @NotBlank
    private boolean fichaLimpa;

    @Column(name = "tipo")
    @Size(max = 9)
    @NotBlank
    private String tipo;
}
