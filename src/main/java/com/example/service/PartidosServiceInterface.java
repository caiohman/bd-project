package com.example.service;

import com.example.model.Partidos;
import java.util.List;

public interface PartidosServiceInterface {

    //List all items from Partidos's table
    List<Partidos> listAll();

    Partidos save(Partidos partidos);

}
