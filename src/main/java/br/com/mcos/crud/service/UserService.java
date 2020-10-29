package br.com.mcos.crud.service;

import br.com.mcos.crud.model.User;
import br.com.mcos.crud.rest.form.UserForm;

import java.util.List;

public interface UserService {

	List<User> lista();

	long cria(User User);

	User porId(long id);

	void apaga(long id);

	User atualiza(long id, UserForm userForm);


}
