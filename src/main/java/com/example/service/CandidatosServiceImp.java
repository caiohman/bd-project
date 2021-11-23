package com.example.service;

import com.example.model.Candidatos;
import com.example.model.Individuos;
import com.example.repository.CandidatosRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class CandidatosServiceImp implements CandidatosServiceInterface{
    private final CandidatosRepository candidatosRepository;
    private final IndividuosServiceImp individuosServiceImp;

    @Inject
    CandidatosServiceImp(CandidatosRepository candidatosRepository, IndividuosServiceImp individuosServiceImp) {
        this.candidatosRepository = candidatosRepository;
        this.individuosServiceImp = individuosServiceImp;
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

    @Override
    public List<Candidatos> listByRecord(boolean record) {
       List<Individuos> individuos = individuosServiceImp.listByRecord(record);
       ArrayList<Candidatos> candidatos = new ArrayList<>();

        for (Individuos individuo : individuos) {
            candidatos.add(candidatosRepository.findById(individuo.getCpf()));
        }

       return  candidatos;
    }


}
