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
    private int ABERTO;
    private int FECHADO;
    private int PAGO;
    private ArrayList<Produto> aProdutos;
    private Cliente cliente;
    private int status;
    

    public Pedido(int ABERTO, int FECHADO, int PAGO, Produto aProdutos, Cliente cliente, int status) {
        this.ABERTO = ABERTO;
        this.FECHADO = FECHADO;
        this.PAGO = PAGO;
        this.aProdutos.add(aProdutos);
        this.cliente = cliente;
        this.status = status;
        
    }

    public int getABERTO() {
        return ABERTO;
    }

    public void setABERTO(int ABERTO) {
        this.ABERTO = ABERTO;
    }
    

    public int getFECHADO() {
        return FECHADO;
    }

    public void setFECHADO(int FECHADO) {
        this.FECHADO = FECHADO;
    }
    

    public int getPAGO() {
        return PAGO;
    }

    public void setPAGO(int PAGO) {
        this.PAGO = PAGO;
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
