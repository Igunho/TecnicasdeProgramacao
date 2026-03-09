package br.edu.fatecpg.polimorfismo.model;

/*pagamento dentro de um sistema sem alterar o código da classe base?
5. Sobrecarga de métodos em uma classe de conversão
Enunciado:
Implemente uma classe chamada Conversor que contenha três versões sobrecarregadas
do método converter():
● A primeira versão deve converter uma temperatura de Celsius para Fahrenheit.
● A segunda versão deve converter um valor de quilômetros para milhas.
● A terceira versão deve converter uma string para letras maiúsculas.
● Teste todas as versões do método converter() chamando cada uma com os
parâmetros adequados.
Pergunta:​
Explique como a sobrecarga de métodos permite implementar várias versões do método
converter(), mesmo com diferentes tipos de dados e funcionalidades.*/

public class Conversor {
	public int converter(int celsius) {
		return ((celsius * 9/5) + 32);
	} 

	public double converter(double quilometros) {
		return (quilometros * 0.621371);
	} 

	public String converter(String text) {
		return (text.toLowerCase());
	}
}