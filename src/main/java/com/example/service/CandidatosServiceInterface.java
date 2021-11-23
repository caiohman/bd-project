package com.example.service;

import com.example.model.Candidatos;

import java.util.List;

public interface CandidatosServiceInterface {
    List<Candidatos> listAll();

    Candidatos save(Candidatos candidatos);

    void delete(Candidatos candidatos);

    Candidatos findById(Long cpf);
}
