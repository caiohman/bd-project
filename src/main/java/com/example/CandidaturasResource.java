package com.example;

import com.example.model.Candidaturas;
import com.example.service.CandidaturasServiceImpl;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/candidaturas")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CandidaturasResource {

    private final CandidaturasServiceImpl candidaturasService;

    @Inject
    CandidaturasResource(CandidaturasServiceImpl candidaturasService) {
        this.candidaturasService = candidaturasService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Candidaturas> listCandidaturas() {
        return candidaturasService.listAll();
    }

    @POST
    @Transactional
    public Candidaturas createCandidaturas(Candidaturas candidaturas) {
        return candidaturasService.save(candidaturas);
    }

    @DELETE
    @Transactional
    public void deleteCandidaturas(Candidaturas candidaturas) {
        candidaturasService.delete(candidaturas);
    }
}
