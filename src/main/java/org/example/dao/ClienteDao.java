package org.example;

import org.example.model.Pessoa;

import java.sql.SQLException;
import java.util.List;

public interface ClienteDao {

    void create(Pessoa pessoa) throws SQLException;

    List<Pessoa> read() throws SQLException;

    void update(Pessoa pessoa) throws SQLException;

    void delete(Long id) throws SQLException;
}



