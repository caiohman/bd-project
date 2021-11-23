package com.example.service;

import com.example.model.Empresas;

import java.util.List;

public interface EmpresasServiceInterface {

    List<Empresas> listAll();

    Empresas save(Empresas empresas);

    void delete(Empresas empresas);

    Empresas findById(long cnpj);

}
