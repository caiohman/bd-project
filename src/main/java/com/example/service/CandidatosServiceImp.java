package com.example.service;

import com.example.model.Candidatos;
import com.example.repository.CandidatosRepository;
import io.quarkus.hibernate.orm.panache.PanacheQuery;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class CandidatosServiceImp implements CandidatosServiceInterface{
    private CandidatosRepository candidatosRepository;

    @Inject
    CandidatosServiceImp(CandidatosRepository candidatosRepository) {
        this.candidatosRepository = candidatosRepository;
    }

    @Override
    public List<Candidatos> listAll() {
        return candidatosRepository.listAll();
    }

    @Transactional
    @Override
    public Candidatos save(Candidatos candidatos) {
        this.candidatosRepository.persist(candidatos);
        return candidatos;
    }

    @Transactional
    @Override
    public void delete(Candidatos candidatos) {
        candidatosRepository.delete(candidatos);
    }

    @Override
    public Candidatos findById(Long cpf) {
        return candidatosRepository.findById(cpf);
    }


}
