package com.example.repository;

import com.example.model.Candidatos;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CandidatosRepository implements PanacheRepository<Candidatos> {
}
