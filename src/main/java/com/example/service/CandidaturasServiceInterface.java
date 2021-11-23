package com.example.service;

import com.example.model.Candidaturas;

import java.util.List;

public interface CandidaturasServiceInterface {

    List<Candidaturas> listAll();

    Candidaturas save(Candidaturas candidaturas);

    void delete(Candidaturas candidaturas);

    Candidaturas findById(long idcandidatura);

    List<Candidaturas> listBy(Integer ano);
}
