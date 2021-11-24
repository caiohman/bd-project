package com.example.service;

import com.example.model.Processos;
import com.example.repository.ProcessosRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class ProcessosServiceImpl implements ProcessosServiceInterface{

    private final ProcessosRepository processosRepository;

    @Inject
    ProcessosServiceImpl(ProcessosRepository processosRepository) {
        this.processosRepository = processosRepository;
    }


    @Override
    public List<Processos> listAll() {
        return processosRepository.listAll();
    }

    @Override
    @Transactional
    public Processos save(Processos processos) {
        processosRepository.persist(processos);
        return processos;
    }

    @Override
    @Transactional
    public void delete(Processos processos) {
        processosRepository.delete(processos);
    }

    @Override
    public Processos findById(long idProcesso) {
        return processosRepository.findById(idProcesso);
    }
}
