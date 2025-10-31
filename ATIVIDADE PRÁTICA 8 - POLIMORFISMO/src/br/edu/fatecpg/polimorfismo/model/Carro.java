package br.edu.fatecpg.polimorfismo.model;

/*1. Sobrescrita de métodos em uma hierarquia de veículos
Enunciado: Implemente uma classe base chamada Veiculo que possua um método mover(). Crie
duas subclasses: Carro e Bicicleta, que sobrescrevam o método mover() com
comportamentos específicos. A classe Carro deve imprimir "O carro está dirigindo"
e a classe Bicicleta deve imprimir "A bicicleta está pedalando".

Pergunta: Explique como a sobrescrita de métodos permite comportamentos diferentes para objetos
da mesma hierarquia.*/

public class Carro extends Veiculo {
	public void mover() {
		System.out.println("O Carro está dirigindo");
	}
}