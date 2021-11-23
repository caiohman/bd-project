package com.example.service;

import com.example.model.Candidaturas;
import com.example.repository.CandidaturasRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class CandidaturasServiceImpl implements CandidaturasServiceInterface{

    private final CandidaturasRepository candidaturasRepository;

    @Inject
    CandidaturasServiceImpl(CandidaturasRepository candidaturasRepository) {
        this.candidaturasRepository = candidaturasRepository;
    }

    @Override
    public List<Candidaturas> listAll() {
        return candidaturasRepository.listAll();
    }

    @Transactional
    @Override
    public Candidaturas save(Candidaturas candidaturas) {
        candidaturasRepository.persist(candidaturas);
        return candidaturas;
    }

    @Transactional
    @Override
    public void delete(Candidaturas candidaturas) {
        candidaturasRepository.delete(candidaturas);
    }

    @Override
    public Candidaturas findById(long idcandidatura) {
        return candidaturasRepository.findById(idcandidatura);
    }

    @Override
    public List<Candidaturas> listBy(Integer ano) {
        return candidaturasRepository.list("ano" , ano);
    }


}
