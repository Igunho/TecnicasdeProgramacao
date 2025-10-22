package br.edu.fatecpg.tecprog.avaliacaoparcial.model;

public class Biblioteca {
	private String[] livros;
	private int[] diasAtraso;
	private double[] multaPorDia;
	private boolean[] disponivel;

	//Metodo construtor
	public Biblioteca(int qtd) {
		this.livros = new String[qtd];
		this.diasAtraso = new int[qtd];
		this.multaPorDia = new double[qtd];
		this.disponivel = new disponivel[qtd];
	}

	//Adiciona um novo livro ao catalogo
	public void addLivro(int i, String livro, double multa) {
		if(livros[i-1] == null) {
			this.livros[i-1] = livro;
			this.multaPorDia[i-1] = multa;
			this.disponivel[i-1] = true;
			this.diasAtraso[i-1] = 0;
			System.out.println("livro adicionado com sucesso");
		} else {
			System.out.print("já há um livro nesse id");
		}
	}

	//Remove um livro do catalogo
	public void removeLivro(int i, String livro, double multa) {
		if(livros[i-1] != null) {
			this.livros[i-1] = null;
			this.multaPorDia[i-1] = 0;
			this.disponivel[i-1] = false;
			this.diasAtraso[i-1] = 0;
			System.out.println("livro removido com sucesso");
		} else {
			System.out.println("não há um livro nesse id");
		}
	}

	//Realisticamente eu me daria o trabalho de fazer algo que realmente vê quanto tempo passou desde o livro ser adicionado ao catalogo de livros
	//Aumenta a quantidade de dias de atraso de um livro pela número passado como parâmetro
	public void passarDias(int i, int dias) {
		this.diasAtraso[i-1] += dias;
	}

	//Retorna uma String com o nome do livro, dias de atraso e valor de multa
	public String exibirLivros() {
		String lista = " Livro | Dias | Multa ";

		for(int i = 0; i < this.livros.length; i++) {
			if(this.livros[i] != null) {
				lista += (this.livros[i] + " | " + this.diasAtraso[i] + " | " + this.multaPorDia);
			}
		}

		return lista;
	}

	//Retorna uma string com uma lista de todos os livros e sua multa total, atual
	public String multaTotal() {
		String lista = " Livro | Dias | Multa ";
	
		for(int i = 0; i < this.livros.length; i++) {
			if(this.diasAtraso[i] > 0 && this.livros[i] != null) {
				lista += (this.livros[i] + " | " + this.diasAtraso * this.multaPorDia + "\n");
			}
		}

		return lista;
	} 

	//Retorna um double com uma media dos dias de atraso de todos os livros em catalogo
	public double mediaDias() {
		double media = 0;

		for(int i = 0; i < this.livros.length; i++) { 
			if(this.livros[i] != null) {
				media += this.diasAtraso[i];
			}

			if(i = this.livros.length-1) {
				media /= i;
			}
		}

		return this.media;
	}

	//Retorna uma string com uma mensagem de sucesso ou fracasso para marcar um livro como indisponivel
	public String emprestarLivro(int i) {
		if(this.disponivel[i-1]) {
			this.disponivel[i-1] = false;
			return this.livros[i-1] + " emprestado!";
		} else {
			return this.livros[i-1] + " não está disponível";
		}
	}

	//Retorna uma string com uma mensagem de sucesso ou fracasso para marcar um livro como indisponivel
	public String devolverLivro(int i) {
		if(!this.disponivel[i-1]) {
			this.disponivel[i-1] = true;
			return this.livros[i-1] + " devolvido com " + this.diasAtraso[i-1] + ", R$" + (this.diasAtraso[i-1]*this.multaPorDia[i-1]) + " de multa";
		} else {
			return this.livros[i-1] + " não está emprestado no momento";
		}
	}
}