package com.example.repository;

import com.example.model.DoacaoIndividuo;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DoacaoIndividuoRepository implements PanacheRepository<DoacaoIndividuo> {
}
