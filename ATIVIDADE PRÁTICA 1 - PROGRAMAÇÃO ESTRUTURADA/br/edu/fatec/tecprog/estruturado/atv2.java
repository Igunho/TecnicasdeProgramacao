package br.edu.fatec.tecprog.estruturada;

import java.util.Scanner;

public class atv2 {
	static Scanner scan = new Scanner(System.in);

	public static void somamatrizes() { //Francisco
		int[][] matriz = new int[3][3];
		int[][] matriz2 = new int[3][3];
		int[][] result = new int[3][3];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("insira um numero: ");
				matriz[i][j] = scan.nextInt();
			}
		}

		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("insira um numero: ");
				matriz2[i][j] = scan.nextInt();
			}
		}

		for(int a = 0; a < 3 ; a++) {
			for(int b = 0; b < 3; b++) {
				result[a][b] = matriz[a][b] + matriz2[a][b];
			}
		}

		for(int a = 0; a < 3 ; a++) {
			for(int b = 0; b < 3; b++) {
				System.out.print("["+result[a][b]+"]");
			}
		System.out.print("\n");
		}
	}

	public static void matrizescala() { //Igor
		scan.nextLine();
		boolean validpass = false;
		boolean validlogin = false;

		String[][] dados = { 
			{"francisco","frederico","fernando","francinildo","francielly","ferrari"}, 
			{"f123","f234","f345","f456","f567","f678"} 
		};

		do {
			System.out.print("\nInsira o login: ");
			String login = scan.nextLine();
			int login_i = 0;
			
			for(int i = 0; i < 6; i++) {
				if(dados[0][i].equals(login)) {
					validlogin = true;
					login_i = i;

				} 
			}

			if (validlogin == true) {
				System.out.print("Insira sua senha: ");
				String senha = scan.nextLine();

				if(dados[1][login_i].equals(senha)) {
					validpass = true;
				} else {
					System.out.println("Senha invalida");
				}
			} else {
				System.out.println("Login invalido");
			}
		} while (validpass == false);

		System.out.println("\nBem vindo(a)!\n");
	}

	public static void transposicaomatriz() {
		System.out.print("Defina o numero de colunas da matriz: ");
		int column  = scan.nextInt();
		System.out.print("Defina o numero de linhas da matriz: ");
		int rows = scan.nextInt();

		System.out.println();

		int[][] matriz_normie = new int[rows][column];
		
		for(int i = 0; i < rows; i++ ) {
			for( int a = 0; a < column; a++) {
				System.out.print("Insira valor da matriz: ");
				matriz_normie[i][a] = scan.nextInt();
			}
		}

		
		int[][] matriz_inv = new int[column][rows];

		for(int i = 0; i < rows; i++) {
			for(int a = 0; a < column; a++) {
				matriz_inv[a][i] = matriz_normie[i][a];

			}
		}

		/*for(int a = 0; a < rows ; a++) {
			for(int b = 0; b < column; b++) {
				System.out.print("["+matriz_normie[a][b]+"]");
			}
			System.out.print("\n");
		}

		System.out.println();*/

		for(int a = 0; a < column ; a++) {
			for(int b = 0; b < rows; b++) {
				System.out.print("["+matriz_inv[a][b]+"]");
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		do {
			System.out.print("1 - Soma de Matrizes\n2 - Multiplicação de Matriz por escala\n3 - Transposição de Matriz\n");
			int input = scan.nextInt();

			switch (input) {
				case 1:
					somamatrizes();
					break;
				case 2:
					matrizescala();
					break;
				case 3:
					transposicaomatriz();
					break;
				default:
					System.exit(0);
			}
		}

		while (1 == 1);
	}
}