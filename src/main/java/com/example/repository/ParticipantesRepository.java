package com.example.repository;

import com.example.model.Participantes;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ParticipantesRepository implements PanacheRepository<Participantes> {
}
