package com.example.service;

import com.example.model.DoacaoIndividuo;

import java.util.List;

public interface DoacaoIndividuoServiceInterface {

    List<DoacaoIndividuo> listAll();

    DoacaoIndividuo save(DoacaoIndividuo doacaoIndividuo);

    void delete(DoacaoIndividuo doacaoIndividuo);

    DoacaoIndividuo findById(long cpf);
}
