/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topunch;

import java.util.ArrayList;

/**
 *
 * @author Senai
 */
public class Pedido {
    private String NomeProdutos;
    private String cliente;
    private String dataDeEntrega;
    private int quantidade;
    private String status;

    public Pedido(String NomeProdutos, String cliente, String dataDeEntrega, int quantidade, String status) {
        this.NomeProdutos = NomeProdutos;
        this.cliente = cliente;
        this.dataDeEntrega = dataDeEntrega;
        this.quantidade = quantidade;
        this.status = status;
    }

    public String getNomeProdutos() {
        return NomeProdutos;
    }

    public void setNomeProdutos(String NomeProdutos) {
        this.NomeProdutos = NomeProdutos;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDataDeEntrega() {
        return dataDeEntrega;
    }

    public void setDataDeEntrega(String dataDeEntrega) {
        this.dataDeEntrega = dataDeEntrega;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    
}
