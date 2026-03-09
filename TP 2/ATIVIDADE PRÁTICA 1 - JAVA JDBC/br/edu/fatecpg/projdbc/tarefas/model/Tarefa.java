package br.edu.fatecpg.projdbc.tarefas.model;

public class Tarefa {
    private int id;
    private String nome;
    private String categoria;
    private boolean status;

    public Tarefa(int id, String nome, String categoria, boolean status) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        if (status) {
            return  "ID: " + id +
                    ", Tarefa: '" + nome + '\'' +
                    ", Categoria: '" + categoria + '\'' +
                    ", Concluida!";
        } else {
            return  "ID: " + id +
                    ", Tarefa: '" + nome + '\'' +
                    ", Categoria: '" + categoria + '\'' +
                    ", Em Aberto";
        }
    }
}
