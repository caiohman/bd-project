package com.example.repository;

import com.example.model.Apoio;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ApoioRepository implements PanacheRepository<Apoio> {
}
