package com.example;

import com.example.model.Processos;
import com.example.service.ProcessosServiceImpl;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/processos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProcessosResource {

    private final ProcessosServiceImpl processosService;

    ProcessosResource(ProcessosServiceImpl processosService) {
        this.processosService = processosService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Processos> listProcessos() {
        return processosService.listAll();
    };

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{idProcesso}")
    public Processos listProcessosById(@PathParam("idProcesso") Long idProcesso) {
        Processos entity = processosService.findById(idProcesso);

        if(entity == null) {
            throw new NotFoundException();
        }
        else {
            return entity;
        }
    }

    @POST
    @Transactional
    public Processos createProcessos(Processos processos) {
        return processosService.save(processos);
    }

    @DELETE
    @Transactional
    @Path("/{idProcesso}")
    public void deleteProcessos(@PathParam("idProcesso") Long idProcesso) {
        Processos entity = processosService.findById(idProcesso);

        if(entity == null) {
            throw new NotFoundException();
        }
        else {
            processosService.delete(entity);
        }

    }
}
