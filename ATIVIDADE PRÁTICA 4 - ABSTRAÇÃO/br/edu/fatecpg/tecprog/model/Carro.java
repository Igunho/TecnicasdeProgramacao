package br.edu.fatecpg.tecprog.model;

public class Carro {
	public String cor;
	public String capacidade_tanque;
	public String modelo;
	public int ano;
	public boolean ligado = false;
	public int velocidade = 0;
	
	public void ligar() {
		if(!ligado) {
			System.out.println("Ligado!");
			ligado = true;
		} else {
			System.out.println("Carro já está ligado!");
		}
	}
	
	public void acelerar() {
		if(!ligado) {
			System.out.println("Carro está desligado, impossivel acelerar");
		} else {
			velocidade+= 10;
			System.out.println("Acelerando!!! ( " + velocidade + "KM/H )");
		}
	}
	
	public void desligar() {
		if(!ligado) {
			System.out.println("Carro já está desligado");
		} else {
			System.out.println("Desligado!");
			ligado = false;
			velocidade = 0;
		}
	}
	
	public void frear() {
		if(!ligado) {
			System.out.println("Carro está desligado");
		} else {
			velocidade = 0;
			System.out.println("carro parado ( " + velocidade + "KM/H )");
		}
	}
	
	public void buzinar() {
		if(!ligado) {
			System.out.println("Carro está desligado não da pra buzinar");
		} else {
			System.out.println("BI-BI-BI");
			ligado = false;
		}
	}
}

