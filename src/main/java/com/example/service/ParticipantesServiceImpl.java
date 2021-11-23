package com.example.service;

import com.example.model.Participantes;
import com.example.repository.ParticipantesRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class ParticipantesServiceImpl implements ParticipantesServiceInterface{

    private final ParticipantesRepository participantesRepository;

    ParticipantesServiceImpl(ParticipantesRepository participantesRepository) {
        this.participantesRepository = participantesRepository;
    }

    @Override
    public List<Participantes> listAll() {
        return participantesRepository.listAll();
    }

    @Override
    @Transactional
    public Participantes save(Participantes participantes) {
        participantesRepository.persist(participantes);
        return participantes;
    }

    @Override
    @Transactional
    public void delete(Participantes participantes) {
        participantesRepository.delete(participantes);
    }

    @Override
    public Participantes findById(long cpf) {
        return participantesRepository.findById(cpf);
    }
}
