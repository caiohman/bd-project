package com.example.service;

import com.example.model.Empresas;
import com.example.repository.EmpresasRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class EmpresasServiceImpl implements EmpresasServiceInterface{

    private final EmpresasRepository empresasRepository;

    @Inject
    EmpresasServiceImpl(EmpresasRepository empresasRepository) {
        this.empresasRepository = empresasRepository;
    }


    @Override
    public List<Empresas> listAll() {
        return empresasRepository.listAll();
    }

    @Override
    @Transactional
    public Empresas save(Empresas empresas) {
        empresasRepository.persist(empresas);
        return empresas;
    }

    @Override
    @Transactional
    public void delete(Empresas empresas) {
        empresasRepository.delete(empresas);
    }

    @Override
    public Empresas findById(long cnpj) {
        return empresasRepository.findById(cnpj);
    }
}
