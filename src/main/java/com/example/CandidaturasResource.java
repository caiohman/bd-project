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
    @Path("/{idcandidatura}")
    public void deleteCandidaturas(@PathParam("idcandidatura") Long idcandidatura) {
        Candidaturas entity = candidaturasService.findById(idcandidatura);

        if(entity == null) {
            throw new NotFoundException();
        }
        else {
            candidaturasService.delete(entity);
        }
    }

    @GET
    @Path("/{ano}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Candidaturas> listByYear(@PathParam("ano") Integer ano) {
        return candidaturasService.listBy(ano);
    }

}
