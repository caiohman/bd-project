package com.example;

import com.example.model.Apoio;
import com.example.service.ApoioServiceImpl;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/apoio")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ApoioResource {

    private final ApoioServiceImpl apoioService;

    @Inject
    ApoioResource(ApoioServiceImpl apoioService) {
        this.apoioService = apoioService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Apoio> listApoio() {
        return apoioService.listAll();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{idequipe}")
    public Apoio listApoioById(@PathParam("idequipe") Long idequipe) {
        Apoio entity = apoioService.findById(idequipe);

        if(entity == null) {
            throw new NotFoundException();
        }
        else {
            return entity;
        }
    }

    @POST
    @Transactional
    public Apoio createApoio(Apoio apoio) {
        return apoioService.save(apoio);
    }

    @DELETE
    @Transactional
    @Path("/{idequipe}")
    public void deleteApoio(@PathParam("idequipe") Long idequipe) {
        Apoio entity = apoioService.findById(idequipe);

        if(entity == null) {
            throw new NotFoundException();
        }
        else {
            apoioService.delete(entity);
        }
    }
}
