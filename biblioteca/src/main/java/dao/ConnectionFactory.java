package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static final String URL = "jdbc:mysql://localhost/test";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    private static Connection conn;

    public static Connection getConexao() {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Conexão com o banco de dados estabelecida com sucesso!");
            } catch (SQLException e) {
                System.out.println("Falha ao conectar ao banco de dados: " + e.getMessage());
            }
        }
        return conn;
    }
    
    
    public static void fecharConexao() {
        if (conn != null) {
            try {
                conn.close();
                System.out.println("Conexão com o banco de dados fechada.");
            } catch (SQLException e) {
                System.out.println("Erro ao fechar a conexão: " + e.getMessage());
            }
        }
    }
}
