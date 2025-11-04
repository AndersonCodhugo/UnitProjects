package com.firstapp.atividadeoito.config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public String driver = "com.mysql.cj.jdbc.Driver";
    public String url = "jdbc:mysql://localhost:3306/hotel_db";
    public String usuario = "root";
    public String senha = "admin";

    public Connection getConnectionFactory() throws SQLException {
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, usuario, senha);
            return conn;
        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver do banco de dados não encontrado.", e);
        }
    }
}
