package br.fatecpg.edu.model;

public class Socio {
    private String nome_socio;
    private String cnpj_cpf_do_socio;
    private String qualificacao_socio;
    private String cnpj_empresa;

    public Socio(String nome_socio, String cnpj_cpf_do_socio, String qualificacao_socio, String cnpjEmpresa) {
        this.nome_socio = nome_socio;
        this.cnpj_cpf_do_socio = cnpj_cpf_do_socio;
        this.qualificacao_socio = qualificacao_socio;
        cnpj_empresa = cnpjEmpresa;
    }

    public String getNome_socio() {
        return nome_socio;
    }

    public void setNome_socio(String nome_socio) {
        this.nome_socio = nome_socio;
    }

    public String getCnpj_cpf_do_socio() {
        return cnpj_cpf_do_socio;
    }

    public void setCnpj_cpf_do_socio(String cnpj_cpf_do_socio) {
        this.cnpj_cpf_do_socio = cnpj_cpf_do_socio;
    }

    public String getQualificacao_socio() {
        return qualificacao_socio;
    }

    public void setQualificacao_socio(String qualificacao_socio) {
        this.qualificacao_socio = qualificacao_socio;
    }

    public String getCnpj_empresa() {
        return cnpj_empresa;
    }

    public void setCnpj_empresa(String cnpj_empresa) {
        this.cnpj_empresa = cnpj_empresa;
    }

    @Override
    public String toString() {
        return "Socio:" +
                "\n\t Nome do Socio: " + nome_socio +
                "\n\t CNPJ CPF do Socio: " + cnpj_cpf_do_socio +
                "\n\t Qualificação do Socio: " + qualificacao_socio + "\n";
    }
}
