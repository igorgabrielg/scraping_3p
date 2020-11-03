package br.com.mcos.crud.rest;

import java.net.URI;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.mcos.crud.model.Vaga;
import br.com.mcos.crud.rest.form.VagaForm;
import br.com.mcos.crud.service.VagaService;

@Path("/vaga")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class VagaResource {

	@Inject
	VagaService vagaService;

	@GET
	public List<Vaga> lista() {
		return vagaService.lista();
	}
	
	@POST
	@Transactional
	public Response cria(Vaga vaga) {
		long id = vagaService.cria(vaga);
		URI uri = URI.create("http://localhost:8080/" + id);
		return Response.created(uri).build();
	}
	
	@PUT
	@Path("{id}")
	@Transactional
	public Response atualiza(@PathParam("id") long id, VagaForm vagaForm) {
		Vaga vaga = vagaService.atualiza(id, vagaForm);
		URI uri = URI.create("http://localhost:8080/" + vaga.getId());
		return Response.created(uri).build();		
	}
	
	@GET
	@Path("{id}")
	public Vaga porId(@PathParam("id") long id) {
		return vagaService.porId(id);
	}
	
	@DELETE
	@Path("{id}")
	@Transactional
	public void apaga(@PathParam("id") long id) {
		Vaga vaga = vagaService.porId(id);
		if(vaga == null) {
			throw new WebApplicationException(404);
		}
		vagaService.apaga(id);
	}
}
