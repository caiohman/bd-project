package com.example.service;

import com.example.model.Individuos;

import java.util.List;

public interface IndividuoServiceInterface {

    //List all items from Individuo's table
    List<Individuos> listAll();

    Individuos save(Individuos individuos);

    void delete(Individuos individuos);

    Individuos findById(Long cpf);

    Individuos findByName(String name);

}
