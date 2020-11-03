package br.com.mcos.crud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vaga {
	
	@Id
	@GeneratedValue
	private long id;

	private String empresa;
	private String vaga;
	private String salario;
	private String tecnologias;
	private String link;

	public Vaga() {
	}	

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public Vaga(String empresa, String vaga, String salario, String tecnologias, String link) {
		this.empresa = empresa;
		this.vaga = vaga;
		this.salario = salario;
		this.tecnologias = tecnologias;
		this.link = link;
	}

	public String getEmpresa() {
		return empresa;
	}
	public String getVaga() {
		return vaga;
	}
	public String getSalario() {
		return salario;
	}
	public String getTecnologias() {
		return tecnologias;
	}
	public String getLink() {
		return link;
	}

	public void setEmpresa(String empresa) { this.empresa = empresa; }
	public void setVaga(String vaga) { this.vaga = vaga; }
	public void setSalario(String salario) { this.salario = salario; }
	public void setTecnologias(String tecnologias) { this.tecnologias = tecnologias; }
	public void setLink(String link) { this.link = link; }


	@Override
	public String toString() {
		return "Vaga [empresa=" + empresa + ", vaga=" + vaga + ", salario=" + salario + ", tecnologias=" + tecnologias + ", link=" + link + "]";
	}

}
