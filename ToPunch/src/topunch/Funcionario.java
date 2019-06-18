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
public class Funcionario extends Pessoa{
    private String cargo;
    private double salario;
    private String login;
    private String senha;

    public Funcionario(String cargo, double salario, String nome, String endereco, String telefone, String cpf, String cep, String dataNasc) {
        super(nome, endereco, telefone, cpf, cep, dataNasc);
        this.cargo = cargo;
        this.salario = salario;
    }

     
    public boolean cadastrarCliente(Cliente c){
        return true;
    }
    
    public boolean alterarCliente(Cliente c, Cliente novo){
        return true;
    }
    
   // public Cliente buscarCliente(String cpf){
        
   // }
    
   // public Produto buscarProduto(int id){
        
   // }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
