package br.edu.fatecpg.tecprog.model;

public class Pinguim {
	
	public String especie;
	public Double altura; 
	public String cor_plumagem;
	public int idade;
	public int velocidade;
	public int filhotes;
	
	public void nadar() {
		velocidade += 7;
		System.out.println("o pinguim está nadando a" + "m/h");
	}
	
	public void andar(){
		if(velocidade == 0) {
			velocidade += 5;
			System.out.println("o pinguim está andando a" + "m/h");
		} else{
			System.out.println("o pinguim está faznedo outra açao "); 
		}
		
	}
	
	public void deslizar() { 
		if(velocidade == 0) {
			velocidade += 10;
			System.out.println("o pinguim está dslizando a" + "m/h");
		} else{
			System.out.println("o pinguim está faznedo outra açao "); 
		}
	}
	
	public void chocar_ovos() {
		int chocar = (int)(Math.random() * 2);
		if(chocar == 0) {
			System.out.println("o pinguim está sentado no ovo (tem que ser muito maccho pra fazer isso)");
		}else if(chocar == 2) {
			System.out.println("o pinguim está chocando o ovo (ele pode chocar a qualquer momento...)");
		}else{
			System.out.println("O OVO CHOCOU!!!! ('>')");
			filhotes++;
			
		}
		
	}
	
	public void alimentar_filhotes() {
		if(filhotes == 0) {
			System.out.println("sem filhotes para alimentar");
		}else {
			System.out.println("alimentando " + filhotes + " filhotes");
		}
	}
}
