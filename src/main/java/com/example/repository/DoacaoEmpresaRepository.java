package com.example.repository;

import com.example.model.DoacaoEmpresa;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DoacaoEmpresaRepository implements PanacheRepository<DoacaoEmpresa> {
}
