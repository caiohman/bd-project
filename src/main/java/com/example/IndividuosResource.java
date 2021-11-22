package com.example;

import com.example.model.Individuos;
import com.example.service.IndividuosServiceImp;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/individuos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class IndividuosResource {

    private final IndividuosServiceImp individuosServiceImp;

    @Inject
    IndividuosResource(IndividuosServiceImp individuosServiceImp) {
        this.individuosServiceImp = individuosServiceImp;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Individuos> listIndividuos() {
        return individuosServiceImp.listAll();
    }

    @POST
    @Transactional
    public Individuos createIndividuos(Individuos individuos) {
        return individuosServiceImp.save(individuos);
    }
}
