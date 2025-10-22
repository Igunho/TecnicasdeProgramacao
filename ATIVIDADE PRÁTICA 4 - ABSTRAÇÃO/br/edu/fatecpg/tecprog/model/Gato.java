package br.edu.fatecpg.tecprog.model;

public class Gato {
	public String raça;
	public int idade;
	public String cor_olhos;
	public Double peso;
	
	public void miar(){
		System.out.println("MIAUU MIAUU");
	}
	
	public void arranhar(){
		System.out.println("prove das minhas garras >:)");
	}
	
	public void caçar() {
		String sucesso[] = {"falhou miseravelmente", "não foi dessa vez", "ele conseguiu"};
		System.out.println("preparando...pulando e " + sucesso[(int)Math.random() * 2]);
	}
	
	public void ronronar() {
		System.out.println("prrrr prrrr");
	}
	
}
