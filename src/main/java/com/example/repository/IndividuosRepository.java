package com.example.repository;

import com.example.model.Individuos;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class IndividuosRepository implements PanacheRepository<Individuos> {
}
