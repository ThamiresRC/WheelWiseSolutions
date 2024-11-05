package org.example.dao;

import org.example.model.Cliente;
import org.example.model.Pessoa;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDaoImplementada implements ClienteDao {
    private final Connection connection;

    public ClienteDaoImplementada(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void create(Pessoa cliente) throws SQLException {
        String sql = "INSERT INTO projectPorto (nome, cpf, email, endereco, telefone) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, cliente.getNome());
            pstmt.setString(2, cliente.getCpf());
            pstmt.setString(3, cliente.getEmail());
            pstmt.setString(4, cliente.getEndreco());
            pstmt.setInt(5, cliente.getTelefone());
            pstmt.executeUpdate();
        }
    }

    @Override
    public List<Pessoa> read() throws SQLException {
        List<Pessoa> result = new ArrayList<>();
        String sql = "SELECT * FROM projectPorto";
        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");
                String email = rs.getString("email");
                String endereco = rs.getString("endereco");
                int telefone = rs.getInt("telefone");
                int id = rs.getInt("id");
                result.add(new Cliente(nome, cpf, email, endereco, telefone, id));
            }
        }
        return result;
    }

    @Override
    public void update(Pessoa pessoa) throws SQLException {
        String sql = "UPDATE projectPorto SET nome = ?, email = ?, endereco = ?, telefone = ?, cpf = ? WHERE id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, pessoa.getNome());
            pstmt.setString(2, pessoa.getEmail());
            pstmt.setString(3, pessoa.getEndreco());
            pstmt.setInt(4, pessoa.getTelefone());
            pstmt.setString(5, pessoa.getCpf());
            pstmt.setInt(6, pessoa.getId());
            pstmt.executeUpdate();
        }
    }

    @Override
    public void delete(Long id) throws SQLException {
        String sql = "DELETE FROM projectPorto WHERE id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setLong(1, id);
            pstmt.executeUpdate();
        }
    }
}
