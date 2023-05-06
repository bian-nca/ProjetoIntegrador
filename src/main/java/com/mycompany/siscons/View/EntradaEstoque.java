/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.siscons.View;

import DAO.SQLConection;
import Model.ConsulteVendedores;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Bianca
 */
public class EntradaEstoque extends javax.swing.JFrame {
    
    public EntradaEstoque() {
      
        initComponents();
         setLocationRelativeTo(null);
         data_estoque.setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date(System.currentTimeMillis())));
   
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txt_pesq_cod = new javax.swing.JTextField();
        txt_desc_forn = new javax.swing.JTextField();
        BotaoFiltrar = new javax.swing.JButton();
        botao_consulte = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        data_estoque = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_vendedor = new javax.swing.JTextField();
        txt_descvend = new javax.swing.JTextField();
        BotaoFiltrar1 = new javax.swing.JButton();
        botao_consulte1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setTitle("Entrada de Estoque");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Entrada de Estoque");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 6, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("id:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 80, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Descrição", "Saldo Atual", "Quantidade", "Justificativa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 690, 140));

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel4.setText("Fornecedor:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));
        getContentPane().add(txt_pesq_cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 70, -1));
        getContentPane().add(txt_desc_forn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 310, -1));

        BotaoFiltrar.setText("Filtrar");
        getContentPane().add(BotaoFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, -1, -1));

        botao_consulte.setText("Consultar");
        getContentPane().add(botao_consulte, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel5.setText("Data:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, -1, -1));
        getContentPane().add(data_estoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 80, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Vendedor:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));
        getContentPane().add(txt_vendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 70, -1));
        getContentPane().add(txt_descvend, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 310, -1));

        BotaoFiltrar1.setText("Filtrar");
        BotaoFiltrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoFiltrar1ActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoFiltrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, -1, -1));

        botao_consulte1.setText("Consultar");
        botao_consulte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_consulte1ActionPerformed(evt);
            }
        });
        getContentPane().add(botao_consulte1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 0));
        jButton1.setText("Atualizar estoque");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 0, 0));
        jButton2.setText("Cancelar ");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoFiltrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoFiltrar1ActionPerformed
       // BUSCANDO O VENDEDOR PELO NOME QUE EU DESEJO
         try {
            String codigo, vendedor; 
            
            String vendedores = txt_vendedor.getText();
            String sql = "SELECT idvendedor, nome FROM VENDEDORES WHERE IDVENDEDOR LIKE '"+vendedores+"'";

            Connection con = SQLConection.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);
            
            rs.next();
            
            codigo = Integer.toString(rs.getInt("idvendedor"));
            vendedor = rs.getString("nome");
           
            txt_vendedor.setText(codigo);
            txt_descvend.setText(vendedor);
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO BUSCAR VENDEDOR!");
            JOptionPane.showMessageDialog(null, "Consulte se essa vendedor cadastrado!");
        }
    }//GEN-LAST:event_BotaoFiltrar1ActionPerformed

    private void botao_consulte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_consulte1ActionPerformed
          // chamando minha tela onde irei consultar meus vendedores cadastrados;
          new ConsulteVendedores().setVisible(true);    }//GEN-LAST:event_botao_consulte1ActionPerformed

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
            java.util.logging.Logger.getLogger(EntradaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntradaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntradaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntradaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EntradaEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoFiltrar;
    private javax.swing.JButton BotaoFiltrar1;
    private javax.swing.JButton botao_consulte;
    private javax.swing.JButton botao_consulte1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField data_estoque;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txt_desc_forn;
    private javax.swing.JTextField txt_descvend;
    private javax.swing.JTextField txt_pesq_cod;
    private javax.swing.JTextField txt_vendedor;
    // End of variables declaration//GEN-END:variables
}
