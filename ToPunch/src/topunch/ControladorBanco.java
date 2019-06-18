/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topunch;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import topunch.Cliente;

/**
 *
 * @author Senai
 */
public class ControladorBanco {
    public void inserirProduto (Produto p){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO produto (nome,valor,categoria,perecivel)VALUES(?,?,?,?)");
            stmt.setString(1, p.getNome());
            stmt.setInt(2, p.getValor());
            stmt.setString(3, p.getCategoria());
            stmt.setBoolean(4, p.getPerecivel());
            
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(ControladorBanco.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao salvar!"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }  
    
    public List<Produto> buscarProduto(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        
        
        
        try {
            stmt = con.prepareStatement("SELECT * FROM produto");
            rs = stmt.executeQuery();
            
            
            while (rs.next()) {                
                Produto prod = new Produto("",1,"",true);
                prod.setNome(rs.getString("nome"));
                prod.setValor(rs.getInt("valor"));
                prod.setCategoria(rs.getString("categoria"));
                prod.setPerecivel(rs.getBoolean("perecivel"));
         
                produtos.add(prod);
            }
            
            
            JOptionPane.showMessageDialog(null, "Sucesso na query");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no query"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos;
    }
    
    public void deletarProduto(String nome){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE  FROM PRODUTO WHERE nome = ?");
            stmt.setString(1, nome);
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluido com Sucesso!");
                    
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluido!");
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void alterarProduto(Produto p){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("UPDATE produto set valor = ?,categoria = ?, perecivel = ? WHERE nome = ?");
            stmt.setInt(1, p.getValor());
            stmt.setString(2, p.getCategoria());
            stmt.setBoolean(3, p.getPerecivel());
            stmt.setString(4, p.getNome());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso!");
                    
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!");
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public void inserirCliente(Cliente c){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO cliente (nome,endereco,telefone,cpf,cep,dataNasc)VALUES(?,?,?,?,?,?)");
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getEndereco());
            stmt.setString(3, c.getTelefone());
            stmt.setString(4, c.getCpf());
            stmt.setString(5, c.getCep());
            stmt.setString(6, c.getDataNasc());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(ControladorBanco.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao salvar!"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    
    public List<Cliente> buscarCliente(String cpf){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Cliente> clientes = new ArrayList<>();
        
        
        
        try {
            stmt = con.prepareStatement("SELECT * FROM cliente Where cpf = "+ cpf);
            rs = stmt.executeQuery();
            
            
            while (rs.next()) {                
                Cliente cli = new Cliente("","","","","","");
                cli.setNome(rs.getString("nome"));
                cli.setEndereco(rs.getString("endereco"));
                cli.setTelefone(rs.getString("telefone"));
                cli.setCpf(rs.getString("cpf"));
                cli.setCep(rs.getString("cep"));
                cli.setDataNasc(rs.getString("dataNasc"));
            
                
                clientes.add(cli);
            }
            
            
            JOptionPane.showMessageDialog(null, "Sucesso na query");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no query"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return clientes;
    }
    
    public void deletarCliente(String cpf){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE  FROM cliente WHERE cpf = ?");
            stmt.setString(1, cpf);
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluido com Sucesso!");
                    
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluido!");
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void alterarCliente(Cliente c){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE cliente set nome = ?,endereco = ?,telefone = ?, cep = ?,dataNasc = ? WHERE cpf = ?");
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getEndereco());
            stmt.setString(3, c.getTelefone());
            stmt.setString(4, c.getCep());
            stmt.setString(5, c.getDataNasc());
            stmt.setString(6, c.getCpf());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso!");
                    
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!");
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void inserirPedido(Pedido p){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO pedido (nomeProduto,cpfCliente,status,dataEntrega,quantidade)VALUES(?,?,?,?,?)");
            stmt.setString(1, p.getNomeProdutos());
            stmt.setString(2, p.getCliente());
            stmt.setString(3, p.getStatus());
            stmt.setString(4, p.getDataDeEntrega());
            stmt.setInt(5, p.getQuantidade());
            
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(ControladorBanco.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao salvar!"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void alterarPedido(Pedido p){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            System.out.println("1");
            stmt = con.prepareStatement("UPDATE pedido set nomeProduto = ?,cpfCliente = ?, status = ?, dataEntrega = ?, quantidade = ? WHERE cpfCliente = ? and dataEntrega = ?");
            stmt.setString(1, p.getNomeProdutos());
            stmt.setString(2, p.getCliente());
            stmt.setString(3, p.getStatus());
            stmt.setString(4, p.getDataDeEntrega());
            stmt.setInt(5, p.getQuantidade());
            stmt.setString(6, p.getCliente());
            stmt.setString(7, p.getDataDeEntrega());
            System.out.println("2");
            stmt.executeUpdate();
            System.out.println("2");
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso!");
            System.out.println("3");
                    
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!");
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Pedido> buscarPedidoAberto(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Pedido> pedidos = new ArrayList<>();
        
        
        
        try {
            stmt = con.prepareStatement("SELECT * FROM pedido Where status = \"Processo de Fabricação\"");
            rs = stmt.executeQuery();
            
            
            while (rs.next()) {                
                Pedido ped = new Pedido("","","",0,"");
                ped.setNomeProdutos(rs.getString("nomeProduto"));
                ped.setCliente(rs.getString("cpfCliente"));
                ped.setStatus(rs.getString("status"));
                ped.setDataDeEntrega(rs.getString("dataEntrega"));
                ped.setQuantidade(rs.getInt("quantidade"));
                
                pedidos.add(ped);
            }
            
            
            JOptionPane.showMessageDialog(null, "Sucesso na query");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no query"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return pedidos;
    }
    
    public List<Pedido> buscarPedidosFechados(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Pedido> pedidos = new ArrayList<>();
        
        
        
        try {
            stmt = con.prepareStatement("SELECT * FROM pedido Where status = \"Entregue\"");
            rs = stmt.executeQuery();
            
            
            while (rs.next()) {                
                Pedido ped = new Pedido("","","",0,"");
                ped.setNomeProdutos(rs.getString("nomeProduto"));
                ped.setCliente(rs.getString("cpfCliente"));
                ped.setStatus(rs.getString("status"));
                ped.setDataDeEntrega(rs.getString("dataEntrega"));
                ped.setQuantidade(rs.getInt("quantidade"));
                
                pedidos.add(ped);
            }
            
            
            JOptionPane.showMessageDialog(null, "Sucesso na query");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no query"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return pedidos;
    }
    
    public List<Pedido> buscarPedidoEspecificoFecha(String cpf){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Pedido> pedidos = new ArrayList<>();
        
        
        
        try {
            stmt = con.prepareStatement("SELECT * FROM pedido Where cpfCliente = ? and status = ?");
            System.out.println(stmt);
            stmt.setString(1, cpf );
            stmt.setString(2, "Entregue");
            rs = stmt.executeQuery();
            
            
            while (rs.next()) {                
                Pedido ped = new Pedido("","","",0,"");
                ped.setNomeProdutos(rs.getString("nomeProduto"));
                ped.setCliente(rs.getString("cpfCliente"));
                ped.setStatus(rs.getString("status"));
                ped.setDataDeEntrega(rs.getString("dataEntrega"));
                ped.setQuantidade(rs.getInt("quantidade"));
                System.out.println(ped.getNomeProdutos());
                pedidos.add(ped);
            }
            
            
            JOptionPane.showMessageDialog(null, "Sucesso na query");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no query"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return pedidos;
    }
    
    public List<Pedido> buscarPedidoEspecificoAber(String cpf){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Pedido> pedidos = new ArrayList<>();
        
        
        
        try {
            stmt = con.prepareStatement("SELECT * FROM pedido Where cpfCliente = ? and status = ?");
            System.out.println(stmt);
            stmt.setString(1, cpf );
            stmt.setString(2, "Processo de Fabricação");
            rs = stmt.executeQuery();
            
            
            while (rs.next()) {                
                Pedido ped = new Pedido("","","",0,"");
                ped.setNomeProdutos(rs.getString("nomeProduto"));
                ped.setCliente(rs.getString("cpfCliente"));
                ped.setStatus(rs.getString("status"));
                ped.setDataDeEntrega(rs.getString("dataEntrega"));
                ped.setQuantidade(rs.getInt("quantidade"));
                System.out.println(ped.getNomeProdutos());
                pedidos.add(ped);
            }
            
            
            JOptionPane.showMessageDialog(null, "Sucesso na query");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no query"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return pedidos;
    }
    
    public void deletarPedido(String cpf, String data, String nomeProd){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM pedido WHERE cpfCliente = ? and nomeProduto = ? and dataEntrega = ?");
            stmt.setString(1, cpf);
            stmt.setString(2, nomeProd);
            stmt.setString(3, data);
            System.out.println(stmt);
            stmt.executeUpdate();
            System.out.println("1");
            JOptionPane.showMessageDialog(null, "Excluido com Sucesso!");
                    
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluido!");
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void adicionarFuncionario(Funcionario f){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO funcionario (nome,endereco,telefone,cpf,cep,dataNasc,cargo,salario)VALUES(?,?,?,?,?,?,?,?)");
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getEndereco());
            stmt.setString(3, f.getTelefone());
            stmt.setString(4, f.getCpf());
            stmt.setString(5, f.getCep());
            stmt.setString(6, f.getDataNasc());
            stmt.setString(7, f.getCargo());
            stmt.setDouble(8, f.getSalario());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(ControladorBanco.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao salvar!"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Funcionario> buscarFuncionario(String cpf){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Funcionario> funcionario = new ArrayList<>();
        
        
        
        try {
            stmt = con.prepareStatement("SELECT * FROM funcionario Where cpf = "+ cpf);
            rs = stmt.executeQuery();
            
            
            while (rs.next()) {                
                Funcionario func = new Funcionario("",0,"","","","","","");
                func.setNome(rs.getString("nome"));
                func.setEndereco(rs.getString("endereco"));
                func.setTelefone(rs.getString("telefone"));
                func.setCpf(rs.getString("cpf"));
                func.setCep(rs.getString("cep"));
                func.setDataNasc(rs.getString("dataNasc"));
                func.setCargo(rs.getString("cargo"));
                func.setSalario(rs.getDouble("salario"));
            
                
                funcionario.add(func);
            }
            
            
            JOptionPane.showMessageDialog(null, "Sucesso na query");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no query"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return funcionario;
    }
    
    public void deletarFuncionario(String cpf){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE  FROM funcionario WHERE cpf = ?");
            stmt.setString(1, cpf);
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluido com Sucesso!");
                    
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluido!");
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void atualizarFuncionario(Funcionario f){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE funcionario set nome = ?,endereco = ?,telefone = ?, cep = ?,dataNasc = ?,cargo = ?, salario = ? WHERE cpf = ?");
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getEndereco());
            stmt.setString(3, f.getTelefone());
            stmt.setString(4, f.getCep());
            stmt.setString(5, f.getDataNasc());
            stmt.setString(6, f.getCargo());
            stmt.setDouble(7, f.getSalario());
            stmt.setString(8, f.getCpf());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso!");
                    
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!");
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
