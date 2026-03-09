package br.edu.fatecpg.polimorfismo.model;

/*3. Sobrecarga de construtores
Enunciado:
Crie uma classe chamada Produto com três construtores sobrecarregados:
● O primeiro deve receber um nome do produto (String).
● O segundo deve receber um nome e um preço (double).
● O terceiro deve receber um nome, um preço e uma quantidade em estoque (int).
● Instancie objetos da classe Produto utilizando cada um dos construtores e imprima
as informações dos produtos.
Pergunta:​
Discuta como a sobrecarga de construtores facilita a criação de objetos com diferentes
conjuntos de informações, permitindo flexibilidade na instânciação de objetos.*/

public class Produto {
	private String nome;
	private double preco;
	private int qtdEstoque;

	public Produto(String nome) {
		this.nome = nome;
	}

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public Produto(String nome, double preco, int qtd) {
		this.nome = nome;
		this.preco = preco;
		this.qtdEstoque = qtd;
	}

	public void print() {
		System.out.println("Nome: "+nome+"\nPreço: "+preco+"\nqtdEstoque: "+qtdEstoque+"\n");
	}
}