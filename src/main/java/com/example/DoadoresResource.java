package com.example;

import com.example.model.Doadores;
import com.example.service.DoadoresServiceImpl;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/doadores")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DoadoresResource {

    private final DoadoresServiceImpl doadoresService;

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
    public void deleteDoadores(Doadores doadores) {
        doadoresService.delete(doadores);
    }
}
