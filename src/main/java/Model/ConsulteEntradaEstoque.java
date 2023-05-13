/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Model;

import DAO.SQLConection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bianca
 */
public class ConsulteEntradaEstoque extends javax.swing.JFrame {

    /**
     * Creates new form ConsulteEntradaEstoque
     */
    public ConsulteEntradaEstoque() {
        initComponents();
        try{
            Connection con = SQLConection.getConnection();
            String sql = "Select * from ent_est";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel modelo = (DefaultTableModel) tabela_entrada.getModel();
            modelo.setNumRows(0); /* Vai ter nenhuma linha inicialmente, elas serão adicionadas conforme o bd for encontrando no meu banco de dados*/

            while(rs.next()){   /*Enquanto houver dados ele irá fazer esse comando para pegar todas as minhas informações*/
                modelo.addRow(new Object[]{rs.getString("identradaest"), rs.getString("datavenda"), rs.getString("id_fornecedor"), rs.getString("fornecedor"), rs.getString("id_vend"), rs.getString("name_vend"), rs.getString("cancelada")});
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConsulteClientes.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        txt_entest = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_entrada = new javax.swing.JTable();

        setTitle("Consulte - Entrada de Estoque");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Fornecedor:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 6, -1, 30));
        getContentPane().add(txt_entest, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 11, 390, -1));

        jButton1.setText("Filtrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        jButton2.setText("Todos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, -1, -1));

        tabela_entrada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Requisição", "Data", "Código Fornecedor", "Fornecedor", "Código - Vendedor", "Vendedor", "Cancelada?"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela_entrada);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 60, 700, 273));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //buscando pelo numero da requisicao
         try{
            String pesq = txt_entest.getText();
            Connection con = SQLConection.getConnection();
            String sql = "Select * from ENT_EST where fornecedor LIKE '"+pesq+"'";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel modelo = (DefaultTableModel) tabela_entrada.getModel();
            modelo.setNumRows(0); /* Vai ter nenhuma linha inicialmente, elas serão adicionadas conforme o bd for encontrando no meu banco de dados*/

            while(rs.next()){   /*Enquanto houver dados ele irá fazer esse comando para pegar todas as minhas informações*/
                modelo.addRow(new Object[]{rs.getString("identradaest"), rs.getString("datavenda"), rs.getString("id_fornecedor"), rs.getString("fornecedor"), rs.getString("id_vend"), rs.getString("name_vend"), rs.getString("cancelada"), rs.getString("cancelada")});
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConsulteFornecedores.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // buscando todoas
       try{
            Connection con = SQLConection.getConnection();
            String sql = "Select * from ent_est";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel modelo = (DefaultTableModel) tabela_entrada.getModel();
            modelo.setNumRows(0); /* Vai ter nenhuma linha inicialmente, elas serão adicionadas conforme o bd for encontrando no meu banco de dados*/

            while(rs.next()){   /*Enquanto houver dados ele irá fazer esse comando para pegar todas as minhas informações*/
                modelo.addRow(new Object[]{rs.getString("identradaest"), rs.getString("datavenda"), rs.getString("id_fornecedor"), rs.getString("fornecedor"), rs.getString("id_vend"), rs.getString("name_vend")});
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConsulteClientes.class.getName()).log(Level.SEVERE, null, ex);
           
    }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ConsulteEntradaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsulteEntradaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsulteEntradaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsulteEntradaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsulteEntradaEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela_entrada;
    private javax.swing.JTextField txt_entest;
    // End of variables declaration//GEN-END:variables
}
