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

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{cpf}")
    public Individuos listIndividuosById(@PathParam("cpf") Long cpf) {
        Individuos entity = individuosServiceImp.findById(cpf);

        if(entity == null) {
            throw new NotFoundException();
        }
        else {
            return entity;
        }
    }

    @POST
    @Transactional
    public Individuos createIndividuos(Individuos individuos) {
        return individuosServiceImp.save(individuos);
    }

    @DELETE
    @Transactional
    @Path("/{cpf}")
    public void deleteIndividuos(@PathParam("cpf") Long cpf) {
        Individuos entity = individuosServiceImp.findById(cpf);

        if(entity == null) {
            throw new NotFoundException();
        }
        else {
            individuosServiceImp.delete(entity);
        }

    }
}
