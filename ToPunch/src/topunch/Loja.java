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
public class Loja {
    private ControladorBanco controladorBD;
    private ArrayList<Pedido> aPedidosAbertos;

    public Loja(ControladorBanco controladorBD, ArrayList<Pedido> aPedidosAbertos) {
        this.controladorBD = controladorBD;
        this.aPedidosAbertos = aPedidosAbertos;
    }

    public ControladorBanco getControladorBD() {
        return controladorBD;
    }

    public void setControladorBD(ControladorBanco controladorBD) {
        this.controladorBD = controladorBD;
    }

    public ArrayList<Pedido> getaPedidosAbertos() {
        return aPedidosAbertos;
    }

    public void setaPedidosAbertos(ArrayList<Pedido> aPedidosAbertos) {
        this.aPedidosAbertos = aPedidosAbertos;
    }
    
    
}
