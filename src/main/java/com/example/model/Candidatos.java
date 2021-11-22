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
    private Long cpf;

    @Column(name = "vice")
    @Size(max = 45)
    @NotBlank
    private String vice;
}
