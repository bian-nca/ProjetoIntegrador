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
public class ConsulteCC extends javax.swing.JFrame {

    /**
     * Creates new form ConsulteCC
     */
    public ConsulteCC() {
        initComponents();
        try{
            Connection con = SQLConection.getConnection();
            String sql = "Select * from centrocusto";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel modelo = (DefaultTableModel) cc.getModel();
            modelo.setNumRows(0); /* Vai ter nenhuma linha inicialmente, elas serão adicionadas conforme o bd for encontrando no meu banco de dados*/
            while(rs.next()){   /*Enquanto houver dados ele irá fazer esse comando para pegar todas as minhas informações*/
                modelo.addRow(new Object[]{rs.getString("codigo"), rs.getString("descricao"), rs.getString("observacao")});
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConsulteCC.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        cc = new javax.swing.JTable();
        desc = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Centro de Custos Cadastrados");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Observação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(cc);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 630, 230));
        getContentPane().add(desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 310, -1));

        jButton1.setText("Todos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        jButton2.setText("Filtrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Descrição:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 10, 80, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String descricao = desc.getText();
        
        try{
            Connection con = SQLConection.getConnection();
            String sql = "Select * from centrocusto where descricao LIKE '"+descricao+"'";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel modelo = (DefaultTableModel) cc.getModel();
            modelo.setNumRows(0); /* Vai ter nenhuma linha inicialmente, elas serão adicionadas conforme o bd for encontrando no meu banco de dados*/
            while(rs.next()){   /*Enquanto houver dados ele irá fazer esse comando para pegar todas as minhas informações*/
                modelo.addRow(new Object[]{rs.getString("codigo"), rs.getString("descricao"), rs.getString("observacao")});
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConsulteCC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            Connection con = SQLConection.getConnection();
            String sql = "Select * from centrocusto";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel modelo = (DefaultTableModel) cc.getModel();
            modelo.setNumRows(0); /* Vai ter nenhuma linha inicialmente, elas serão adicionadas conforme o bd for encontrando no meu banco de dados*/
            while(rs.next()){   /*Enquanto houver dados ele irá fazer esse comando para pegar todas as minhas informações*/
                modelo.addRow(new Object[]{rs.getString("codigo"), rs.getString("descricao"), rs.getString("observacao")});
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConsulteCC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ConsulteCC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsulteCC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsulteCC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsulteCC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsulteCC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable cc;
    private javax.swing.JTextField desc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
