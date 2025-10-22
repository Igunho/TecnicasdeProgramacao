package br.edu.fatecpg.tecprog.model;

public class Leao {
	public String cor; 
	public int altura; //cm
	public int idade; //anos
	public int peso; //kg
	private boolean cacando;
	
	public void Cacar() {
		if(cacando == true) {
			System.out.println("Já está caçando");
		} else {
			System.out.println("Perseguindo presa!");
			cacando = true;
		}
	}
	
	public void Rugir() {
		System.out.println("Rugido! https://www.youtube.com/watch%3Fv%3D58ioAdESOLQ&ved=2ahUKEwissfHZ8r-PAxXfE7kGHfOoLWIQtwJ6BAgTEAI&usg=AOvVaw3mfR7TNQF2Px9RrKpyK6wJ");
	}
	
	public void Dormir() {
		System.out.print("Dormindo");
		for(int i = 0; i < 3; i++) {
			System.out.print("... ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt(); //Achei isso no stack overflow
			}
		}
		System.out.println("\nAcordado!");
	}
}
