package br.com.fiap.test;

import br.com.fiap.connection.UsuarioDAO;

import java.sql.SQLException;


public class TesteSelectById {

    public static void main(String[] args) throws Exception {
        UsuarioDAO dao = new UsuarioDAO();

        System.out.println(dao.selectById(1L).getNome());
    }




}
