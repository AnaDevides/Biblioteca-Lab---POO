/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Livro;

public class PesquisaLivroDAO extends Livro{
//estabelecer a conexao com o banco
    private final Connection con;
    
    //enviar o comando SQL para o banco
    private PreparedStatement cmd;
    
    public PesquisaLivroDAO() {
        this.con = Conexao.conectar();
    }
    
    
    public List<Livro> listar(){
        try{
            String SQL = "select * from livros order by isbn";
            cmd = con.prepareStatement(SQL);
            List<Livro> lista = new ArrayList<>();
                ResultSet rs = cmd.executeQuery();
           while (rs.next()){
                Livro lvr = new Livro();
                lvr.setTitulo(rs.getString("titulo"));
                lvr.setAutor(rs.getString("autor"));
                lvr.setCategoria(rs.getString("categoria"));
                lvr.setISBN(rs.getInt("isbn"));
                lvr.setQuantidade(rs.getInt("quantidade"));
                lvr.setDisponibilidade(rs.getString("disponibilidade"));              
                lista.add(lvr);
                
                }
                return lista;   

        }catch (Exception e) {
            System.err.print("ERRO: " + e.getMessage());
            return null;
        }finally{
            Conexao.desconectar(con);
        }             
    }
    
    public List<Livro> pesquisarPorTitulo(String titulo){
        try{
            String SQL = "select * from livros where titulo ilike ? order by isbn";
            cmd = con.prepareStatement(SQL);
            cmd.setString(1, "%" + titulo + "%");
            
                   
            List<Livro> lista = new ArrayList<>();
            ResultSet rs = cmd.executeQuery();
            
            while (rs.next()){
                Livro lvr = new Livro();
                lvr.setTitulo(rs.getString("titulo"));
                lvr.setAutor(rs.getString("autor"));
                lvr.setCategoria(rs.getString("categoria"));
                lvr.setISBN(rs.getInt("isbn"));
                lvr.setQuantidade(rs.getInt("quantidade"));
                lvr.setDisponibilidade(rs.getString("disponibilidade"));              
                lista.add(lvr);           
            }
            
            return lista;   

        }catch (Exception e) {
            System.err.print("ERRO: " + e.getMessage());
            return null;
        }finally{
            Conexao.desconectar(con);
        }            
    }
    
    
    public Livro pesquisarPorId(String ISBN){
        try{
            
            String SQL = "select * from livros where isbn = ? order by isbn";
            cmd = con.prepareStatement(SQL);
            cmd.setInt(1, Integer.parseInt(ISBN));
            
            //executar a consulta
            ResultSet rs = cmd.executeQuery();
            
            if(rs.next()) {           
                Livro lvr = new Livro();
                lvr.setTitulo(rs.getString("titulo"));
                lvr.setAutor(rs.getString("autor"));
                lvr.setCategoria(rs.getString("categoria"));
                lvr.setISBN(rs.getInt("isbn"));
                lvr.setQuantidade(rs.getInt("quantidade"));
                lvr.setDisponibilidade(rs.getString("disponibilidade"));   
                lvr.setDuracao(rs.getString("duracao"));
                
            
            return lvr;   
            }else
            {
                return null;
            }
        }catch (Exception e) {
            System.err.print("ERRO: " + e.getMessage());
            return null;
        }finally{
            Conexao.desconectar(con);
        }               
    }
    
    
    public List<Livro> pesquisarPorISBN(String ISBN){
        try{
            
            String SQL = "select * from livros where isbn = ? order by isbn";
            cmd = con.prepareStatement(SQL);
            cmd.setInt(1, Integer.parseInt(ISBN));
            
            //executar a consulta
            List<Livro> lista = new ArrayList<>();
            ResultSet rs = cmd.executeQuery();
            
            while (rs.next()){          
                Livro lvr = new Livro();
                lvr.setTitulo(rs.getString("titulo"));
                lvr.setAutor(rs.getString("autor"));
                lvr.setCategoria(rs.getString("categoria"));
                lvr.setISBN(rs.getInt("isbn"));
                lvr.setQuantidade(rs.getInt("quantidade"));
                lvr.setDisponibilidade(rs.getString("disponibilidade"));              
                lista.add(lvr);        
            }
            
            return lista;  
        }catch (Exception e) {
            System.err.print("ERRO: " + e.getMessage());
            return null;
        }finally{
            Conexao.desconectar(con);
        }               
    }
    
     public List<Livro> pesquisarPorCategoria(String categoria){
        try{
            String SQL = "select * from livros where categoria ilike ? order by isbn";
            cmd = con.prepareStatement(SQL);
            cmd.setString(1, "%" + categoria + "%");
            
                   
            List<Livro> lista = new ArrayList<>();
            ResultSet rs = cmd.executeQuery();
            
            while (rs.next()){
                Livro lvr = new Livro();
                lvr.setTitulo(rs.getString("titulo"));
                lvr.setAutor(rs.getString("autor"));
                lvr.setCategoria(rs.getString("categoria"));
                lvr.setISBN(rs.getInt("isbn"));
                lvr.setQuantidade(rs.getInt("quantidade"));
                lvr.setDisponibilidade(rs.getString("disponibilidade"));              
                lista.add(lvr);           
            }
            
            return lista;   

        }catch (Exception e) {
            System.err.print("ERRO: " + e.getMessage());
            return null;
        }finally{
            Conexao.desconectar(con);
        }            
    }
     
     public List<Livro> pesquisarPorAutor(String autor){
        try{
            String SQL = "select * from livros where autor ilike ? order by isbn";
            cmd = con.prepareStatement(SQL);
            cmd.setString(1, "%" + autor + "%");
            
                   
            List<Livro> lista = new ArrayList<>();
            ResultSet rs = cmd.executeQuery();
            
            while (rs.next()){
                Livro lvr = new Livro();
                lvr.setTitulo(rs.getString("titulo"));
                lvr.setAutor(rs.getString("autor"));
                lvr.setCategoria(rs.getString("categoria"));
                lvr.setISBN(rs.getInt("isbn"));
                lvr.setQuantidade(rs.getInt("quantidade"));
                lvr.setDisponibilidade(rs.getString("disponibilidade"));              
                lista.add(lvr);           
            }
            
            return lista;   

        }catch (Exception e) {
            System.err.print("ERRO: " + e.getMessage());
            return null;
        }finally{
            Conexao.desconectar(con);
        }            
    }
    
    
    
}
