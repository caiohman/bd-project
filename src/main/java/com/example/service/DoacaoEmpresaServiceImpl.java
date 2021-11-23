package com.example.service;

import com.example.model.DoacaoEmpresa;
import com.example.repository.DoacaoEmpresaRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class DoacaoEmpresaServiceImpl implements DoacaoEmpresaServiceInterface{

    private final DoacaoEmpresaRepository doacaoEmpresaRepository;

    DoacaoEmpresaServiceImpl(DoacaoEmpresaRepository doacaoEmpresaRepository) {
        this.doacaoEmpresaRepository = doacaoEmpresaRepository;
    }

    @Override
    public List<DoacaoEmpresa> listAll() {
        return doacaoEmpresaRepository.listAll();
    }

    @Override
    @Transactional
    public DoacaoEmpresa save(DoacaoEmpresa doacaoEmpresa) {
        doacaoEmpresaRepository.persist(doacaoEmpresa);
        return doacaoEmpresa;
    }

    @Override
    @Transactional
    public void delete(DoacaoEmpresa doacaoEmpresa) {
        doacaoEmpresaRepository.delete(doacaoEmpresa);
    }

    @Override
    public DoacaoEmpresa findById(long cnpj) {
        return doacaoEmpresaRepository.findById(cnpj);
    }
}
