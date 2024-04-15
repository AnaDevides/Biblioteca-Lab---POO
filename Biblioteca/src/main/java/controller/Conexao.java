package controller;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexao {
    
    //PRAMETROS
    private static final String HOST = "127.0.0.1:5432";
    private static final String USUARIO = "postgres";
    private static final String SENHA = "1234";
    private static final String DATABASE = "BIBLIOTECA";
    
    //STRING DE CONEXAO 
    private static final String URL = 
            "jdbc:postgresql://" + HOST + "/" + DATABASE;
    
    //
    //CONECTAR
    //Estabelece uma nova conexao com SGBD
    public static Connection conectar(){
        
        try{
            
            //retornar uma conexao
            return DriverManager.getConnection(
                 URL,
                 USUARIO,
                 SENHA
            
            );
            
        }catch(Exception erro){
            //exibir a mensagem de erro
            System.err.println("ERRO: " + erro.getMessage());
            return null;
            
        }
        
    }
    
    //
    //DESCONECTER
    //Finaaliza a Conexao com o SGBD
    public static void desconectar(Connection con){
        try{
            //se a conexao esta ativa
            if ( con != null){
                con.close();
            }                  
        }catch(Exception erro){
            System.err.println("ERRO: " + erro.getLocalizedMessage());
        }
        
        
    }
    
    
    
    
}
