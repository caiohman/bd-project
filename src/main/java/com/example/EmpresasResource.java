package com.example;

import com.example.model.Empresas;
import com.example.service.EmpresasServiceImpl;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/empresas")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EmpresasResource {

    private final EmpresasServiceImpl empresasService;

    @Inject
    EmpresasResource(EmpresasServiceImpl empresasService) {
        this.empresasService = empresasService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Empresas> listEmpresas() {
        return empresasService.listAll();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{cnpj}")
    public Empresas listEmpresasById(@PathParam("cnpj") Long cnpj) {
        Empresas entity = empresasService.findById(cnpj);

        if(entity == null) {
            throw new NotFoundException();
        }
        else {
            return entity;
        }
    }

    @POST
    @Transactional
    public Empresas createEmpresas(Empresas empresas) {
        return empresasService.save(empresas);
    }

    @DELETE
    @Transactional
    @Path("/{cnpj}")
    public void deleteEmpresas(@PathParam("cnpj") Long cnpj) {
        Empresas entity = empresasService.findById(cnpj);

        if(entity == null) {
            throw new NotFoundException();
        }
        else {
            empresasService.delete(entity);
        }
    }
}
