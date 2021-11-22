package com.example.service;

import com.example.model.Individuos;
import com.example.repository.IndividuosRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class IndividuosServiceImp implements IndividuoServiceInterface{

    private final IndividuosRepository individuosRepository;

    @Inject
    IndividuosServiceImp(IndividuosRepository individuosRepository) {
        this.individuosRepository = individuosRepository;
    }

    @Override
    public List<Individuos> listAll() {
       return this.individuosRepository.listAll();
    }

    @Override
    public Individuos save(Individuos individuos) {
        this.individuosRepository.persist(individuos);
        return individuos;
    }
}
