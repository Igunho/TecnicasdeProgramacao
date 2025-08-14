package br.edu.fatec.tecprog.estruturado;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void positivonegativo() {
		double num;

		System.out.println("\nDeterminar se um número é negativo ou positivo");
		System.out.print("Insira um número: ");
		num = scan.nextDouble();
		
		if(num>0) {
			System.out.println("O número: " + num + " é positivo");
		} else if (num == 0 ) {
			System.out.println("O número: 0 não tem valor");
		} else {
			System.out.println("O número: " + num + " é negativo");	
		}
	} 

	public static void maioremenor() {
		double num1,num2;

		System.out.println("\nDeterminar qual o maior dentre dois números\n");

		System.out.print("Insira o número 1: ");
		num1 = scan.nextDouble();

		System.out.print("Insira o número 2: ");
		num2 = scan.nextDouble();

		if(num1>num2) {
			System.out.println("Os números são diferentes e o 1° número "+num1+" é maior que o 2° "+num2);
		} else if (num1 == num2) {
			System.out.println("Os dois números são iguais ");
		} else {
			System.out.println("Os números são diferentes e o 2° número "+num2+" é maior que o 1° "+num1);
		}
	}

	//Ficou meio estranho pq eu já fiz a parada do menu no main, o unico jeito que eu sabia de fazer tudo num só arquivo
	public static void calcularea() {
		boolean done = false;
		do {
			System.out.print("\n1.Calcular área de um quadrado\n2.Calcular área de um círculo\nSeleção: ");
			int input = scan.nextInt();
			

			switch (input) {
				case 1:
					System.out.print("\nInsira o lado do quadrado: ");
					double l = scan.nextDouble();

					System.out.println("Área do quadrado: "+(l*l));
					done = true;
					break;
				case 2:
					System.out.print("\nInsira o raio do círculo: ");
					double r = scan.nextDouble();

					System.out.println("Área do círculo: "+(3.14159*(r*r)));
					done = true;
					break;
				default:
					break;
			}
		} while (done == false);
	}

	public static void tabuada() {
		System.out.println("\nExibir a tabuada de um número");
		System.out.print("Insira o número: ");
		int num = scan.nextInt();

		System.out.print("\n");
		for(int i = 1; i < 11; i++) {
			System.out.println(" "+num+" * "+i+" = "+(num*i));
		}
	}

	public static void parouimpar() {
		System.out.println("\nDeterminar se um número é par ou impar");
		System.out.print("Insira um número inteiro: ");
		int num = scan.nextInt();

		if(num%2 == 0) {
			System.out.println(num+" é par");
		} else {
			System.out.println(num+" é impar");
		}
	}

	//Lembrei agora que provavelmente existe algo numa biblioteca de matematica pra isso
	public static void fatorial() {
		System.out.println("Calcular o fatorial de um número");
		System.out.print("Insira um número: ");
		int num = scan.nextInt();
		int result = 1;

		for(int i = num; i > 0; i--) {
			result *= i;
		}

		System.out.println(num+"! = "+result);
	}

	public static void faixaetaria() {
		System.out.println("\nDeterminar faixa etária a partir de idade");
		System.out.print("Insira sua idade: ");
		int idade = scan.nextInt();

		if (idade >= 18 && idade < 60) {
			System.out.println("Você é maior de idade!");
		} else if (idade >= 60) {
			System.out.println("Você é idoso(a)");
		} else {
			System.out.println("Você é menor de idade!");
		}
	}

	public static void somaimpar() {
		System.out.print("\nInsira o número de impares para somar: ");
		int num = scan.nextInt();
		int soma = 0;

		for(int i = 1; i < num*2; i++) {
			if(i%2 != 0) {
				soma += i;
			}
		}

		System.out.println("Resultado: "+soma);
	}

	public static void listanomes() {
		String[] nomes = new String[5];
		System.out.print("\nCrie uma lista de 5 nomes e procure um nome na lista\n");
		scan.nextLine();//Ignora um enter permitindo o primeiro next line do for abaixo funcionar corretamente

		for(int i = 0; i < 5; i++) {
			System.out.print("Insira o "+(i+1)+"° nome: ");
			nomes[i] = scan.nextLine();
		}

		System.out.print("\nInsira o nome que deseja buscar: ");
		String busca = scan.nextLine();

		boolean encontrado = false;
		for(int i = 0; i < 5; i++) {
			if(nomes[i].equals(busca)) {
				System.out.println(busca+" encontrado(a) na posição "+(i+1));
				encontrado = true;
			}
		}

		if(encontrado == false) {
			System.out.println("Busca não encontrada na lista");
		}
	}

	public static void senhasecreta() {
		String senhasecreta = "super duper hiper mega secreta";
		boolean validated = false;

		do {
			System.out.print("\nInsira a senha super duper hiper mega secreta: ");
			scan.nextLine();
			String senha = scan.nextLine();

			if(senha.equals(senhasecreta) == false) {
				System.out.println("Senha invalida, tente novamente\n");
			} else {
				validated = true;
			}
		} while (validated == false);

		System.out.println("Sucesso!");
	}

	public static void main(String[] args) {
		int opt;
	
		do {
			System.out.print("\nInsira o número da atividade, 0 para sair do programa: ");
			opt = scan.nextInt();

			switch (opt) {
				case 0:
					System.exit(0);
				case 1:
					positivonegativo();
					break;
				case 2:
					maioremenor();
					break;
				case 3:
					calcularea();
					break;
				case 4:
					tabuada();
					break;
				case 5:
					parouimpar();
					break;
				case 6:
					fatorial();
					break;
				case 7:
					faixaetaria();
					break;
				case 8:
					somaimpar();
					break;
				case 9:
					listanomes();
					break;
				case 10:
					senhasecreta();
					break;
				default:
					break;
			}
		} while (1 == 1);
	}
	
}
