package com.example.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "candidatos")
public class Candidatos {
    @Id
    @JoinColumn(name = "individuos")
    private long cpf;

    @Column(name = "temVice" , nullable = false)
    @NotBlank
    private boolean temVice;

    @Column(name = "viceCandidato")
    @Size(max = 40)
    @NotBlank
    private String viceCandidato;

    @Column(name = "sigla")
    @Size(max = 4)
    @NotBlank
    @JoinColumn(name = "partidos")
    private String sigla;

}
