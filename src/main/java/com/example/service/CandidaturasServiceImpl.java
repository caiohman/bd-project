package com.example.service;

import com.example.model.Candidaturas;
import com.example.model.Cargos;
import com.example.model.Individuos;
import com.example.repository.CandidaturasRepository;
import io.quarkus.panache.common.Sort;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.NotFoundException;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class CandidaturasServiceImpl implements CandidaturasServiceInterface{

    private final CandidaturasRepository candidaturasRepository;
    private final IndividuosServiceImp individuosServiceImp;
    private final CargosServiceImpl cargosService;

    @Inject
    CandidaturasServiceImpl(CandidaturasRepository candidaturasRepository, IndividuosServiceImp individuosServiceImp ,
                            CargosServiceImpl cargosService) {
        this.candidaturasRepository = candidaturasRepository;
        this.individuosServiceImp = individuosServiceImp;
        this.cargosService = cargosService;
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
            throw new NotFoundException();
        }
       return candidaturasRepository.list("cpf" , individuos.getCpf());
    }

    @Override
    public List<Candidaturas> listByJobPosition(String job) {
        List<Cargos> cargos = cargosService.listByName(job);
        ArrayList<Candidaturas> candidaturas = new ArrayList<>();

        for(Cargos cargo : cargos) {
          candidaturas.add(candidaturasRepository.findById(cargo.getIdCargo()));
        }

        return candidaturas;
    }

    @Override
    public List<Candidaturas> listOrder(String attr) {
        return candidaturasRepository.list("order by ?1" , attr);
    }


}
