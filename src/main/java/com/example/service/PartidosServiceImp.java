package com.example.service;

import com.example.model.Partidos;
import com.example.repository.PartidosRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class PartidosServiceImp implements PartidosServiceInterface{

    private final PartidosRepository partidosRepository;

    @Inject
    PartidosServiceImp(PartidosRepository partidosRepository) {
        this.partidosRepository = partidosRepository;
    }

    @Override
    public List<Partidos> listAll() {
        return partidosRepository.listAll();
    }

    @Transactional
    @Override
    public Partidos save(Partidos partidos) {
        partidosRepository.persist(partidos);
        return partidos;
    }

    @Transactional
    @Override
    public void delete(Partidos partidos) {
        partidosRepository.delete(partidos);
    }

    @Override
    public Partidos findByName(String sigla) {
        return partidosRepository.find("sigla" , sigla).firstResult();
    }


}
