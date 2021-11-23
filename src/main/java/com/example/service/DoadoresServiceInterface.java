package com.example.service;

import com.example.model.Doadores;

import java.util.List;

public interface DoadoresServiceInterface {
    List<Doadores> listAll();

    Doadores save(Doadores doadores);

    void delete(Doadores doadores);
}
