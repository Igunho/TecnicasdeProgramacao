package br.edu.fatecpg.tecprog.avaliacaoparcial.model;

public class Videolocadora {
	private String[] filmes;
	private int[] vezesAlugado;
	private double[] precosLocacao;
	private boolean[] alugado;
	
	public Videolocadora(int qtd) {
		this.filmes = new String[qtd];
		this.vezesAlugado = new int[qtd];
		this.precosLocacao = new double[qtd];
		this.alugado = new boolean[qtd];
	}

	public void setFilme(int i, String nome, double preco) {
		this.filmes[i-1] = nome;
		this.precosLocacao[i-1] = preco;
		if(vezesAlugado[i-1] > 0) {
			vezesAlugado[i-1] = vezesAlugado[i-1];
		} else {
			vezesAlugado[i-1] = 0;
		}
	}
	
	public String exibirFilmes() {
		String lista = "";

		System.out.println("Nome | Preço | Vezes Alugado | Alugado");
		for(int i = 0; i < this.filmes.length; i++) {
			if(filmes[i] != null) {
				lista += (this.filmes[i] + " | " + this.precosLocacao[i] + " | " + this.vezesAlugado[i] + " | " + this.alugado[i] + "\n");
			} else { break; }
		}

		return lista;
	}
	
	public double faturamentoTotal() {
		double faturamentoTotal = 0;
		
		for(int i = 0; i < this.filmes.length; i++) {
			faturamentoTotal += precosLocacao[i];
		}
		
		return (faturamentoTotal);
	}

	public String filmeMaisAlugado() {
		int[] maior = {0,0}; //Indice 0 = vezesAlugado, 1 = Indice no array

		for(int i = 0; i < this.filmes.length; i++) {
			if(this.vezesAlugado[i] > maior[0]) {
				maior[0] = this.vezesAlugado[i];
				maior[1] = i;
			}
		}

		if(maior[0] == 0 && maior[1] == 0) {
			return "Nenhum filme foi alugado até o momento";
		} else {
			return "Filme mais alugado: " + this.filmes[maior[1]];
		}
	}

	//adicionar algo para ver se o filme está atualmente sendo alugado
	public String alugarFilme(int i) {
		if(!this.alugado[i-1]) {
			this.vezesAlugado[i-1]++;
			this.alugado[i-1] = true;
			return (this.filmes[i-1] + " alugado com sucesso");
		} else {
			return (this.filmes[i-1] + " já está alugado no momento, impossivel alugar");
		}
	}

	public String devolverFilme(int i) {
		if(!this.alugado[i-1]) {
			return (this.filmes[i-1] + " não está alugado, não há oque devolver");
		} else {
			this.alugado[i-1] = false;
			return (this.filmes[i-1] + " devolvido com sucesso!");
		}
	}
}
