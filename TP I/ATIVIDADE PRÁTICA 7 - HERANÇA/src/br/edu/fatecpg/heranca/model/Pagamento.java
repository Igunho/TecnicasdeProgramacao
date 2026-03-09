package br.edu.fatecpg.heranca.model;

/* Interface de Pagamentos
 Crie uma interface chamada Pagamento com os seguintes métodos:
 calcularPagamento(): Sem parâmetros, deve ser implementado para calcular o valor do pagamento.
 emitirRecibo(): Retorna um recibo detalhado da transação.*/

public interface Pagamento {
	public double calcularPagamento();
	public String emitirRecibo();
}