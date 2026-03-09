package br.edu.fatecpg.projdbc.tarefas.view;

import br.edu.fatecpg.projdbc.tarefas.db.DB;
import br.edu.fatecpg.projdbc.tarefas.model.Tarefa;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class  Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try(var connection = DB.connect()) {
            System.out.println("Conexão concluida com sucesso");

            do {
                System.out.println("---MENU---\n1 - Adicionar tarefa\n2 - Listar tarefas\n3 - Excluir tarefa\n4 - Editar tarefa");
                int opt = sc.nextInt();

                switch (opt) {
                    case 1:
                        String query = "INSERT INTO tarefas(nm_tarefa,nm_categoria,st_tarefa) VALUES (?, ?, 'false')";
                        PreparedStatement stmt = connection.prepareStatement(query);
                        System.out.print("Insira o nome da tarefa: ");
                        sc.nextLine();
                        String nome = sc.nextLine();
                        System.out.print("Insira a categoria da tarefa: ");
                        String categoria = sc.nextLine();
                        stmt.setString(1,nome);
                        stmt.setString(2,categoria.toUpperCase());
                        stmt.execute();
                        break;
                    case 2:
                        List<Tarefa> tarefas = new ArrayList<>();
                        query = "SELECT * FROM tarefas";
                        stmt = connection.prepareStatement(query);
                        ResultSet rs = stmt.executeQuery();
                        while(rs.next()) {
                            tarefas.add(new Tarefa(rs.getInt("id_tarefa"), rs.getString("nm_tarefa"),rs.getString("nm_categoria"),rs.getBoolean("st_tarefa")));
                        }
                        tarefas.forEach(System.out::println);
                        break;
                    case 3:
                        query = "DELETE FROM tarefas WHERE id_tarefa = ?";
                        System.out.print("Insira o id da tarefa que deseja deletar: ");
                        int id = sc.nextInt();
                        stmt = connection.prepareStatement(query);
                        stmt.setInt(1,id);
                        stmt.execute();
                        break;
                    case 4:
                        tarefas = new ArrayList<>();
                        query = "SELECT * FROM tarefas WHERE id_tarefa = ?";
                        System.out.print("Insira o id da tarefa que deseja editar: ");
                        id = sc.nextInt();
                        stmt = connection.prepareStatement(query);
                        stmt.setInt(1,id);
                        rs = stmt.executeQuery();
                        while (rs.next()) {
                            tarefas.add(new Tarefa(rs.getInt("id_tarefa"), rs.getString("nm_tarefa"), rs.getString("nm_categoria"), rs.getBoolean("st_tarefa")));
                        }
                        System.out.println("(digite 0 para manter o nome e categoria)");
                        System.out.println("Insira o nome da tarefa: ");
                        sc.nextLine();
                        nome = sc.next();
                        if (nome.equals("0")) { nome = tarefas.getFirst().getNome(); }
                        System.out.println("Insira a categoria da tarefa: ");
                        categoria = sc.next();
                        if (categoria.equals("0")) { categoria = tarefas.getFirst().getCategoria(); }
                        System.out.println("Insira o status da tarefa em forma de booleano: ");
                        boolean status = sc.nextBoolean();
                        query = "UPDATE tarefas SET nm_tarefa = ?, nm_categoria = ?, st_tarefa = ? WHERE id_tarefa = ?";
                        stmt = connection.prepareStatement(query);
                        stmt.setString(1,nome);
                        stmt.setString(2,categoria);
                        stmt.setBoolean(3,status);
                        stmt.setInt(4,id);
                        stmt.execute();
                        break;
                }
            } while (true);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}