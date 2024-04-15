/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

public class Livro {
    
    
    private int ISBN;
    private int quantidade; 
    private String titulo; 
    private String autor;
    private String categoria; 
    private String disponibilidade; 
    private String duracao;

    public Livro() {
    }

    public Livro(int ISBN, int quantidade, String titulo, String autor, String categoria, String disponibilidade, String duracao) {
        this.ISBN = ISBN;
        this.quantidade = quantidade;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.disponibilidade = disponibilidade;
        this.duracao = duracao;
    }
    
   
    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

 
    
}
