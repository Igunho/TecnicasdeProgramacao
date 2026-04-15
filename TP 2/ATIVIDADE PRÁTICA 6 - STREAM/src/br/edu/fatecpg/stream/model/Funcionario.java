package br.edu.fatecpg.stream.model;

public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private int anosServico;

    public Funcionario(String nome, String departamento, double salario, int anosServico) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.anosServico = anosServico;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setAnosServico(int anosServico) {
        this.anosServico = anosServico;
    }

    public String getNome() {
        return nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getSalario() {
        return salario;
    }

    public int getAnosServico() {
        return anosServico;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", departamento='" + departamento + '\'' +
                ", salario=" + salario +
                ", anosServico=" + anosServico +
                '}';
    }
}
