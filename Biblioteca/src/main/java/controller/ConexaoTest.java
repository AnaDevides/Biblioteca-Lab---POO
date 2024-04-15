package controller;

import java.sql.Connection;

public class ConexaoTest {
    
    public static void main(String[] args) {
        
        //Conectar no SGBD
        Connection con = Conexao.conectar();
        
        if ( con!= null){
            System.out.println("Conexao realizada com sucesso");
            Conexao.desconectar(con);
        }
        
    } 
}
