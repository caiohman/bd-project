package com.example.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@Table(name = "participantesEquipe")
public class Participantes {

    @Id
    @JoinColumn(name = "individuos")
    private long cpf;

    @Column(name = "ano" , nullable = false)
    @NotBlank
    private Integer ano;

    @Column(name = "idequipe" , nullable = false)
    @JoinColumn(name = "equipeApoio")
    @NotBlank
    private Integer idEquipe;

}
