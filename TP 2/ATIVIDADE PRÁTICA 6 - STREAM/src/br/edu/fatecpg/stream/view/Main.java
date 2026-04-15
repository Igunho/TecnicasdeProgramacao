package br.edu.fatecpg.stream.view;

import br.edu.fatecpg.stream.model.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("jorge","limpeza",2,30));
        funcionarios.add(new Funcionario("alessandro","limpeza",14000,9));
        funcionarios.add(new Funcionario("rogerio","biqueira",100000,1));
        funcionarios.add(new Funcionario("astride","adestração",4000,16));
        funcionarios.add(new Funcionario("finn","adestração",9000,20));
        funcionarios.add(new Funcionario("rigby","parque",1600,2));
        funcionarios.add(new Funcionario("goku","biqueira",20000,40));
        funcionarios.add(new Funcionario("casimiro","streaming",5000000,5));

        System.out.print("Funcionários que recebem mais de R$2.000:\n");
        funcionarios.stream().filter(f -> f.getSalario() > 2000).forEach(System.out::println);

        System.out.print("\nAumento de 5% em funcionarios que trabalham a mais de 10 anos:\n");
        funcionarios.stream().filter(f -> f.getAnosServico() > 10).map(f -> {f.setSalario(f.getSalario()*1.05); return f;}).toList();
        funcionarios.forEach(System.out::println);

        System.out.println("\nFuncionarios ordenados em ordem alfabetica\n");
        funcionarios.stream().sorted((f1,f2)->f1.getNome().compareTo(f2.getNome())).forEach(System.out::println);

        System.out.println("\nTotal gasto com salario dos funcionarios\n");
        double gastoTotalSalario = funcionarios.stream().map(f -> f.getSalario()).reduce(0.0, Double::sum);
        System.out.println(gastoTotalSalario);

        System.out.println("\nMedia dos salarios de cada departamento\n");
        Map<String, Double> agrupar = funcionarios.stream().collect(
                Collectors.groupingBy(f -> f.getDepartamento(),
                Collectors.averagingDouble(f -> f.getSalario())));

        agrupar.forEach((i, j) -> {
            System.out.println("Departamento: " + i + ", MediaSalario: " + j);
        });

    }
}
