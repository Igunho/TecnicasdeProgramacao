package br.edu.fatecpg.tecprog.avaliacaoparcial.model;

import java.util.Scanner;

public class Loja {
	private String[] nomesProdutos;
	private int[] quantidadeEstoque;
	private double[] precosProdutos;
	
	//Metodo construtor, recebe o parâmetro quantidade para definir o limite de itens na loja
	public Loja(int qtd) {
		this.nomesProdutos = new String[qtd];
		this.quantidadeEstoque = new int[qtd];
		this.precosProdutos = new double[qtd];
	}

	//Define o produto em uma posição especifica da loja
	public void setProduto(int i, String nome, double preco, int quantia) {
		this.nomesProdutos[i-1] = nome;
		this.quantidadeEstoque[i-1] = quantia;
		this.precosProdutos[i-1] = preco;
	}
	
	//Retorna uma string com a lista de todos os produtos
	public String exibirProdutos() {
		String lista = "";

		System.out.println("Nome | Preço | Estoque");
		for(int i = 0; i < this.nomesProdutos.length; i++) {
			if(this.nomesProdutos[i] != null) {
				lista += (this.nomesProdutos[i] + " | " + this.precosProdutos[i] + " | " + this.quantidadeEstoque[i] + "\n");
			} else { break; }
		}
		return lista;
	}
	
	//Retorna um string com o produto mais caro e barato
	public String calcularDestaques() {
		double[] maior = {this.precosProdutos[0],0}; //Indice 0 = preço do produto
		double[] menor = {this.precosProdutos[0],0}; //Indice 1 = indíce do produto no array
		
		for(int i = 0; i < this.precosProdutos.length; i++) {
			if(this.precosProdutos[i] > maior[0] && this.nomesProdutos[i] != null) {
				maior[0] = this.precosProdutos[i];
				maior[1] = i;
			}
			
			if(this.precosProdutos[i] < menor[0] && this.nomesProdutos[i] != null) {
				menor[0] = this.precosProdutos[i];
				menor[1] = i;
			}
		}
		
		return "Produto mais caro: " + this.nomesProdutos[(int)maior[1]] + " R$" + maior[0] + "\n" +
				"Produto mais barato: " + this.nomesProdutos[(int)menor[1]] + " R$" + menor[0];
	}
	
	//Retorna o valor total(R$) em estoque
	public double valorTotalEstoque() {
		double valorTotal = 0;
		
		for(int i = 0; i < this.quantidadeEstoque.length; i++) {
			valorTotal += this.quantidadeEstoque[i] * precosProdutos[i];
		}
		
		return valorTotal;
	}

	//Retorna uma confirmação da compra diminuindo o estoque pela quantidade comprada
	public String comprar(int qtd, int i) {
		if(this.quantidadeEstoque[i] >= qtd) {
			this.quantidadeEstoque[i] -= qtd;
			return (qtd + " " + this.nomesProdutos[i] + " comprado(s) com sucesso!");
		} else {
			return ("Não há estoque suficiente para essa compra");
		}
		
	}
	
	//Retorna uma mensagem de confirmação com a reposição do produto pela quantidade especificada
	public String reporProduto(int qtd, int i) {
		this.quantidadeEstoque[i] += qtd;
		return (qtd + " " + this.nomesProdutos[i] + " reposto(s) com sucesso!");
	}
	
}
