package com.example;

import com.example.model.Cargos;
import com.example.service.CargosServiceImpl;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/cargos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CargosResource {

    private final CargosServiceImpl cargosService;

    CargosResource(CargosServiceImpl cargosService) {
        this.cargosService = cargosService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Cargos> listCargos() { return cargosService.listAll(); }

    @POST
    @Transactional
    public Cargos createCargos(Cargos cargos) { return cargosService.save(cargos); }

    @DELETE
    @Transactional
    @Path("/{id}")
    public void deleteCargos(Cargos cargos) {

        cargosService.delete(cargos);
    }
}
