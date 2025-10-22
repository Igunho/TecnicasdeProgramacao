package br.edu.fatecpg.heranca.model;

//  A classe PagamentoDinheiro deve aplicar um desconto de 10% sobre o valor do pagamento.

public class PagamentoDinheiro implements Pagamento{
	private double valor;

	public PagamentoDinheiro(double valor) {
		this.valor = valor;
	}

 	public double calcularPagamento() {
 		return valor*1.1;
 	}

	public String emitirRecibo() {
		return "Valor base: R$"+valor+"\n"+
				"Método de pagamento: Dinheiro\n"+
				"Taxa: 10%\n"+
				"Valor Final: R$"+calcularPagamento();
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}