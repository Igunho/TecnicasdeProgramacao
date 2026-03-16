package br.fatecpg.edu.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    public static Connection connect() {
        try{
            var jdbcUrl = "jdbc:postgresql://localhost:5432/db_cnpj";
            var user = "postgres";
            var password = "sql123";
            return DriverManager.getConnection(jdbcUrl, user, password);
        }catch (SQLException e){
            System.err.println(e.getMessage());
            return null;
        }
    }

}
