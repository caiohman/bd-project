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
@Table(name = "individuos")
public class Individuos {
    @Id
    private Long cpf;

    @Column(name = "tipo")
    @Size(max = 45)
    @NotBlank
    private String tipo;
}
