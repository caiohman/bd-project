package com.example.service;

import com.example.model.Individuos;
import com.example.repository.IndividuosRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
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

    @Transactional
    @Override
    public Individuos save(Individuos individuos) {
        this.individuosRepository.persist(individuos);
        return individuos;
    }

    @Transactional
    @Override
    public void delete(Individuos individuos) {
        individuosRepository.delete(individuos);
    }

    @Override
    public Individuos findById(Long cpf) {
        return individuosRepository.findById(cpf);
    }


}
