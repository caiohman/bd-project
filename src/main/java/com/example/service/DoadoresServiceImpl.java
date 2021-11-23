package com.example.service;

import com.example.model.Doadores;
import com.example.repository.DoadoresRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class DoadoresServiceImpl implements DoadoresServiceInterface{

    private final DoadoresRepository doadoresRepository;

    @Inject
    DoadoresServiceImpl(DoadoresRepository doadoresRepository) {
        this.doadoresRepository = doadoresRepository;
    }

    @Override
    public List<Doadores> listAll() {
        return doadoresRepository.listAll();
    }

    @Override
    @Transactional
    public Doadores save(Doadores doadores) {
        doadoresRepository.persist(doadores);
        return doadores;
    }

    @Override
    @Transactional
    public void delete(Doadores doadores) {
        doadoresRepository.delete(doadores);
    }
}
