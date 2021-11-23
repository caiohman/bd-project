package com.example.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "candidaturas")
public class Candidaturas {

    @Id
    private long idcandidaturas;

    @Column(name = "cpf" , nullable = false)
    @Size(max = 14)
    @NotBlank
    private String cpf;

    @Column(name = "idCargo" , nullable = false)
    @NotBlank
    private long idCargo;

    @Column(name = "ano" , nullable = false)
    @NotBlank
    private Integer ano;

    @Column(name = "qtdVotos")
    @NotBlank
    private Integer qtdVotos;

}
