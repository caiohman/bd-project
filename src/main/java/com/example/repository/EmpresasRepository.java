package com.example.repository;

import com.example.model.Empresas;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EmpresasRepository implements PanacheRepository<Empresas> {
}
