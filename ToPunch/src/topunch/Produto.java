/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topunch;

import java.util.logging.Logger;

/**
 *
 * @author Senai
 */
public class Produto {
    private boolean perecivel;
    private String nome;
    private int valor;
    private String categoria;

    public Produto(String nome, int valor, String categoria, boolean perecivel) {
        this.nome = nome;
        this.valor = valor;
        this.categoria = categoria;
        this.perecivel = perecivel;
    }


    public boolean getPerecivel() {
        return perecivel;
    }

    public void setPerecivel(boolean perecivel) {
        this.perecivel = perecivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    
    
    
    
}
