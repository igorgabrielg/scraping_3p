package br.com.mcos.crud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private long id;

	private String apelido;
	private String github;

	public User() {
	}	

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public User(String apelido, String github) {
		this.github = github;
		this.apelido = apelido;
	}

	public String getGithub() {	return github;	}

	public String getApelido() { return apelido; }

	public void setGithub(String github) {
		this.github = github;
	}
	
	public void setApelido(String apelido) {	this.apelido = apelido;	}

	@Override
	public String toString() {
		return "User [github=" + github + ", apelido=" + apelido + "]";
	}

}