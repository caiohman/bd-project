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
@Table(name = "cargos")
public class Cargos {

    @Id
    @Column(name = "idCargo", nullable = false)
    private long idCargo;

    @Column(name = "nome" , nullable = false)
    @Size(max = 40)
    @NotBlank
    private String nome;

    @Column(name = "tipoCargo" , nullable = false)
    @Size(max = 9)
    @NotBlank
    private String tipoCargo;

    @Column(name = "referencia" , nullable = false)
    @Size(max = 30)
    @NotBlank
    private String referencia;

    @Column(name = "qtdEleitos" , nullable = false)
    @NotBlank
    private Integer qtdEleitos;

}
