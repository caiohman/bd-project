package com.example.repository;

import com.example.model.Processos;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProcessosRepository implements PanacheRepository<Processos> {
}
