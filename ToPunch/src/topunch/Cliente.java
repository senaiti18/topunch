/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topunch;

/**
 *
 * @author Senai
 */
public class Cliente extends Pessoa {
     public Cliente (String nome,String endereco,String telefone,int id){
      super(nome,endereco,telefone,id);
    }
    
    public boolean comprar (Produto p){
      return true;
    }
    public boolean pagar (float valor){
        return true;
    }
}
