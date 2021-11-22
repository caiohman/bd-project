package com.example.repository;

import com.example.model.Partidos;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PartidosRepository implements PanacheRepository<Partidos> {

}
