package com.example.repository;

import com.example.model.Cargos;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CargosRepository implements PanacheRepository<Cargos> {
}
