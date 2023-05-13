package br.com.fiap.test;

import br.com.fiap.connection.ConnectionFactory;
import br.com.fiap.connection.UsuarioDAO;
import br.com.fiap.model.Usuario;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) throws SQLException {

        new ConnectionFactory().conectar();

        UsuarioDAO dao = new UsuarioDAO();

        
        Usuario pedro = new Usuario("Pedro", "pedro@gmail.com", "987654");
        Usuario enzo = new Usuario("Enzo", "enzo@gmail.com", "123456");
        Usuario luigi = new Usuario("Luigi", "luigi@gmail.com", "lulu");
        Usuario ricardo = new Usuario("Ricardo", "ricardo@gmail.com", "ricardo");

        List<Usuario> lista = new ArrayList<Usuario>();

        lista.add(ricardo);

        for(Usuario usuario: lista){
            dao.insert(usuario);
        }






    }
}
