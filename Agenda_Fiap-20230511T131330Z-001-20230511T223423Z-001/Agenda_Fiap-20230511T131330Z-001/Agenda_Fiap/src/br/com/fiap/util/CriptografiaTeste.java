package br.com.fiap.util;

import static br.com.fiap.util.CriptografiaUtils.criptografar;

public class CriptografiaTeste {

    public static void main(String[] args) throws Exception {
        String senhas = "enzo";
        System.out.println(senhas);
        System.out.println(criptografar(senhas));

    }
}
