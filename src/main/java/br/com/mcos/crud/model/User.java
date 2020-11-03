package br.com.mcos.crud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private long id;
	private String usuario;
	private String email;
	private String nome;
	private String sobrenome;
	private String tecnologias;

	public User() {
	}	

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public User(String usuario, String email, String nome, String sobrenome, String tecnologias) {
		this.usuario = usuario;
		this.email = email;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.tecnologias = tecnologias;
	}

	public String getUsuario() {	return usuario;	}
	public String getEmail() { return email; }
	public String getNome() { return nome; }
	public String getSobrenome() { return sobrenome; }
	public String getTecnologias() { return tecnologias; }

	public void setUsuario(String usuario) { this.usuario = usuario; }
	public void setEmail(String email) { this.email = email; }
	public void setNome(String nome) { this.nome = nome; }
	public void setSobrenome(String sobrenome) { this.sobrenome = sobrenome; }
	public void setTecnologias(String tecnologias) { this.tecnologias = tecnologias; }

	@Override
	public String toString() {
		return "User [" +
				" usuario=" + usuario + "," +
				" email=" + email + "," +
				" nome=" + nome + "," +
				" sobrenome=" + sobrenome + "," +
				" tecnologias=" + tecnologias + "]";
	}

}
