/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.siscons.View;

import DAO.SQLConection;
import Model.ConsulteClientes;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bianca
 */
public class ContaCorrenteCliente extends javax.swing.JFrame {

    /**
     * Creates new form ContaCorrenteCliente
     */
    public ContaCorrenteCliente() {
        initComponents();
        
        
        
        receber.setEnabled(false);
        pago.setEnabled(false);
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        codcli = new javax.swing.JTextField();
        descli = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        todos = new javax.swing.JRadioButton();
        abertos = new javax.swing.JRadioButton();
        pagos = new javax.swing.JRadioButton();
        cancelada = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        faturamentotabel = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        pago = new javax.swing.JTextField();
        receber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setTitle("Ficha - Cliente");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Cliente:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 18, -1, -1));

        codcli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codcliActionPerformed(evt);
            }
        });
        getContentPane().add(codcli, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 18, 90, -1));
        getContentPane().add(descli, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 480, -1));

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, -1, -1));

        jButton5.setText("Consultar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Situação:");

        todos.setText("Todos");
        todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todosActionPerformed(evt);
            }
        });

        abertos.setText("Abertos");
        abertos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abertosActionPerformed(evt);
            }
        });

        pagos.setText("Pago");
        pagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagosActionPerformed(evt);
            }
        });

        cancelada.setText("Cancelada");
        cancelada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canceladaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(todos)
                .addGap(18, 18, 18)
                .addComponent(abertos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pagos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelada)
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(todos)
                    .addComponent(jLabel2)
                    .addComponent(abertos)
                    .addComponent(pagos)
                    .addComponent(cancelada))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 520, 50));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 820, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, -1, -1));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 870, 10));

        faturamentotabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pedido", "Data - Faturamento", "Parcela", "Valor da Parcela", "Vencimento - Parcela", "Valor Pago", "Valor a Pagar", "Situação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(faturamentotabel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 870, 280));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Total a Receber:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 110, -1));
        getContentPane().add(pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 140, -1));
        getContentPane().add(receber, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 140, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Total Pago:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 80, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Consultando meus clientes cadastrados
        new ConsulteClientes().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void pagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagosActionPerformed
    try {                                        
         //ao selecionar TODOS irá desabilitar as outras opções selecinadas
         abertos.setSelected(false);
         todos.setSelected(false);
         cancelada.setSelected(false);

         String codigo = codcli.getText();
         String name;
         String situ = "PAGO";
         Connection con = SQLConection.getConnection();
         String sql = "Select * from faturamento where idcli LIKE '"+codigo+"' and situacao LIKE '"+situ+"'";

           try {
                PreparedStatement stmt = con.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery(sql);
                rs.next();
                name = rs.getString("nomecli");
                descli.setText(name);
           } catch (SQLException ex) {
                            Logger.getLogger(ContaCorrenteCliente.class.getName()).log(Level.SEVERE, null,ex);
           }
                        
                PreparedStatement stmt = con.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                DefaultTableModel modelo = (DefaultTableModel) faturamentotabel.getModel();
                modelo.setNumRows(0); /* Vai ter nenhuma linha inicialmente, elas serão adicionadas conforme o bd for encontrando no meu banco de dados*/
                        
                while(rs.next()){   /*Enquanto houver dados ele irá fazer esse comando para pegar todas as minhas informações*/
                      modelo.addRow(new Object[]{rs.getString("idpedido"), rs.getString("datafaturamento"), rs.getString("numeroparcelas"), rs.getString("vlrparcela"), rs.getString("datavencimentoparcela"),rs.getString("vlrpago"), rs.getString("vlrapagar"), rs.getString("situacao")});
          }                              
                int totvalpago = faturamentotabel.getRowCount();
                BigDecimal tot = BigDecimal.ZERO;
                for (int i = 0; i < totvalpago; i++) {
                    BigDecimal totalpagado = new BigDecimal(faturamentotabel.getValueAt(i, 5).toString());
                    tot = tot.add(totalpagado);
                }
                pago.setText(tot.toString());
                receber.setText(null);
               
                        
                    } catch (SQLException ex) {
                        Logger.getLogger(ContaCorrenteCliente.class.getName()).log(Level.SEVERE, null,ex);
                    }
   
        
    }//GEN-LAST:event_pagosActionPerformed

    private void codcliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codcliActionPerformed
        // 
    }//GEN-LAST:event_codcliActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //buscando as informações de faturamento do meu cliente 
         String cod, name;
            try{
                    String id = codcli.getText();
                    Connection con = SQLConection.getConnection();
                    String sql = "Select * from faturamento where idcli LIKE '"+id+"'";
                    try {
                        PreparedStatement stmt = con.prepareStatement(sql);
                        ResultSet rs = stmt.executeQuery(sql);
                        rs.next();
                        name = rs.getString("nomecli");
                        descli.setText(name);
                    } catch (SQLException ex) {
                        Logger.getLogger(ContaCorrenteCliente.class.getName()).log(Level.SEVERE, null,ex);
                        JOptionPane.showMessageDialog(null, "Informe um cliente válido");
                        descli.setText("");
                        codcli.setText("");
                    }
                    
                PreparedStatement stmt = con.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                DefaultTableModel modelo = (DefaultTableModel) faturamentotabel.getModel();
                modelo.setNumRows(0); /* Vai ter nenhuma linha inicialmente, elas serão adicionadas conforme o bd for encontrando no meu banco de dados*/
                 
                while(rs.next()){   /*Enquanto houver dados ele irá fazer esse comando para pegar todas as minhas informações*/
                     modelo.addRow(new Object[]{rs.getString("idpedido"), rs.getString("datafaturamento"), rs.getString("numeroparcelas"), rs.getString("vlrparcela"), rs.getString("datavencimentoparcela"),rs.getString("vlrpago"),rs.getString("vlrapagar"), rs.getString("situacao")});   
                 }
                
                
                int totvalpago = faturamentotabel.getRowCount();
                BigDecimal tot = BigDecimal.ZERO;
                for (int i = 0; i < totvalpago; i++) {
                    BigDecimal totalpagado = new BigDecimal(faturamentotabel.getValueAt(i, 5).toString());
                    tot = tot.add(totalpagado);
                }
                pago.setText(tot.toString());

                
                receber.setText(null);
                    
                    con.close();
                } catch (SQLException ex) {
                        Logger.getLogger(ContaCorrenteCliente.class.getName()).log(Level.SEVERE, null, ex);
                    }
     
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void todosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todosActionPerformed
        // se selecionar o todos irá desabilitar as outras opções selecionadas
        abertos.setSelected(false);
        pagos.setSelected(false);
        cancelada.setSelected(false);
        
         String cod, name;
         
            try{
                    String id = codcli.getText();
                    Connection con = SQLConection.getConnection();
                    String sql = "Select * from faturamento where idcli LIKE '"+id+"'";
                    try {
                        String nomesql = "Select nomecli from faturamento where idcli LIKE '"+id+"'";
                        PreparedStatement stmt = con.prepareStatement(nomesql);
                        ResultSet rs = stmt.executeQuery(sql);
                        rs.next();
                        name = rs.getString("nomecli");
                        descli.setText(name);
                    } catch (SQLException ex) {
                        Logger.getLogger(ContaCorrenteCliente.class.getName()).log(Level.SEVERE, null,ex);
                    }
                    
                PreparedStatement stmt = con.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                DefaultTableModel modelo = (DefaultTableModel) faturamentotabel.getModel();
                modelo.setNumRows(0); /* Vai ter nenhuma linha inicialmente, elas serão adicionadas conforme o bd for encontrando no meu banco de dados*/
                 
                while(rs.next()){   /*Enquanto houver dados ele irá fazer esse comando para pegar todas as minhas informações*/
                     modelo.addRow(new Object[]{rs.getString("idpedido"), rs.getString("datafaturamento"), rs.getString("numeroparcelas"), rs.getString("vlrparcela"), rs.getString("datavencimentoparcela"),rs.getString("vlrpago"),rs.getString("vlrapagar"), rs.getString("situacao")});   
                 }
                
                
                int totvalpago = faturamentotabel.getRowCount();
                BigDecimal tot = BigDecimal.ZERO;
                for (int i = 0; i < totvalpago; i++) {
                    BigDecimal totalpagado = new BigDecimal(faturamentotabel.getValueAt(i, 5).toString());
                    tot = tot.add(totalpagado);
                }
                pago.setText(tot.toString());

               
                receber.setText(null);
                    
                    con.close();
                } catch (SQLException ex) {
                        Logger.getLogger(ContaCorrenteCliente.class.getName()).log(Level.SEVERE, null, ex);
                    }
     
        
    }//GEN-LAST:event_todosActionPerformed

    private void abertosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abertosActionPerformed
      try {                                        
         //ao selecionar TODOS irá desabilitar as outras opções selecinadas
         todos.setSelected(false);
         pagos.setSelected(false);
         cancelada.setSelected(false);
                        
         String codigo = codcli.getText();
         String name;
         String situ = "EM ABERTO";
         Connection con = SQLConection.getConnection();
         String sql = "Select * from faturamento where idcli LIKE '"+codigo+"' and situacao LIKE '"+situ+"'";

           try {
                            PreparedStatement stmt = con.prepareStatement(sql);
                            ResultSet rs = stmt.executeQuery(sql);
                            rs.next();
                            name = rs.getString("nomecli");
                            descli.setText(name);
                        } catch (SQLException ex) {
                            Logger.getLogger(ContaCorrenteCliente.class.getName()).log(Level.SEVERE, null,ex);
                        }
                        
                        PreparedStatement stmt = con.prepareStatement(sql);
                        ResultSet rs = stmt.executeQuery();
                        DefaultTableModel modelo = (DefaultTableModel) faturamentotabel.getModel();
                        modelo.setNumRows(0); /* Vai ter nenhuma linha inicialmente, elas serão adicionadas conforme o bd for encontrando no meu banco de dados*/
                        
                        while(rs.next()){   /*Enquanto houver dados ele irá fazer esse comando para pegar todas as minhas informações*/
                            modelo.addRow(new Object[]{rs.getString("idpedido"), rs.getString("datafaturamento"), rs.getString("numeroparcelas"), rs.getString("vlrparcela"), rs.getString("datavencimentoparcela"),rs.getString("vlrpago"),rs.getString("vlrapagar"), rs.getString("situacao")});
                        }
                        
                         
                
                pago.setText(null);

                int totalapagar = faturamentotabel.getRowCount();
                BigDecimal total = BigDecimal.ZERO;
                for (int i = 0; i < totalapagar; i++) {
                    BigDecimal faltapagar = new BigDecimal(faturamentotabel.getValueAt(i, 6).toString());
                    total = total.add(faltapagar);
                }
                receber.setText(total.toString());
                        
                        
                    } catch (SQLException ex) {
                        Logger.getLogger(ContaCorrenteCliente.class.getName()).log(Level.SEVERE, null,ex);
                    }
        
            
        
    }//GEN-LAST:event_abertosActionPerformed

    private void canceladaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canceladaActionPerformed
        try {                                        
         //ao selecionar TODOS irá desabilitar as outras opções selecinadas
         abertos.setSelected(false);
         todos.setSelected(false);
         pagos.setSelected(false);
         

         String codigo = codcli.getText();
         String name;
         String situ = "CANCELADA";
         Connection con = SQLConection.getConnection();
         String sql = "Select * from faturamento where idcli LIKE '"+codigo+"' and situacao LIKE '"+situ+"'";

           try {
                PreparedStatement stmt = con.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery(sql);
                rs.next();
                name = rs.getString("nomecli");
                descli.setText(name);
           } catch (SQLException ex) {
                            Logger.getLogger(ContaCorrenteCliente.class.getName()).log(Level.SEVERE, null,ex);
           }
                        
                PreparedStatement stmt = con.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                DefaultTableModel modelo = (DefaultTableModel) faturamentotabel.getModel();
                modelo.setNumRows(0); /* Vai ter nenhuma linha inicialmente, elas serão adicionadas conforme o bd for encontrando no meu banco de dados*/
                        
                while(rs.next()){   /*Enquanto houver dados ele irá fazer esse comando para pegar todas as minhas informações*/
                      modelo.addRow(new Object[]{rs.getString("idpedido"), rs.getString("datafaturamento"), rs.getString("numeroparcelas"), rs.getString("vlrparcela"), rs.getString("datavencimentoparcela"),rs.getString("vlrpago"), rs.getString("vlrapagar"), rs.getString("situacao")});
          }                              
               
               
                        
                    } catch (SQLException ex) {
                        Logger.getLogger(ContaCorrenteCliente.class.getName()).log(Level.SEVERE, null,ex);
                    }
    }//GEN-LAST:event_canceladaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ContaCorrenteCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContaCorrenteCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContaCorrenteCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContaCorrenteCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContaCorrenteCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton abertos;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton cancelada;
    private javax.swing.JTextField codcli;
    private javax.swing.JTextField descli;
    private javax.swing.JTable faturamentotabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField pago;
    private javax.swing.JRadioButton pagos;
    private javax.swing.JTextField receber;
    private javax.swing.JRadioButton todos;
    // End of variables declaration//GEN-END:variables
}
