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
public class ConsulteEmpresa extends javax.swing.JFrame {

    /**
     * Creates new form ConsulteEmpresa
     */
    public ConsulteEmpresa() {
        initComponents();
         try{
                Connection con = SQLConection.getConnection();
                String sql = "Select * from empresa";
                PreparedStatement stmt = con.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                DefaultTableModel modelo = (DefaultTableModel) tabela_empresa.getModel();
                modelo.setNumRows(0); /* Vai ter nenhuma linha inicialmente, elas serão adicionadas conforme o bd for encontrando no meu banco de dados*/
                    
                while(rs.next()){   /*Enquanto houver dados ele irá fazer esse comando para pegar todas as minhas informações*/
                    modelo.addRow(new Object[]{rs.getString("idempresa"), rs.getString("descricao"), rs.getString("fantasia"), rs.getString("CNPJ"), rs.getString("CEP"), rs.getString("Rua"), rs.getString("numero"), rs.getString("bairro"),rs.getString("cidade"), rs.getString("estado"),rs.getString("complemento"), rs.getString("IBGE"), rs.getString("inscricao"), rs.getString("regimetrib"), rs.getString("telefone")});   
                }
                con.close();
            } catch (SQLException ex) {
                    Logger.getLogger(ConsulteProdutos.class.getName()).log(Level.SEVERE, null, ex);
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
        txt_pesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_empresa = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setTitle("Consulte Empresa");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Descrição:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 19, -1, -1));
        getContentPane().add(txt_pesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 19, 384, -1));

        tabela_empresa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Razão Social", "Nome Fantasia", "CNPJ", "CEP", "Rua", "N º", "Bairro", "Cidade", "Estado ", "Complemento", "IBGE", "Inscrição", "Regime Tributário", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true, true, true, true, true, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela_empresa);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 880, 275));

        jButton1.setText("Filtrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, -1));

        jButton2.setText("Todos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // 
        try{
                String desc = txt_pesquisa.getText();
                Connection con = SQLConection.getConnection();             
                String sql = "Select * from empresa where descricao LIKE '"+desc+"';";
                PreparedStatement stmt = con.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                DefaultTableModel modelo = (DefaultTableModel) tabela_empresa.getModel();
                
                while(rs.next()){   /*Enquanto houver dados ele irá fazer esse comando para pegar todas as minhas informações*/
                    modelo.addRow(new Object[]{rs.getString("idempresa"), rs.getString("DESCRICAO"), rs.getString("fantasia"), rs.getString("CNPJ"), rs.getString("CEP"), rs.getString("rua"), rs.getString("numero"), rs.getString("bairro"),rs.getString("cidade"), rs.getString("estado"),rs.getString("complemento"), rs.getString("IBGE"), rs.getString("inscricao"), rs.getString("regimetrib"), rs.getString("telefone")});   
                 }
                con.close();
            } catch (SQLException ex) {
                    Logger.getLogger(ConsultaBanco.class.getName()).log(Level.SEVERE, null, ex);
                }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // PESQUISANDO TODOS OS MEUS PRODUTOS CADASTRADOS
        
         try{
                Connection con = SQLConection.getConnection();
                String sql = "Select * from empresa";
                PreparedStatement stmt = con.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                DefaultTableModel modelo = (DefaultTableModel) tabela_empresa.getModel();
                modelo.setNumRows(0); /* Vai ter nenhuma linha inicialmente, elas serão adicionadas conforme o bd for encontrando no meu banco de dados*/
                    
                while(rs.next()){   /*Enquanto houver dados ele irá fazer esse comando para pegar todas as minhas informações*/
                    modelo.addRow(new Object[]{rs.getString("idempresa"), rs.getString("DESCRICAO"), rs.getString("fantasia"), rs.getString("CNPJ"), rs.getString("CEP"), rs.getString("rua"), rs.getString("numero"), rs.getString("bairro"),rs.getString("cidade"), rs.getString("estado"),rs.getString("complemento"), rs.getString("IBGE"), rs.getString("inscricao"), rs.getString("regimetrib"), rs.getString("telefone")});   
                }
                con.close();
            } catch (SQLException ex) {
                    Logger.getLogger(ConsultaBanco.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(ConsulteEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsulteEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsulteEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsulteEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsulteEmpresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela_empresa;
    private javax.swing.JTextField txt_pesquisa;
    // End of variables declaration//GEN-END:variables
}
