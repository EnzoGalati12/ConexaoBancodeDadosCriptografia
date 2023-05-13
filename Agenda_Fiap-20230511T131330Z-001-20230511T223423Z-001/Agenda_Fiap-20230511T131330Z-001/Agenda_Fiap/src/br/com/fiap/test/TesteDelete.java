package br.com.fiap.test;

import br.com.fiap.connection.UsuarioDAO;
import br.com.fiap.model.Usuario;

import java.sql.SQLException;

public class TesteDelete {
    public static void main(String[] args) throws SQLException {
        UsuarioDAO DAO = new UsuarioDAO();


        DAO.delete(23L);
    }

}
