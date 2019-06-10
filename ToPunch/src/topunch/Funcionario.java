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
    private int GERENTE;
    private int ATENDENTE;
    private int COLABORADOR;
    private int nivelAcesso;
    private String login;
    private String senha;

     public Funcionario (String nome,String endereco,String telefone){
        super(nome,endereco,telefone);
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

    public int getGERENTE() {
        return GERENTE;
    }

    public void setGERENTE(int GERENTE) {
        this.GERENTE = GERENTE;
    }

    public int getATENDENTE() {
        return ATENDENTE;
    }

    public void setATENDENTE(int ATENDENTE) {
        this.ATENDENTE = ATENDENTE;
    }

    public int getCOLABORADOR() {
        return COLABORADOR;
    }

    public void setCOLABORADOR(int COLABORADOR) {
        this.COLABORADOR = COLABORADOR;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

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
    
}
