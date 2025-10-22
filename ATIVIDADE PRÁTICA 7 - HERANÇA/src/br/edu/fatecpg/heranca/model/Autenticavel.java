package br.edu.fatecpg.heranca.model;

/* Interface Autenticavel
	Crie uma interface chamada Autenticavel com os seguintes métodos:
	login(String usuario, String senha): Verifica se o login e a senha estão corretos.
	logout(): Faz o logout do usuário. */

public interface Autenticavel {
	public boolean login(String usuario, String senha);
	public void logout();
}
