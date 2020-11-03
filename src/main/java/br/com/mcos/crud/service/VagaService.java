package br.com.mcos.crud.service;

import java.util.List;

import br.com.mcos.crud.model.Vaga;
import br.com.mcos.crud.rest.form.VagaForm;

public interface VagaService {

	List<Vaga> lista();

	long cria(Vaga vaga);

	Vaga porId(long id);

	void apaga(long id);

	Vaga atualiza(long id, VagaForm vagaForm);

}
