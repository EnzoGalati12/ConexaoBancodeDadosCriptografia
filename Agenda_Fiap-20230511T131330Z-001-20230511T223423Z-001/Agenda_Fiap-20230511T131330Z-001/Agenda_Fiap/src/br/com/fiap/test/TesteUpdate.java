package br.com.fiap.test;

import br.com.fiap.connection.UsuarioDAO;
import br.com.fiap.model.Usuario;

import java.sql.SQLException;

public class TesteUpdate {
    public static void main(String[] args) throws SQLException {
        UsuarioDAO dao = new UsuarioDAO();
        Usuario user = new Usuario("Rafaela","rafinha@gmail.com","54321");

        dao.update(user);
    }

}
