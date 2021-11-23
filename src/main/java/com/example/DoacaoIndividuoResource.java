package com.example;

import com.example.model.DoacaoIndividuo;
import com.example.service.DoacaoIndividuoServiceImpl;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/doacaoindividuo")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DoacaoIndividuoResource {

    private final DoacaoIndividuoServiceImpl doacaoIndividuoService;

    @Inject
    DoacaoIndividuoResource(DoacaoIndividuoServiceImpl doacaoIndividuoService) {
        this.doacaoIndividuoService = doacaoIndividuoService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<DoacaoIndividuo> listDoacaoIndividuo() {
        return doacaoIndividuoService.listAll();
    }

    @POST
    @Transactional
    public DoacaoIndividuo createDoacaoIndividuo(DoacaoIndividuo doacaoIndividuo) {
        return doacaoIndividuoService.save(doacaoIndividuo);
    }

    @DELETE
    @Transactional
    @Path("/{cpf}")
    public void deleteDoacaoIndividuo(@PathParam("cpf") Long cpf) {
        DoacaoIndividuo entity = doacaoIndividuoService.findById(cpf);

        if(entity == null) {
            throw new NotFoundException();
        }
        else {
            doacaoIndividuoService.delete(entity);
        }
    }
}
