package br.edu.fatecpg.estacionamento.model;

public class Carro {
	private String placa;
	private String modelo;
	private String cor;
	private Cliente clienteProprietario;
	private Estacionamento estacionamentoAtual;
	private int tempoEstacionado;
	
	public Carro(String placa, String modelo, String cor, Cliente cliente) {
		this.placa = placa;
		this.modelo = modelo;
		this.cor = cor;
		this.clienteProprietario = cliente;
	}
	
	public void entrarNoEstacionamento(int vaga, Estacionamento estacionamento, int horaAtual, int minutoAtual) {
		estacionamento.addCarro(vaga, this);
		estacionamentoAtual = estacionamento;
		tempoEstacionado = (horaAtual * 60)+minutoAtual;
	}
	
	public void sairDoEstacionamento(int horaAtual, int minutoAtual) {
		estacionamentoAtual.removerCarro(this);
		tempoEstacionado -= (horaAtual * 60)+minutoAtual;
		tempoEstacionado *= -1;
	}
	
	public double calcularCustoEstacionamento(double tarifaPorHora) {
		return tempoEstacionado*tarifaPorHora/60;
	}
	
	public void notificarProprietario(String mensagem) {
		System.out.println(mensagem);
	}

	public String getPlaca() {
		return placa;
	}

	public String getModelo() {
		return modelo;
	}

	public String getCor() {
		return cor;
	}

	public Cliente getClienteProprietario() {
		return clienteProprietario;
	}
	
	public int getTempoEstacionado() {
		return tempoEstacionado;
	}

	@Override
	public String toString() {
		return "Carro [Placa: " + placa + ", Modelo: " + modelo + ", Cor: " + cor + ", Cliente: "
				+ clienteProprietario.getNome() + "]";
	}
	
}
