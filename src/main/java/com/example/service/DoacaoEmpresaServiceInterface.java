package com.example.service;

import com.example.model.DoacaoEmpresa;

import java.util.List;

public interface DoacaoEmpresaServiceInterface {

    List<DoacaoEmpresa> listAll();

    DoacaoEmpresa save(DoacaoEmpresa doacaoEmpresa);

    void delete(DoacaoEmpresa doacaoEmpresa);

    DoacaoEmpresa findById(long cnpj);
}
