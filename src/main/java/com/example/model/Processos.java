package com.example.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "processosJudiciais")
public class Processos {

    @Id
    private long idprocesso;

    @Column(name = "procedente" , nullable = false)
    @NotBlank
    private boolean procedente;

    @Column(name = "julgado" , nullable = false)
    @NotBlank
    private boolean julgado;

    @Column(name = "dataTermino" )
    @NotBlank
    private LocalDate dataTermino;

    @Column(name = "cpf" , nullable = false)
    @JoinColumn(name = "individuos")
    @NotBlank
    private long cpf;

}
