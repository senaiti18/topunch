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
public class ControladorBanco {
    public boolean inserirProduto (Produto p){
        return true;
    }  
    public boolean alterarProduto(Produto p,Produto pNovo){
        return true;
    }
    //public Produto buscarProduto(int id){
        
    //}
    public boolean deletarProduto(){
        return true;
    }
    public boolean inserirCliente(Cliente c,String CPF, String CEP, String dataNasc, String Sexo){
        return true;
    }
    public boolean alterarCliente(Cliente c, Cliente cNovo){
        return true;
    }
    //public Cliente buscarCliente(){
        
    //}
    public boolean deletarCliente(Cliente c){
        return true;
    }
    
    public boolean inserirPedido(Pedido p){
        return true;
    }
    
    public boolean alterarProduto(Pedido p, Pedido pNovo){
        return true;
    }
  //  public Pedido buscarPedido(int id){
        
   // }
    public boolean deletarPedido(Pedido p){
        return true;
    }
    
    public boolean adicionarFuncionario(Funcionario f,String DataNasc, String cargo, String departamento,double salario){
        return true;
    }
    
    public boolean deletarFuncionario(Funcionario f){
        return true;
    }
    
    //public Funcionario consultarFuncionario(Funcionario f){
        
    //}
}
