package br.edu.fatecpg.heranca.view;

import br.edu.fatecpg.heranca.model.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();

		double x = 10;
		double y = 5;

		System.out.println(calc.soma(x,y));
		System.out.println(calc.subtracao(x,y));
		System.out.println(calc.divisao(x,y));
		System.out.println(calc.multiplicacao(x,y));

		/* No final, crie uma classe de teste que simule o pagamento de R$100,00 com as duas formas de pagamento,
 		calculando o valor final e emitindo um recibo. */

 		PagamentoCartao pagC = new PagamentoCartao(100);
 		PagamentoDinheiro pagD = new PagamentoDinheiro(100);

 		System.out.println(pagC.emitirRecibo());
 		System.out.println(pagD.emitirRecibo());

 		SistemasDeSeguranca sds = new SistemasDeSeguranca();
 		Scanner scan = new Scanner(System.in);

 		do {
 			System.out.println("\n0 - Sair\n1 - Logar\n2 - Deslogar\n");
 			String input = scan.nextLine();

 			switch(input) {
 			case "0":
 				System.exit(0);
 				break;
 			case "1":
 				System.out.print("Insira o nome do usuário: ");
 				String nome = scan.nextLine();
 				System.out.print("Insira a senha do usuário: ");
 				String senha = scan.nextLine();

 				if(sds.login(nome, senha)) {
 					System.out.println("\nBem vindo(a)! ao Sistema!");
 				} else {
 					System.out.println("Nome ou senha incorreta!");
 				}
 				break;
 			case "2":
 				sds.logout();
 			}

 		} while(true);
	}
}