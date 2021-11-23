package com.example.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@Table(name = "doacaoEmpresa")
public class DoacaoEmpresa {

    @Id
    @JoinColumn(name = "empresas")
    private long cnpj;

    @Column(name = "idcandidatura" , nullable = false)
    @JoinColumn(name = "candidaturas")
    @NotBlank
    private long idcandidatura;

    @Column(name = "ano" , nullable = false)
    @NotBlank
    private Integer ano;

    @Column(name = "valor" , nullable = false)
    @NotBlank
    private float valor;

}
