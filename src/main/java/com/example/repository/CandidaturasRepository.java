package com.example.repository;

import com.example.model.Candidaturas;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CandidaturasRepository implements PanacheRepository<Candidaturas> {
}
