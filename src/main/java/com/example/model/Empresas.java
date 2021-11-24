package com.example.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "empresas")
public class Empresas {

    @Id
    private long cnpj;

    @Column(name = "nome" , nullable = false)
    @Size(max = 40)
    @NotBlank
    private String nome;

    @Column(name = "estado" , nullable = false)
    @Size(max = 2)
    @NotBlank
    private String estado;

    @Column(name = "cidade" , nullable = false)
    @Size(max = 30)
    @NotBlank
    private String cidade;

    @Column(name = "dataFundacao" , nullable = false)
    @NotBlank
    private LocalDate dataFundacao;

}
