/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Livro;

public class GestaoLivroDAO extends Livro{
  private final Connection con;
    
    //enviar o comando SQL para o banco
    private PreparedStatement cmd;

    public GestaoLivroDAO() {
        this.con = Conexao.conectar();
    }
    
    
    
    public int atualizar(Livro obj) {
    try {
        String SQL = "update livros set titulo=?, autor=?, categoria=?, quantidade=?, disponibilidade=?, duracao=? WHERE isbn=?";
        
        cmd = con.prepareStatement(SQL);
        cmd.setString(1, obj.getTitulo());
        cmd.setString(2, obj.getAutor());
        cmd.setString(3, obj.getCategoria());
        cmd.setInt(4, obj.getQuantidade());
        cmd.setString(5, obj.getDisponibilidade());
        cmd.setString(6, obj.getDuracao());
        cmd.setInt(7, obj.getISBN());
        
        if (cmd.executeUpdate() > 0) {
            // Atualização realizada com sucesso
            return 1; // OK
        } else {
            return -1; // ERRO
        }
    } catch (Exception e) {
        System.err.println("ERRO: " + e.getMessage());
        return -1;
    } finally {
        Conexao.desconectar(con);
    }
}
    
    public int inserir(Livro obj){
        try{
            String SQL = "insert into livros "
                       + "(titulo,autor,categoria,isbn,quantidade,disponibilidade,duracao) values(?,?,?,?,?,?,?)";
            
            cmd = con.prepareStatement(SQL);
            cmd.setString(1, obj.getTitulo());
            cmd.setString(2, obj.getAutor());
            cmd.setString(3, obj.getCategoria());
            cmd.setInt(4, obj.getISBN());
            cmd.setInt(5, obj.getQuantidade());
            cmd.setString(6, obj.getDisponibilidade());
            cmd.setString(7, obj.getDuracao());
            
             //envia a instrucao SQL para o banco
            if (cmd.executeUpdate() > 0){
                //operacao realziada com sucesso
                return 1; //OK
            }else{
                return -1; // ERRO
            }
                     
           
        }catch (Exception e){
            System.err.println("ERRO: " + e.getMessage());
            return -1;
        }finally{
            Conexao.desconectar(con);
        }
        
    }
    
    public int deletar(String ISBN) {
    try {
        String SQL = "DELETE FROM livros WHERE isbn=?";
        
        cmd = con.prepareStatement(SQL);
        cmd.setInt(1, Integer.parseInt(ISBN));
        
        if (cmd.executeUpdate() > 0) {
            // Deleção realizada com sucesso
            return 1; // OK
        } else {
            return -1; // ERRO
        }
    } catch (Exception e) {
        System.err.println("ERRO: " + e.getMessage());
        return -1;
    } finally {
        Conexao.desconectar(con);
    }
}

    
   
        
    
    
}
