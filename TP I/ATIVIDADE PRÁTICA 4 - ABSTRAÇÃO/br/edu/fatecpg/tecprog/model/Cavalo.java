package br.edu.fatecpg.tecprog.model;

public class Cavalo {
	
	public String raça;
	public Double tamanho;
	public int força = 2;
	public String cor_pelagem;
	public int velocidade = 0;;

	public void relinchar() {
		System.out.println("neiiiigh");
	}
	
	public void galopar() {
		velocidade += 10; 
		System.out.println("galopando a " + velocidade + "KM");

	}
	
	public void parar() {
		System.out.println("cavalo parou");
		velocidade = 0;
		}
	
	public void comer() {
		if(velocidade == 0) {
			System.out.println("comendo graminha mmhnn mhhn");
		} else {
			System.out.println("cavalo precisa estar parado para comer");
		}
		
	}
	public void saltar(){	
		int saltar = força + velocidade;
		System.out.println("cavalo saltou " + saltar + "metros");
	}
	
	
	
}
