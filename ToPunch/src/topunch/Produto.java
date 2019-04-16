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
    private int perecivel;
    private int nao_perecivel;
    private String nome;
    private String valor;
    private int categoria;
    private int id;

    public Produto(int perecivel, int nao_perecivel, String nome, String valor, int categoria, int id) {
        this.perecivel = perecivel;
        this.nao_perecivel = nao_perecivel;
        this.nome = nome;
        this.valor = valor;
        this.categoria = categoria;
        this.id = id;
    }

    public int getPerecivel() {
        return perecivel;
    }

    public void setPerecivel(int perecivel) {
        this.perecivel = perecivel;
    }

    public int getNao_perecivel() {
        return nao_perecivel;
    }

    public void setNao_perecivel(int nao_perecivel) {
        this.nao_perecivel = nao_perecivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
