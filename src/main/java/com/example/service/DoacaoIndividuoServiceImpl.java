package com.example.service;

import com.example.model.DoacaoIndividuo;
import com.example.repository.DoacaoIndividuoRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class DoacaoIndividuoServiceImpl implements DoacaoIndividuoServiceInterface{

    private final DoacaoIndividuoRepository doacaoIndividuoRepository;

    @Inject
    DoacaoIndividuoServiceImpl(DoacaoIndividuoRepository doacaoIndividuoRepository) {
        this.doacaoIndividuoRepository = doacaoIndividuoRepository;
    }


    @Override
    public List<DoacaoIndividuo> listAll() {
        return doacaoIndividuoRepository.listAll();
    }

    @Override
    @Transactional
    public DoacaoIndividuo save(DoacaoIndividuo doacaoIndividuo) {
        doacaoIndividuoRepository.persist(doacaoIndividuo);
        return doacaoIndividuo;
    }

    @Override
    @Transactional
    public void delete(DoacaoIndividuo doacaoIndividuo) {
        doacaoIndividuoRepository.delete(doacaoIndividuo);
    }

    @Override
    public DoacaoIndividuo findById(long cpf) {
        return doacaoIndividuoRepository.findById(cpf);
    }
}
