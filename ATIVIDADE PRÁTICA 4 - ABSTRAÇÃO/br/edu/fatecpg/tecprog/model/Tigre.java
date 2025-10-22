package br.edu.fatecpg.tecprog.model;

public class Tigre {
	public String cor;
	public String habitat;
	public int peso; //kg
	public int altura; //cm
	public int expectativaDeVida; //anos
	public boolean listrado;
	private boolean cacando = false;
	
	public void Cacar() {
		if(cacando == true) {
			System.out.println("Já está caçando");
		} else {
			System.out.println("Perseguindo presa!");
			cacando = true;
		}
	}
	
	public void Rugir() {
		System.out.println("Rugido! https://www.youtube.com/watch%3Fv%3D_J2D3fNj6Rg&ved=2ahUKEwjFq7zl7r-PAxWSLrkGHeQiOsIQtwJ6BAgSEAI&usg=AOvVaw1tG2ebdFLby29ElshrNDTd");
	}
	
	public void Nadar() {
		System.out.println("Nadando!");
	}
}
