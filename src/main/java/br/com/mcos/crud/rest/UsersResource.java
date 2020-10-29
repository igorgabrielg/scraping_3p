package br.com.mcos.crud.rest;

import br.com.mcos.crud.model.User;
import br.com.mcos.crud.rest.form.UserForm;
import br.com.mcos.crud.service.UserService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsersResource {

	@Inject
	UserService userService;

	@GET
	public List<User> lista() {
		return userService.lista();
	}
	
	@POST
	@Transactional
	public Response cria(User user) {
		long id = userService.cria(user);
		URI uri = URI.create("http://localhost:8080/" + id);
		return Response.created(uri).build();
	}
	
	@PUT
	@Path("{id}")
	@Transactional
	public Response atualiza(@PathParam("id") long id, UserForm userForm) {
		User user = userService.atualiza(id, userForm);
		URI uri = URI.create("http://localhost:8080/" + user.getId());
		return Response.created(uri).build();		
	}
	
	@GET
	@Path("{id}")
	public User porId(@PathParam("id") long id) {
		return userService.porId(id);
	}
	
	@DELETE
	@Path("{id}")
	@Transactional
	public void apaga(@PathParam("id") long id) {
		User user = userService.porId(id);
		if(user == null) {
			throw new WebApplicationException(404);
		}
		userService.apaga(id);
	}
}
