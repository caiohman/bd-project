package com.example.service;

import com.example.model.Cargos;
import com.example.repository.CargosRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class CargosServiceImpl implements  CargosServiceInterface{

    private final CargosRepository cargosRepository;

    @Inject
    CargosServiceImpl(CargosRepository cargosRepository) {
        this.cargosRepository = cargosRepository;
    }

    @Override
    public List<Cargos> listAll() {
        return cargosRepository.listAll();
    }

    @Transactional
    @Override
    public Cargos save(Cargos cargos) {
        cargosRepository.persist(cargos);
        return cargos;
    }

    @Transactional
    @Override
    public void delete(Cargos cargos) {
        cargosRepository.delete(cargos);
    }

    @Override
    public Cargos findById(long idCargo) {
        return cargosRepository.findById(idCargo);
    }

    @Override
    public List<Cargos> listByName(String name) {
        return cargosRepository.list("nome" , name);
    }
}
