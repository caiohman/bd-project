package com.example;


import com.example.model.Participantes;
import com.example.service.ParticipantesServiceImpl;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/participantes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ParticipantesResources {

    private final ParticipantesServiceImpl participantesService;

    @Inject
    ParticipantesResources(ParticipantesServiceImpl participantesService) {
        this.participantesService = participantesService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Participantes> listParticipantes() {
        return participantesService.listAll();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{cpf}")
    public Participantes listParticipantesById(@PathParam("cpf") Long cpf) {
        Participantes entity = participantesService.findById(cpf);

        if(entity == null) {
            throw new NotFoundException();
        }
        else {
            return entity;
        }
    }

    @POST
    @Transactional
    public Participantes createParticipantes(Participantes participantes) {
        return participantesService.save(participantes);
    }

    @DELETE
    @Transactional
    @Path("/{cpf}")
    public void deleteParticipantes(@PathParam("cpf") Long cpf) {
        Participantes entity = participantesService.findById(cpf);

        if(entity == null) {
            throw new NotFoundException();
        }
        else {
            participantesService.delete(entity);
        }
    }
}
