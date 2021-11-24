package com.example.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "doacaoIndividuo")
public class DoacaoIndividuo {

    @Id
    @JoinColumn(name = "doadores")
    private long cpf;

    @Column(name = "idcandidatura" , nullable = false)
    @JoinColumn(name = "candidaturas")
    @NotBlank
    private long idcandidatura;

    @Column(name = "dataDoacao" , nullable = false)
    @NotBlank
    private LocalDate dataDoacao;

    @Column(name = "valor" , nullable = false)
    @NotBlank
    private float valor;

}
