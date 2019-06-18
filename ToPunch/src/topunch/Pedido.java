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
    private ArrayList<Produto> aProdutos;
    private Cliente cliente;
    private int status;

    public Pedido(ArrayList<Produto> aProdutos, Cliente cliente, int status) {
        this.aProdutos = aProdutos;
        this.cliente = cliente;
        this.status = status;
    }
    

    
    

    public ArrayList<Produto> getaProdutos() {
        return aProdutos;
    }

    public void setaProdutos(ArrayList<Produto> aProdutos) {
        this.aProdutos = aProdutos;
    }
    

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    

    
    
    
}
