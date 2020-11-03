package br.com.mcos.crud.service.impl;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import br.com.mcos.crud.model.Vaga;
import br.com.mcos.crud.rest.form.VagaForm;
import br.com.mcos.crud.service.VagaService;

@ApplicationScoped
public class VagaServiceImpl implements VagaService {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public List<Vaga> lista() {
		return em.createQuery("select e from Vaga e", Vaga.class).getResultList();
	}

	@Override
	@Transactional
	public long cria(Vaga vaga) {
		em.persist(vaga);
		return vaga.getId();
	}

	@Override
	public Vaga porId(long id) {
		return em.find(Vaga.class, id);
	}

	@Override
	@Transactional
	public void apaga(long id) {
		Vaga vaga = porId(id);
		em.remove(vaga);
	}

	@Override
	@Transactional
	public Vaga atualiza(long id, VagaForm vagaForm) {
		Vaga vaga = porId(id);
		vaga.setEmpresa(vagaForm.getEmpresa());
		vaga.setVaga(vagaForm.getVaga());
		vaga.setSalario(vagaForm.getSalario());
		vaga.setTecnologias(vagaForm.getTecnologias());
		vaga.setLink(vagaForm.getLink());
		return vaga;
	}

}
