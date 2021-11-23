package com.example.service;

import com.example.model.Apoio;
import com.example.repository.ApoioRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class ApoioServiceImpl implements ApoioServiceInterface{

    private final ApoioRepository apoioRepository;

    @Inject
    ApoioServiceImpl(ApoioRepository apoioRepository) {
        this.apoioRepository = apoioRepository;
    }

    @Override
    public List<Apoio> listAll() {
        return apoioRepository.listAll();
    }

    @Override
    @Transactional
    public Apoio save(Apoio apoio) {
        apoioRepository.persist(apoio);
        return apoio;
    }

    @Override
    @Transactional
    public void delete(Apoio apoio) {
        apoioRepository.delete(apoio);
    }

    @Override
    public Apoio findById(long idequipe) {
        return apoioRepository.findById(idequipe);
    }
}
