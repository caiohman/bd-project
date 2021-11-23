package com.example.service;

import com.example.model.Apoio;

import java.util.List;

public interface ApoioServiceInterface {

    List<Apoio> listAll();

    Apoio save(Apoio apoio);

    void delete(Apoio apoio);

    Apoio findById(long idequipe);


}
