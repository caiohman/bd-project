package com.example.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "equipeApoio")
public class Apoio {
    @Id
    private long idequipe;

    @Column(name = "nome" , nullable = false)
    @Size(max = 40)
    @NotBlank
    private String nome;

    @Column(name = "idcandidatura" , nullable = false)
    @JoinColumn(name = "candidaturas")
    @NotBlank
    private long idcandidatura;
}
