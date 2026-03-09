package br.edu.fatecpg.heranca.model;

//  A classe PagamentoCartao deve incluir uma taxa de 5% sobre o valor do pagamento.

public class PagamentoCartao implements Pagamento{
	private double valor;

	public PagamentoCartao(double valor) {
		this.valor = valor;
	}

 	public double calcularPagamento() {
 		return valor*1.05;
 	}

	public String emitirRecibo() {
		return "Valor base: R$"+valor+"\n"+
				"Método de pagamento: Cartão\n"+
				"Taxa: 5%\n"+
				"Valor Final: R$"+calcularPagamento();
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}