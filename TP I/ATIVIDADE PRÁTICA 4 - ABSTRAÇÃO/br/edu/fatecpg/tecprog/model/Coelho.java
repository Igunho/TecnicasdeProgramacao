package br.edu.fatecpg.tecprog.model;

public class Coelho {
	
	public Double tamanho_orelhas;
	public Double peso;
	public String cor;
	public int velocidade;
	public int idade;
	
	public void cavar(){
		System.out.println("cavando cavando...");
	}
	
	public void correr(){
		velocidade += 5;
		System.out.println("coelho está correndo a " + velocidade + "m/s");
	}
	
	public void parar(){
		System.out.println("o coelho resolveu dar uma pausa");
	}
	
	public void comer(){ 
		if(velocidade == 0) {
			System.out.println("comendo cenorinha mmhnn mhhn");
		} else {
			System.out.println("o coelho n consegue comer correndo");
		}
	}
	
	public void pular() {
		
	}
}
