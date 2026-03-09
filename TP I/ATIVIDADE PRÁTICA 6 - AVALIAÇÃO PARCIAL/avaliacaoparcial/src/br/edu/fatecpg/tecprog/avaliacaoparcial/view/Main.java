package br.edu.fatecpg.tecprog.avaliacaoparcial.view;

import br.edu.fatecpg.tecprog.avaliacaoparcial.model.*;
import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		DecimalFormat financeiro = new DecimalFormat("#.00");

		Biblioteca saraiva = new Biblioteca(20);

		saraiva.addLivro(1,"Quarenta e oito leis do poder",48.67);
		saraiva.addLivro(1,"Alto da Compadecida",02.99);
		saraiva.addLivro(2,"Alto da Compadecida",02.99);
		saraiva.addLivro(3,"O Menino do Pijama Listrado",01.70);

		saraiva.passarDias(1,21);
		saraiva.passarDias(2,14);
		saraiva.passarDias(3,9);

		System.out.println(saraiva.exibirLivros());
		System.out.println(saraiva.multaTotal());


		/*Videolocadora blocoExplosao = new Videolocadora(20);

		blocoExplosao.setFilme(1,"Homem Aranha",28.6);
		blocoExplosao.setFilme(2,"Avatar 2",24.8);
		blocoExplosao.setFilme(3,"Forrest Gump",31.4);

		System.out.println(blocoExplosao.exibirFilmes());

		System.out.println("Faturamento total: " + financeiro.format(blocoExplosao.faturamentoTotal()));

		System.out.println(blocoExplosao.filmeMaisAlugado());

		System.out.println(blocoExplosao.alugarFilme(1));
		System.out.println(blocoExplosao.alugarFilme(1) + "\n");
		System.out.println(blocoExplosao.devolverFilme(2) + "\n");
		System.out.println(blocoExplosao.devolverFilme(1) + "\n");*/

		/*Loja assai = new Loja(20);

		assai.setProduto(1,"Margarina",6.00,120);
		assai.setProduto(2,"Mussarela",9.00,80);

		System.out.println(assai.exibirProdutos());

		System.out.println(assai.calcularDestaques());*/
	}
}
