package br.com.fiap.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CriptografiaUtils {

    public static String criptografar (String senhas) throws Exception {
        //OBTEM A INSTANCIA DE UM ALGORITMO
        MessageDigest md = MessageDigest.getInstance("MD5");
        //PASSA OS DADOS AS SEREM CRIPTOGRAFADOS E ESTIPULA ENCODING PADRÃO
        md.update(senhas.getBytes("ISO-8859-1"));
        //GERA A CHAVE CRIPTOGRAFADA EM ARRAY DE BYTES PARA POSTERIOR HASHING
        BigInteger hash = new BigInteger(1,md.digest());
        //RETORNA A SENHA CRIPTOGRAFADA
        return hash.toString(16);
    }
}
