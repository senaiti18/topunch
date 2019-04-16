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
public class Gerente extends Pessoa {
    
    
    
     public Gerente (String nome,String endereco,String telefone,int id){
        super(nome,endereco,telefone,id);
     }
     
     
     public boolean inserirProduto (Produto p){
         return true;
     }
     public boolean alterarProduto (Produto pNovo,Produto p){
         return true;
     }
     public void excluirProduto (Produto p){
         
     }
     public void excluirCliente (Cliente c){
         
     }
     
     
     
     
     
     
}
