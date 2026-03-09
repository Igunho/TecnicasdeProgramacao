package br.edu.fatecpg.consultaCEP.view;

import br.edu.fatecpg.consultaCEP.services.ConsomeApi;
import br.edu.fatecpg.consultaCEP.model.Endereco;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Endereco> historico = new ArrayList<>();
        Gson gson = new Gson();

        do {
            System.out.println("==MENU==\n1. Buscar Endereço\n2. Excluir endereço da lista\n3. Histórico");
            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    System.out.print("Insira um CEP para busca: ");
                    String cep = Integer.toString(sc.nextInt());

                    if (!historico.isEmpty()) {
                        for(Endereco end : historico) {
                            if(end.getCep().equals(cep)) {
                                System.out.println(end+"\n");
                            } else {
                                historico.add(gson.fromJson(ConsomeApi.viaCEP(cep), Endereco.class));
                                System.out.println(end+"\n");
                                break;
                            }
                        }
                    } else {
                        Endereco end = gson.fromJson(ConsomeApi.viaCEP(cep), Endereco.class);
                        historico.add(end);
                        System.out.println(end+"\n");
                    }
                    break;
                case 2:
                    System.out.print("Insira um CEP para exluir: ");
                    cep = Integer.toString(sc.nextInt());

                    if (!historico.isEmpty()) {
                        for (Endereco end : historico) {
                            if (end.getCep().equals(String.join("-",cep.substring(0,5),cep.substring(5,8)))) {
                                historico.remove(end);
                                break;
                            } else {
                                System.out.println("Endereço não encontrado no histórico"+"\n");
                                break;
                            }
                        }
                    } else {
                        System.out.println("Não há endereços registrados no histórico"+"\n");
                        break;
                    }
                case 3:
                    System.out.println("\nHISTORICO\n");
                    for(Endereco end : historico) {
                        System.out.println(end);
                    }
                    break;
            }
        } while (true);
    }
}
