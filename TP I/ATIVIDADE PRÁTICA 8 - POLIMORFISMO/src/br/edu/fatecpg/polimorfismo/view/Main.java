package br.edu.fatecpg.polimorfismo.view;

import br.edu.fatecpg.polimorfismo.model.*; 

public class Main {
	public static void main(String[] args) {
		Carro fusca = new Carro();
		Bicicleta caloi = new Bicicleta();

		caloi.mover();
		fusca.mover();

		Calculadora calc = new Calculadora();

		System.out.println(calc.somar(1,2));
		System.out.println(calc.somar(1,2,1));
		System.out.println(calc.somar(0.5,1,1.5));

		Produto maca = new Produto("Maça");
		Produto laranja = new Produto("Laranja",2.9);
		Produto mamao = new Produto("Mamão",3.9,76);

		maca.print();
		laranja.print();
		mamao.print();

		PagamentoCartao pgc = new PagamentoCartao();
		PagamentoBoleto pgb = new PagamentoBoleto();

		pgc.processarPagamento();
		pgb.processarPagamento();

		Conversor con = new Conversor();

		System.out.println(con.converter(18));
		System.out.println(con.converter(100.00));
		System.out.println(con.converter("Espanha"));
	}
}