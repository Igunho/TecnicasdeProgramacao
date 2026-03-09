package br.edu.fatecpg.tecprog.model;

public class Aguia {
	public int tamanho; //cm
	public int velocidade; //km/h
	public int idade; //anos
	public int visao; //km
	public String cor;
	public String especie;
	private boolean voando = false;
	private boolean cacando = false;
	
	public void Voar() {
		if(voando == false) {
			System.out.println("Voo levantado! " + velocidade + "km/h!");
			voando = true;
		} else {
			System.out.println("Já está em voo");
		}
	}
	
	public void Pousar() {
		if(voando == true) {
			System.out.println("Pousando!");
			voando = false;
		} else {
			System.out.println("Não está voando");
		}
	}
	
	public void Cacar() {
		if(cacando == true) {
			System.out.println("Já está caçando");
		} else {
			System.out.println("Procurando presa dentro de " + visao + "km!");
			cacando = true;
		}
	}
	
	public void Mergulhar() {
		if(cacando == true && voando == true) {
			System.out.println("Mergulhando atrás de presa!!");
			cacando = false;
		} else {
			System.out.println("Nenhuma presa dentro da visão, é necessario caçar primeiro");
		}
	}
}
