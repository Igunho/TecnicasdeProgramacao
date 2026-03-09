package br.edu.fatecpg.consultaCEP.services;

import br.edu.fatecpg.consultaCEP.model.Endereco;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsomeApi {
    public static String viaCEP(String cep) {
        try {
            //Cria uma variavel representando um cliente HTTP que armazena uma instância da classe HTTPClient
            HttpClient cliente = HttpClient.newHttpClient();
            //Cria requisição HTTP, define uma URI para a requisição e a armazena na variável requisição
            HttpRequest requisicao = HttpRequest.newBuilder().uri(URI.create("https://viacep.com.br/ws/"+cep+"/json/")).build();
            //Envia a requisição criada para o cliente e armazena a resposta HTTP numa variavel
            HttpResponse<String> resposta = cliente.send(requisicao, HttpResponse.BodyHandlers.ofString());

            return resposta.body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
