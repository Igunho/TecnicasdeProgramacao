package br.edu.fatecpg.tecprog.model;

public class Raposa {
	public String cor_pelo;
	public String especie;
	public Double tamanho;
	public String habitat;
	public int velocidade;
	public boolean parado = false;

	public void caçar(){
			String sucesso[] = {"falhou miseravelmente", "não foi dessa vez", "ele conseguiu"};
			System.out.println("preparando...pulando e " + sucesso[(int)Math.random() * 2]);
	}
	
	public void correr() {
		velocidade += 10; 
		System.out.println("correndo a " + velocidade + "KM");
		parado = false;
	}
	
	public void parar() {
		velocidade = 0; 
		System.out.println("raposa parou");
		parado = true;
	}
	
	public void comer(){
		System.out.println("raposa comendo");
	}
}
