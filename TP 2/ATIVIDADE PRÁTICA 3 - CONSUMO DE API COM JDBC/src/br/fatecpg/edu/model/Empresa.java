package br.fatecpg.edu.model;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import br.fatecpg.edu.model.Socio;

public class Empresa {
    private String cnpj;
    private String razao_social;
    private String nome_fantasia;
    private String logradouro;
    private List<Socio> qsa;

    public Empresa(String cnpj, String razao_social, String nome_fantasia, String logradouro, List<Socio> qsa) {
        this.cnpj = cnpj;
        this.razao_social = razao_social;
        this.nome_fantasia = nome_fantasia;
        this.logradouro = logradouro;
        this.qsa = qsa;
    }

    public Empresa(String cnpj, String razao_social, String nome_fantasia, String logradouro) {
        this.cnpj = cnpj;
        this.razao_social = razao_social;
        this.nome_fantasia = nome_fantasia;
        this.logradouro = logradouro;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    public String getNome_fantasia() {
        return nome_fantasia;
    }

    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public List<Socio> getQsa() {
        return qsa;
    }

    public void setQsa(List<Socio> qsa) {
        this.qsa = qsa;
    }

    @Override
    public String toString() {
        return "Empresa: " +
                "\n CNPJ: " + cnpj +
                "\n Razão Social: " + razao_social +
                "\n Nome Fantasia: " + nome_fantasia +
                "\n Logradouro: " + logradouro +
                "\n QSA: " + qsa + "\n";
    }
}
