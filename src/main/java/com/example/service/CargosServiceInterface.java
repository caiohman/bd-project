package com.example.service;

import com.example.model.Cargos;

import java.util.List;

public interface CargosServiceInterface {

    List<Cargos> listAll();

    Cargos save(Cargos cargos);

    void delete(Cargos cargos);
}
