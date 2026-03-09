package br.edu.fatecpg.heranca.model;

/* Implemente essa interface na classe SistemaDeSeguranca. Nessa classe:
Defina os valores de um login e senha corretos, como "admin" e "1234".
No método login(), implemente a lógica para verificar se o usuário e senha inseridos correspondem aos valores corretos.
Se o login for bem-sucedido, armazene um valor booleano que indica se o usuário está autenticado ou não.
Tarefa: Crie uma classe de teste que peça ao usuário para inserir o nome de usuário e senha. 
Se o login estiver correto, o sistema deverá exibir uma mensagem de boas-vindas.
Caso contrário, deverá pedir para tentar novamente até acertar. O sistema também deve permitir fazer o logout. */

public class SistemasDeSeguranca {
	private String usuario = "admin";
	private String senha = "1234";
	private boolean logado = false;

	public boolean login(String usuario, String senha) {
		if(usuario.equals(this.usuario) && senha.equals(this.senha)) {
			logado = true;
			return true;
		} else {
			return false;
		}
	}

	public void logout() {
		if(!logado) {
			System.out.println("Usuário não está logado");
		} else {
			System.out.println("Usuário deslogado!");
		}
	}
}