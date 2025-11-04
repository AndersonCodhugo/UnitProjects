package com.firstapp.atividadeoito.dao;

import com.firstapp.atividadeoito.config.ConnectionFactory;
import com.firstapp.atividadeoito.model.Reserva;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReservaDAO implements AutoCloseable {

    private Connection connection;

    public ReservaDAO() throws SQLException {
        this.connection = new ConnectionFactory().getConnectionFactory();
    }

    public void salvarReserva(Reserva reserva) throws SQLException {
        String sql = "INSERT INTO reservas (nome, sexo, email, data_chegada, numero_noites, numero_hospedes, mensagem) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, reserva.getNome());
            stmt.setString(2, reserva.getSexo());
            stmt.setString(3, reserva.getEmail());
            stmt.setDate(4, Date.valueOf(reserva.getDataChegada()));
            stmt.setInt(5, reserva.getNumeroNoites());
            stmt.setInt(6, reserva.getNumeroHospedes());
            stmt.setString(7, reserva.getMensagem());

            stmt.executeUpdate();

            try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    reserva.setId(generatedKeys.getLong(1));
                }
            }
        }
    }

    public List<Reserva> listarReservasPorEmail(String email) throws SQLException {
        List<Reserva> reservas = new ArrayList<>();
        String sql = "SELECT id, nome, sexo, email, data_chegada, numero_noites, numero_hospedes, mensagem FROM reservas WHERE email = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, email);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Reserva reserva = new Reserva();
                    reserva.setId(rs.getLong("id"));
                    reserva.setNome(rs.getString("nome"));
                    reserva.setSexo(rs.getString("sexo"));
                    reserva.setEmail(rs.getString("email"));
                    reserva.setDataChegada(rs.getDate("data_chegada").toLocalDate());
                    reserva.setNumeroNoites(rs.getInt("numero_noites"));
                    reserva.setNumeroHospedes(rs.getInt("numero_hospedes"));
                    reserva.setMensagem(rs.getString("mensagem"));
                    reservas.add(reserva);
                }
            }
        }
        return reservas;
    }

    @Override
    public void close() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }
}
