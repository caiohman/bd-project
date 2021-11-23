package com.example.service;

import com.example.model.Participantes;

import java.util.List;

public interface ParticipantesServiceInterface {

    List<Participantes> listAll();

    Participantes save(Participantes participantes);

    void delete(Participantes participantes);

    Participantes findById(long cpf);
}
