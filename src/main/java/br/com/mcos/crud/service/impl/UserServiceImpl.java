package br.com.mcos.crud.service.impl;

import br.com.mcos.crud.model.User;
import br.com.mcos.crud.rest.form.UserForm;
import br.com.mcos.crud.service.UserService;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class UserServiceImpl implements UserService {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public List<User> lista() {
		return em.createQuery("select e from User e", User.class).getResultList();
	}

	@Override
	@Transactional
	public long cria(User user) {
		em.persist(user);	
		return user.getId();
	}

	@Override
	public User porId(long id) {		
		return em.find(User.class, id);
	}

	@Override
	@Transactional
	public void apaga(long id) {
		User user = porId(id);
		em.remove(user);		
	}

	@Override
	@Transactional
	public User atualiza(long id, UserForm userForm) {
		User user = porId(id);		
		user.setUsuario(userForm.getUsuario());
		user.setEmail(userForm.getEmail());
		user.setNome(userForm.getNome());
		user.setSobrenome(userForm.getSobrenome());
		user.setTecnologias(userForm.getTecnologias());
		return user;
	}

}
