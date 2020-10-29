package br.com.mcos.crud.rest.form;

public class UserForm {
	
	private String apelido;
	private String github;

	public String getApelido() {
		return apelido;
	}

	public String getGithub() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public void setGithub(String apelido) {
		this.apelido = apelido;
	}

	public UserForm(String apelido, String github) {
		super();
		this.apelido = apelido;
		this.github = github;
	}

	public UserForm() {
		super();
	}

	@Override
	public String toString() {
		return "UserForm [github=" + github + ", apelido=" + apelido + "]";
	}

}
