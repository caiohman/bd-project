package com.example.service;

import com.example.model.Processos;

import java.util.List;

public interface ProcessosServiceInterface {

    List<Processos> listAll();

    Processos save(Processos processos);

    void delete(Processos processos);

    Processos findById(long cpf);
}
