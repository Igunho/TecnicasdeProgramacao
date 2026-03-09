package br.edu.fatecpg.estacionamento.model;

import java.util.ArrayList;
import java.util.HashMap;

public class Estacionamento {
	private ArrayList<Carro> carrosEstacionados;
	private HashMap<Integer,Carro> vagasOcupadas;
	
	public Estacionamento() {
		carrosEstacionados = new ArrayList<Carro>();
		vagasOcupadas = new HashMap<Integer,Carro>();
	}
	
	public void addCarro(int vaga, Carro carro) {
		if(vagaDisponivel(vaga)) {
			carrosEstacionados.add(carro);
			vagasOcupadas.put(vaga, carro);
		} else {
			System.out.println("Vaga está indisponível");
		}
	}
	
	public void removerCarro(int vaga, Carro carro) {
		if(!vagaDisponivel(vaga)) {
			carrosEstacionados.remove(carro);
			vagasOcupadas.remove(vaga, carro);
		} else {
			System.out.println("Não há carro ocupando esta vaga");
		}
	}
	
	public void removerCarro(int vaga) {
		if(!vagaDisponivel(vaga)) {
			carrosEstacionados.remove(buscarCarro(vaga));
			vagasOcupadas.remove(vaga, buscarCarro(vaga));
		} else {
			System.out.println("Não há carro ocupando esta vaga");
		}
	}
	
	public void removerCarro(Carro carro) {
		if(!vagaDisponivel(buscarCarro(carro))) {
			carrosEstacionados.remove(buscarCarro(carro));
			vagasOcupadas.remove(buscarCarro(carro),carro);
		} else {
			System.out.println("Carro não encontrado!");
		}
	}
	
	public int buscarCarro(Carro carro) {
		int vaga = -1;
		
		for(int i : vagasOcupadas.keySet()) {
			if(vagasOcupadas.get(i).equals(carro)) {
				vaga = i;
			}
		}
		return vaga;
	}
	
	public Carro buscarCarro(int vaga) {
		return vagasOcupadas.get(vaga);
	}
	
	public boolean vagaDisponivel(int vaga) {
		if(vagasOcupadas.containsKey(vaga)) {
			return false;
		} else {
			return true;
		}
	}
	
	public String exibirCarros() {
		String carros = "";
		
		for(int i : vagasOcupadas.keySet()) {
			carros += "Vaga " + i + " | " + vagasOcupadas.get(i).toString() + "\n";
		}
		
		return carros;
	}


	//adicionar, remover e buscar carros estacionados
	//verificar disponibilidade de vagas
	//listar todos os carros e suas respectivas vagas
}
