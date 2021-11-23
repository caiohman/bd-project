package com.example.service;

import com.example.model.Candidaturas;
import com.example.model.Individuos;
import com.example.repository.CandidaturasRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class CandidaturasServiceImpl implements CandidaturasServiceInterface{

    private final CandidaturasRepository candidaturasRepository;
    private final IndividuosServiceImp individuosServiceImp;

    @Inject
    CandidaturasServiceImpl(CandidaturasRepository candidaturasRepository, IndividuosServiceImp individuosServiceImp) {
        this.candidaturasRepository = candidaturasRepository;
        this.individuosServiceImp = individuosServiceImp;

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
    public List<Candidaturas> listByYear(Integer ano) {
        return candidaturasRepository.list("ano" , ano);
    }

    @Override
    public List<Candidaturas> listByName(String name) {
        Individuos individuos = individuosServiceImp.findByName(name);

        if (individuos == null ) {
            System.out.println("Nada aqui");
        }
       return candidaturasRepository.list("cpf" , individuos.getCpf());
    }

}
