package br.edu.fatecpg.heranca.model;

/* Apenas para praticar, crie uma interface chamada "OperacaoMatematica". 
   Crie também 4 métodos das operações básicas: soma, subtração, multiplicação e divisão 
   implemente na classe Calculadora. Implementar algum dos métodos  e veja o que acontece. */

public interface OperacaoMatematica {
	public double soma(double a, double b);

	public double subtracao(double a, double b);

	public double divisao(double a, double b);

	public double multiplicacao(double a, double b);
}