package com.example;

import com.example.model.Doadores;
import com.example.service.DoadoresServiceImpl;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/doadores")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DoadoresResource {

    private final DoadoresServiceImpl doadoresService;

    @Inject
    DoadoresResource(DoadoresServiceImpl doadoresService ){
        this.doadoresService = doadoresService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Doadores> listDoadores() {
        return doadoresService.listAll();
    }

    @POST
    @Transactional
    public Doadores createDoadores(Doadores doadores) {
        return doadoresService.save(doadores);
    }

    @DELETE
    @Transactional
    @Path("/{cpf}")
    public void deleteDoadores(@PathParam("cpf") Long cpf) {
        Doadores entity = doadoresService.findById(cpf);

        if(entity == null) {
            throw new NotFoundException();
        }
        else {
            doadoresService.delete(entity);
        }
    }
}
