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
public class ConsulteProdutos extends javax.swing.JFrame {

    /**
     * Creates new form ConsulteProdutos
     */
    public ConsulteProdutos() {
        initComponents();
         try{
                Connection con = SQLConection.getConnection();
                String sql = "Select * from produtos";
                PreparedStatement stmt = con.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                DefaultTableModel modelo = (DefaultTableModel) tabela_produtos.getModel();
                modelo.setNumRows(0); /* Vai ter nenhuma linha inicialmente, elas serão adicionadas conforme o bd for encontrando no meu banco de dados*/
                    
                while(rs.next()){   /*Enquanto houver dados ele irá fazer esse comando para pegar todas as minhas informações*/
                    modelo.addRow(new Object[]{rs.getString("codigo"), rs.getString("descricao"), rs.getString("ncm"), rs.getString("cest"), rs.getString("tipo_item"), rs.getString("qtd_estoque"), rs.getString("unidade"), rs.getString("marca"),rs.getString("vlr_custo"), rs.getString("vlr_venda_vista"),rs.getString("vlr_venda_prazo")});   
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_produtos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_pesquisa = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setTitle("Produtos Cadastrados!");
        setResizable(false);
        addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                formHierarchyChanged(evt);
            }
        });

        tabela_produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Descrição", "NCM", "CEST", "Tipo", "Estoque", "Unidade", "Marca", "Custo", "Venda a vista", "Venda a prazo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_produtos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_produtosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela_produtos);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Descrição:");

        jButton1.setText("Todos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Filtrar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 933, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // PESQUISANDO TODOS OS MEUS PRODUTOS CADASTRADOS
        
         try{
                Connection con = SQLConection.getConnection();
                String sql = "Select * from produtos";
                PreparedStatement stmt = con.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                DefaultTableModel modelo = (DefaultTableModel) tabela_produtos.getModel();
                modelo.setNumRows(0); /* Vai ter nenhuma linha inicialmente, elas serão adicionadas conforme o bd for encontrando no meu banco de dados*/
                    
                while(rs.next()){   /*Enquanto houver dados ele irá fazer esse comando para pegar todas as minhas informações*/
                    modelo.addRow(new Object[]{rs.getString("codigo"), rs.getString("descricao"), rs.getString("ncm"), rs.getString("cest"), rs.getString("tipo_item"), rs.getString("qtd_estoque"), rs.getString("unidade"), rs.getString("marca"),rs.getString("vlr_custo"), rs.getString("vlr_venda_vista"),rs.getString("vlr_venda_prazo")});   
                }
                con.close();
            } catch (SQLException ex) {
                    Logger.getLogger(ConsultaBanco.class.getName()).log(Level.SEVERE, null, ex);
                }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // filtrar pelo o que eu digitei no campo de pesquisa
        //está funcionando com um POREM, deve-se colocar ASPAS, como se fosse um comando sql rsrs
         try{
                String desc = txt_pesquisa.getText();
                Connection con = SQLConection.getConnection();             
                String sql = "Select * from produtos where descricao LIKE '"+desc+"';";
                PreparedStatement stmt = con.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                DefaultTableModel modelo = (DefaultTableModel) tabela_produtos.getModel();
                modelo.setNumRows(0); 
                while(rs.next()){   /*Enquanto houver dados ele irá fazer esse comando para pegar todas as minhas informações*/
                    modelo.addRow(new Object[]{rs.getString("codigo"), rs.getString("descricao"), rs.getString("ncm"), rs.getString("cest"), rs.getString("tipo_item"), rs.getString("qtd_estoque"), rs.getString("unidade"), rs.getString("marca"),rs.getString("vlr_custo"), rs.getString("vlr_venda_vista"),rs.getString("vlr_venda_prazo")});   
                }
                con.close();
            } catch (SQLException ex) {
                    Logger.getLogger(ConsultaBanco.class.getName()).log(Level.SEVERE, null, ex);
                }

        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // selecionar por filtragem
       try{
                String desc = txt_pesquisa.getText();
                Connection con = SQLConection.getConnection();             
                String sql = "Select * from produos where descricao LIKE '"+desc+"';";
                PreparedStatement stmt = con.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                DefaultTableModel modelo = (DefaultTableModel) tabela_produtos.getModel();
                modelo.setNumRows(0); 
                while(rs.next()){   /*Enquanto houver dados ele irá fazer esse comando para pegar todas as minhas informações*/
                    modelo.addRow(new Object[]{rs.getString("codigo"), rs.getString("descricao"), rs.getString("ncm"), rs.getString("cest"), rs.getString("tipo_item"), rs.getString("qtd_estoque"), rs.getString("unidade"), rs.getString("marca"),rs.getString("vlr_custo"), rs.getString("vlr_venda_vista"),rs.getString("vlr_venda_prazo")});   
                }
                con.close();
            } catch (SQLException ex) {
                    Logger.getLogger(ConsultaBanco.class.getName()).log(Level.SEVERE, null, ex);
                }
    }//GEN-LAST:event_jButton2MouseClicked

    private void tabela_produtosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_produtosMouseClicked
        //
         
    }//GEN-LAST:event_tabela_produtosMouseClicked

    private void formHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_formHierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_formHierarchyChanged

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
            java.util.logging.Logger.getLogger(ConsulteProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsulteProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsulteProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsulteProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsulteProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela_produtos;
    private javax.swing.JTextField txt_pesquisa;
    // End of variables declaration//GEN-END:variables
}
