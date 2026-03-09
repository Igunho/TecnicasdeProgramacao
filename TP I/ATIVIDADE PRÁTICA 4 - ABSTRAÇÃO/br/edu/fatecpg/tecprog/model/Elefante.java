package br.edu.fatecpg.tecprog.model;

import java.util.Random;

public class Elefante {
	public String especie;
	public String cor;
	public int tamanhoDaTromba; //metros - ficou estranho
	public int tamanhoDasOrelhas; //cm?
	public int peso; //toneladas
	public boolean presasDeMarfim;
	private String segurando = null;
	
	public void Barritar() { //Aparentemente esse é o nome do som que ele faz
		System.out.println("Imagine o som de um elefante https://www.youtube.com/watch%3Fv%3D5ZUr7vCJmVU&ved=2ahUKEwi-vaHl9L-PAxW2A7kGHUJLB8QQtwJ6BAgbEAI&usg=AOvVaw3-HW2_IYnY2hWtB6Emp4eV");
	}
	
	public void BeberAgua() {
		if(segurando == null) {
			System.out.println("Bebendo água, essa água tem um bom caminho pra viajar, pelo menos " + tamanhoDaTromba);
		} else {
			System.out.println("Largando " + segurando + " para beber água");
			segurando = null;
			BeberAgua();
		}
	}
	
	public void AgarrarObjetos() {
		Random aleatorio = new Random();
		
		switch (aleatorio.nextInt(3)) {
			case 0:
				System.out.println("Segurando um graveto!");
				segurando = "graveto";
				break;
			case 1:
				System.out.println("Segurando uma pedra!");
				segurando = "pedra";
				break;
			case 2:
				System.out.println("Segurando comida");
				segurando = "comida";
				break;
		}
	}
}
