package br.fatecpg.edu.view;

import br.fatecpg.edu.db.DB;
import br.fatecpg.edu.model.Empresa;
import br.fatecpg.edu.model.Socio;
import br.fatecpg.edu.services.Api;
import com.google.gson.Gson;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        //33014556000196 Americanas
        //33041260065290 Casas Bahia
        //62823257012964 Fatec Praia Grande
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira CNPJ para consultar:");
        String cnpj = scan.nextLine();
        Gson gson = new Gson();

        try(var connection = DB.connect()) {
            List<Empresa> empresas = new ArrayList<>();
            List<Socio> socios = new ArrayList<>();
            String select = "SELECT nome_socio, cnpj_cpf_do_socio, qualificacao_socio FROM socio WHERE cnpj_empresa = ?";
            PreparedStatement stmt = connection.prepareStatement(select);
            stmt.setString(1,cnpj);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                socios.add(new Socio(rs.getString("nome_socio"), rs.getString("cnpj_cpf_do_socio"), rs.getString("qualificacao_socio"), cnpj));
            }

            select = "SELECT cnpj, razao_social, nome_fantasia, logradouro FROM empresa WHERE cnpj = ?";
            stmt = connection.prepareStatement(select);
            stmt.setString(1,cnpj);
            rs = stmt.executeQuery();

            while (rs.next()) {
                empresas.add(new Empresa(rs.getString("cnpj"), rs.getString("razao_social"), rs.getString("nome_fantasia"), rs.getString("logradouro"), socios));
            }

            for(Empresa empresa : empresas) {
                if(empresa.getCnpj().equals(cnpj)) {
                    System.out.println(empresa);
                } else {
                    Empresa emp = gson.fromJson(Api.cnpj(cnpj), Empresa.class);

                    System.out.println(emp);

                    String insert = "INSERT INTO empresa VALUES (?, ?, ? ,?)";
                    stmt = connection.prepareStatement(insert);
                    stmt.setString(1, emp.getCnpj());
                    stmt.setString(2, emp.getRazao_social());
                    stmt.setString(3, emp.getNome_fantasia());
                    stmt.setString(4, emp.getLogradouro());

                    stmt.execute();

                    for(Socio socio  : emp.getQsa()) {
                        insert = "INSERT INTO socio VALUES (?, ?, ?, ?)";
                        stmt = connection.prepareStatement(insert);
                        stmt.setString(1,socio.getNome_socio());
                        stmt.setString(2,socio.getCnpj_cpf_do_socio());
                        stmt.setString(3,socio.getQualificacao_socio());
                        stmt.setString(4,emp.getCnpj());

                        stmt.execute();
                    }
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

}
