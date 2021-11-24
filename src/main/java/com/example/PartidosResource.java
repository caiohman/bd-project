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
public class PartidosResource {

    private final PartidosServiceImp partidosServiceImp;

    @Inject
    PartidosResource(PartidosServiceImp partidosServiceImp ) {
        this.partidosServiceImp = partidosServiceImp;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Partidos> listPartidos() {
        return partidosServiceImp.listAll();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{sigla}")
    public Partidos listPartidosByName(@PathParam("sigla") String sigla) {
        Partidos entity = partidosServiceImp.findByName(sigla);

        if(entity == null) {
            throw new NotFoundException();
        }
        else {
            return entity;
        }
    }

    @POST
    @Transactional
    public Partidos createPartidos(Partidos partidos) {
        return partidosServiceImp.save(partidos);
    }

    @DELETE
    @Transactional
    @Path("/{nome}")
    public void deletePartidos(@PathParam("nome") String nome) {
        Partidos entity = partidosServiceImp.findByName(nome);

        if(entity == null) {
            throw new NotFoundException();
        }
        else {
            partidosServiceImp.delete(entity);
        }
    }

}