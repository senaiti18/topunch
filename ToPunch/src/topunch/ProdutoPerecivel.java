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

    public ProdutoPerecivel(Date validade, int perecivel, int nao_perecivel, String nome, String valor, int categoria, int id) {
        super(perecivel, nao_perecivel, nome, valor, categoria, id);
        this.validade = validade;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

   
}
