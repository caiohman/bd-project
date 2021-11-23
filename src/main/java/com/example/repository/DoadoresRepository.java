package com.example.repository;

import com.example.model.Doadores;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DoadoresRepository implements PanacheRepository<Doadores> {
}
