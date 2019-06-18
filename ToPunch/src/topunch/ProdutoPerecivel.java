/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topunch;

import java.util.Date;

/**
 *
 * @author Senai
 */
public class ProdutoPerecivel extends Produto {
    private Date validade;

    public ProdutoPerecivel(Date validade, String nome, int valor, String categoria, boolean perecivel) {
        super(nome, valor, categoria, perecivel);
        this.validade = validade;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

   
}
