package br.edu.fatecpg.estacionamento.view;

import br.edu.fatecpg.estacionamento.model.*;

public class Main {

	public static void main(String[] args) {
		Estacionamento est = new Estacionamento();
		Cliente disney = new Cliente("Walt Disney","0800");
		Cliente wb = new Cliente("Warner Brothers","3472");
		Carro marquinhos = new Carro("abc0000", "relampago", "vermelho",disney);
		Carro mate = new Carro("abc0002", "sei lá", "marrom",disney);
		Carro bumblebee = new Carro("abc0007", "camaro", "amarelo",wb);
		Carro optimus = new Carro("abc0020", "prime", "azul",wb);
		
		marquinhos.notificarProprietario("katchau!");

		marquinhos.entrarNoEstacionamento(0, est, 17,45);
		mate.entrarNoEstacionamento(3, est, 17,46);
		bumblebee.entrarNoEstacionamento(7, est, 17,47);
		optimus.entrarNoEstacionamento(12, est, 17,51);
		est.addCarro(0, marquinhos);
		est.addCarro(3, mate);
		est.addCarro(7, bumblebee);
		est.addCarro(3, optimus);
		est.addCarro(12, optimus);
		//System.out.println(est.getCarrosEstacionados().get(0).getCor());
		//System.out.println(est.getVagasOcupadas().get(0).getCor());
		
		//System.out.println(est.buscarCarro(bumblebee));
		int vagaParaRemover = est.buscarCarro(bumblebee);
		
		est.removerCarro(vagaParaRemover, bumblebee);
		/*for(int i = 0; i < est.getCarrosEstacionados().size(); i++) {
			System.out.println(est.getCarrosEstacionados().get(i).getModelo());
		}*/
		
		//System.out.println(est.vagaDisponivel(0));
		bumblebee.sairDoEstacionamento(19,02);
		System.out.println(bumblebee.getTempoEstacionado());
		System.out.println(bumblebee.calcularCustoEstacionamento(20));
		System.out.println(est.exibirCarros());
	}

}
