package BancoDeQuestoes;

import java.io.Serializable;

public class Pessoa implements Serializable {
	private String nome;
	private String email;
	private String login;
	private String senha;
	private String cod;
	
	public Pessoa(String cod, String nome, String email, String login, String senha){
		this.nome = nome;
		this.email = email;
		this.login = login;
		this.senha = senha;
		this.cod = cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

}
