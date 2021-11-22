package com.example;

import com.example.model.Candidatos;
import com.example.service.CandidatosServiceImp;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/candidatos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CandidatosResources {
    private final CandidatosServiceImp candidatosServiceImp;

    @Inject
    CandidatosResources(CandidatosServiceImp candidatosServiceImp) {
        this.candidatosServiceImp = candidatosServiceImp;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Candidatos> listCandidatos() {
        return candidatosServiceImp.listAll();
    }

    @POST
    @Transactional
    public Candidatos createCandidatos(Candidatos candidatos) {
        return candidatosServiceImp.save(candidatos);
    }
}
