/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToPunchTela;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import topunch.ControladorBanco;
import topunch.Pedido;
import topunch.Produto;

/**
 *
 * @author Senai
 */
public class ConsultarPedido extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultarPedido
     */
    public ConsultarPedido() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTProdutos.getModel();
        jTProdutos.setRowSorter(new TableRowSorter(modelo));
    }
    public void readJTableAberto(){
        ControladorBanco ctrl = new ControladorBanco();
        DefaultTableModel modelo = (DefaultTableModel) jTProdutos.getModel();
        modelo.setNumRows(0);
        
        
        
        for(Pedido p: ctrl.buscarPedidoAberto()){
            modelo.addRow(new Object[]{
                p.getNomeProdutos(),
                p.getCliente(),
                p.getStatus(),
                p.getDataDeEntrega(),
                p.getQuantidade()
            });
        }
    }
    
    public void readJTableFechado(){
        ControladorBanco ctrl = new ControladorBanco();
        DefaultTableModel modelo = (DefaultTableModel) jTProdutos.getModel();
        modelo.setNumRows(0);
        
        
        
        for(Pedido p: ctrl.buscarPedidosFechados()){
            modelo.addRow(new Object[]{
                p.getNomeProdutos(),
                p.getCliente(),
                p.getStatus(),
                p.getDataDeEntrega(),
                p.getQuantidade()
            });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProdutos = new javax.swing.JTable();
        btnAberto = new javax.swing.JButton();
        btnFechado = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);

        jTProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome do Produto", "Cpf do Cliente", "Status", "Data de Entrega", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTProdutos);

        btnAberto.setText("Pedido em aberto");
        btnAberto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbertoActionPerformed(evt);
            }
        });

        btnFechado.setText("Pedido Entregues");
        btnFechado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFechadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnAberto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(btnFechado)
                .addGap(67, 67, 67))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAberto)
                    .addComponent(btnFechado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbertoActionPerformed
        readJTableAberto();
    }//GEN-LAST:event_btnAbertoActionPerformed

    private void btnFechadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFechadoActionPerformed
        readJTableFechado();
    }//GEN-LAST:event_btnFechadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAberto;
    private javax.swing.JButton btnFechado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTProdutos;
    // End of variables declaration//GEN-END:variables
}
