package com.example;

import com.example.model.Partidos;
import com.example.service.PartidosServiceImp;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/partidos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ExampleResource {

    private final PartidosServiceImp partidosServiceImp;

    @Inject
    ExampleResource(PartidosServiceImp partidosServiceImp ) {
        this.partidosServiceImp = partidosServiceImp;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Partidos> listPartidos() {
        return partidosServiceImp.listAll();
    }

    @POST
    @Transactional
    public Partidos createPartidos(Partidos partidos) {
        return partidosServiceImp.save(partidos);
    }

}