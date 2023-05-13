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
public class ConsultePedidos extends javax.swing.JFrame {

    /**
     * Creates new form ConsultePedidos
     */
    public ConsultePedidos() {
        initComponents();
        try{
            Connection con = SQLConection.getConnection();
            String sql = "Select * from vendas";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel modelo = (DefaultTableModel) tabela_vendas.getModel();
            modelo.setNumRows(0); /* Vai ter nenhuma linha inicialmente, elas serão adicionadas conforme o bd for encontrando no meu banco de dados*/

            while(rs.next()){   /*Enquanto houver dados ele irá fazer esse comando para pegar todas as minhas informações*/
                modelo.addRow(new Object[]{rs.getString("idvenda"), rs.getString("datavenda"), rs.getString("id_cliente"), rs.getString("nome_cli"), rs.getString("id_vendedor"), rs.getString("nomevend"), rs.getString("valor_wth_desc"), rs.getString("desconto"), rs.getString("vlr_total"), rs.getString("cancelada")});
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
        txt_venda = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_vendas = new javax.swing.JTable();

        setTitle("Consulte Pedidos");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Venda:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 30));
        getContentPane().add(txt_venda, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 420, -1));

        jButton1.setText("Filtrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, -1));

        jButton2.setText("Todos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, -1));

        tabela_vendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Pedido", "Data ", "id Cliente", "Cliente", "id Vendedor", "Vendedor", "Valor Bruto", "Desconto", "Valor Total", "Cancelada"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela_vendas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 800, 343));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //

        try{
            String venda = txt_venda.getText();
            Connection con = SQLConection.getConnection();
            String sql = "Select * from VENDAS where idvenda LIKE '"+venda+"'";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel modelo = (DefaultTableModel) tabela_vendas.getModel();
            modelo.setNumRows(0); /* Vai ter nenhuma linha inicialmente, elas serão adicionadas conforme o bd for encontrando no meu banco de dados*/

            while(rs.next()){   /*Enquanto houver dados ele irá fazer esse comando para pegar todas as minhas informações*/
                modelo.addRow(new Object[]{rs.getString("idvenda"), rs.getString("datavenda"), rs.getString("id_cliente"), rs.getString("nome_cli"), rs.getString("id_vendedor"), rs.getString("nomevend"), rs.getString("valor_wth_desc"), rs.getString("desconto"), rs.getString("vlr_total"), rs.getString("cancelada")});
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConsulteFornecedores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //
        try{
            Connection con = SQLConection.getConnection();
            String sql = "Select * from vendas";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel modelo = (DefaultTableModel) tabela_vendas.getModel();
            modelo.setNumRows(0); /* Vai ter nenhuma linha inicialmente, elas serão adicionadas conforme o bd for encontrando no meu banco de dados*/

            while(rs.next()){   /*Enquanto houver dados ele irá fazer esse comando para pegar todas as minhas informações*/
                modelo.addRow(new Object[]{rs.getString("idvenda"), rs.getString("datavenda"), rs.getString("id_cliente"), rs.getString("nome_cli"), rs.getString("id_vendedor"), rs.getString("nomevend"), rs.getString("valor_wth_desc"), rs.getString("desconto"), rs.getString("vlr_total"), rs.getString("cancelada")});
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
            java.util.logging.Logger.getLogger(ConsultePedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultePedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultePedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultePedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultePedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela_vendas;
    private javax.swing.JTextField txt_venda;
    // End of variables declaration//GEN-END:variables
}
