package br.edu.fatecpg.tecprog.model;

import java.util.Random;

public class Papagaio {
	public String corDasPenas;
	public String especie;
	public int idade;
	public int peso;
	public int tamanho;
	public int velocidade;
	private boolean voando;
	
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
	
	public void Gritar() {
		System.out.println("Eeeek! Eeeek! Eeeek!");
		System.out.println("\\033[3m papagaios podem gritar a mais de 100 decibeis \\033[0m"); //Experiência própria
	}
	
	public void Cantar() {
		Random aleatorio = new Random();

		switch (aleatorio.nextInt(3)) {
			case 0:
				System.out.println("Atirei o pau no gato tô\n"
						+ "Mas o gato tô\n"
						+ "Não morreu reu reu\n"
						+ "Dona Chica cá\n"
						+ "Admirou-se se\n"
						+ "Do berro, do berro que o gato deu\n"
						+ "Miau");
				break;
			case 1:
				System.out.println("Mariana conta 1\n"
						+ "Mariana conta 1: é 1, é 1, é Ana\n"
						+ "Viva a Mariana, viva a Mariana\n"
						+ "Mariana conta 2\n"
						+ "Mariana conta 2: é 1, é 2, é Ana\n"
						+ "Viva a Mariana, viva a Mariana\n"
						+ "Mariana conta 3\n"
						+ "Mariana conta 3: é 1, é 2, é 3, é!\n"
						+ "Ana, viva a Mariana, viva a Mariana\n"
						+ "Mariana conta 4\n"
						+ "Mariana conta 4: é 1, é 2, é 3, é 4, é Ana\n"
						+ "Viva a Mariana, viva a Mariana\n"
						+ "Mariana conta 5\n"
						+ "Mariana conta 5: é 1, é 2, é 3, é 4, é 5, é Ana\n"
						+ "Viva a Mariana, viva a Mariana\n"
						+ "Mariana conta 6\n"
						+ "Mariana conta 6: é 1, é 2, é 3, é 4, é 5, é 6, é Ana\n"
						+ "Viva a Mariana, viva a Mariana\n"
						+ "Mariana conta 7\n"
						+ "Mariana conta 7: é 1, é 2, é 3, é 4, é 5, é 6, é 7, é Ana\n"
						+ "Viva a Mariana, viva a Mariana\n"
						+ "Mariana conta 8\n"
						+ "Mariana conta 8: é 1, é 2, é 3, é 4, é 5, é 6, é 7, é 8, é Ana\n"
						+ "Viva a Mariana, viva a Mariana\n"
						+ "Mariana conta 9\n"
						+ "Mariana conta 9: é 1, é 2, é 3, é 4, é 5, é 6, é 7, é 8, é 9, é Ana\n"
						+ "Viva a Mariana, viva a Mariana\n"
						+ "Mariana conta 10\n"
						+ "Mariana conta 10: é 1, é 2, é 3, é 4, é 5, é 6, é 7, é 8,\n"
						+ "é 9, é 10, é Ana\n"
						+ "Viva a Mariana, viva a Mariana");
				break;
			case 2:
				System.out.println("Ai, ai, ai, ai\n"
						+ "Ai, ai, ai, ai\n"
						+ "Eu vou dar uma volta\n"
						+ "Mesmo na crise dela\n"
						+ "Eu vou dar uma volta\n"
						+ "Mesmo na crise dela\n"
						+ "Quando entrei no quarto\n"
						+ "Eu escutei só o gemido dela, ai\n"
						+ "Quando entrei no quarto\n"
						+ "Eu escutei só o gemido dela, ai\n"
						+ "Ai-ai-ai, a-a-ai\n"
						+ "A-a-ai, a-a-ai\n"
						+ "A-a-ai, a-a-ai\n"
						+ "A-a-ai, a-a-ai\n"
						+ "A-a-ai\n"
						+ "Caneta azul, azul caneta\n"
						+ "Caneta azul tá marcada com minha letra\n"
						+ "Caneta azul, azul caneta\n"
						+ "Caneta azul tá marcada com minha letra");
				break;
			default:
				Gritar();
				break;
		}
		
	}
}
