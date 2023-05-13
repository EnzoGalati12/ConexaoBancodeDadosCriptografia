package br.com.fiap.test;

import br.com.fiap.connection.UsuarioDAO;
import br.com.fiap.model.Usuario;

import java.sql.SQLException;
import java.util.List;

public class TesteSelectAll {

    public static void main(String[] args) throws Exception {
        UsuarioDAO dao = new UsuarioDAO();

        List<Usuario>  listaUser = dao.select();

        /*for(Usuario usuario : user){
            System.out.println("Usuario id:"+usuario.getId());
            System.out.println("Usuario nome:"+usuario.getNome());
            System.out.println("Usuario email:"+usuario.getEmail());
            System.out.println("Usuario senha:"+usuario.getSenha());
            System.out.println("Usuario data:"+usuario.getDataRegistro());
            System.out.println("-----------------------------------------");

        }*/

        listaUser.forEach(usu -> System.out.println("id "+ usu.getId() + " Nome " + usu.getNome()));

    }
}
