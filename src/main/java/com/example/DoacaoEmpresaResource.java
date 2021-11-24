package com.example;

import com.example.model.DoacaoEmpresa;
import com.example.service.DoacaoEmpresaServiceImpl;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/doacaoempresa")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DoacaoEmpresaResource {

    private final DoacaoEmpresaServiceImpl doacaoEmpresaService;

    @Inject
    DoacaoEmpresaResource(DoacaoEmpresaServiceImpl doacaoEmpresaService) {
        this.doacaoEmpresaService = doacaoEmpresaService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<DoacaoEmpresa> listDoacaoEmpresa() {
        return doacaoEmpresaService.listAll();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{cnpj}")
    public DoacaoEmpresa listDoacaoEmpresaById(@PathParam("cnpj") Long cnpj) {
        DoacaoEmpresa entity = doacaoEmpresaService.findById(cnpj);

        if(entity == null) {
            throw new NotFoundException();
        }
        else {
            return entity;
        }
    }

    @POST
    @Transactional
    public DoacaoEmpresa createDoacaoEmpresa(DoacaoEmpresa doacaoEmpresa) {
        return doacaoEmpresaService.save(doacaoEmpresa);
    }

    @DELETE
    @Transactional
    @Path("/{cnpj}")
    public void deleteDoacaoEmpresa(@PathParam("cnpj") Long cnpj) {
        DoacaoEmpresa entity = doacaoEmpresaService.findById(cnpj);

        if(entity == null) {
            throw new NotFoundException();
        }
        else {
           doacaoEmpresaService.delete(entity);
        }
    }

}
