/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.siscons.View;

import DAO.SQLConection;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Bianca
 */
public class CadLoja extends javax.swing.JFrame {

    /**
     * Creates new form CadLoja
     */
    public CadLoja() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        codloja = new javax.swing.JTextField();
        descadloja = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nomefantasia = new javax.swing.JTextField();
        enderloja = new javax.swing.JTextField();
        bairroloja = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ceploja = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        numeroloja = new javax.swing.JTextField();
        cidadeloja = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        estadoloja = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ibgeloja = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cnpjloja = new javax.swing.JTextField();
        complementoloja = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        ieloja = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        telefoneloja = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        codregimetributario = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setTitle("Cadastro de Empresa");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Código:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Descrição:");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 102));
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        codloja.setEditable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Nome fantasia:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        jPanel1.add(nomefantasia, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 310, -1));
        jPanel1.add(enderloja, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 310, -1));
        jPanel1.add(bairroloja, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 310, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Endereço:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Bairro:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("CEP:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 14, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Número:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 42, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Cidade:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 70, -1, -1));
        jPanel1.add(ceploja, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 130, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 51));
        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, -1));
        jPanel1.add(numeroloja, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 130, -1));
        jPanel1.add(cidadeloja, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 210, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Estado:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, -1, -1));
        jPanel1.add(estadoloja, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 100, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("IBGE:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, -1, -1));
        jPanel1.add(ibgeloja, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 100, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Complemento:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel12.setText("CNPJ:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));
        jPanel1.add(cnpjloja, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 310, -1));
        jPanel1.add(complementoloja, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 310, -1));

        jLabel13.setText("Inscrição Estadual:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 110, -1));
        jPanel1.add(ieloja, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 180, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Telefone:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));
        jPanel1.add(telefoneloja, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 180, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Regime Tributário:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, -1));
        jPanel1.add(codregimetributario, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 210, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(102, 0, 0));
        jButton4.setText("EXCLUIR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 102, 0));
        jButton5.setText("SALVAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 102));
        jButton3.setText("EDITAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(codloja, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(descadloja, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jButton1)
                    .addComponent(codloja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descadloja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton3)
                    .addComponent(jButton5))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // SALVANDO EMPRESA
        
        /*
     create table EMPRESA(
	codigo int PRIMARY KEY AUTO_INCREMENT,
	descricao varchar(100) not null,
	fantasia varchar(100),
	CNPJ varchar(20) not null,
	CEP varchar(10),
	rua varchar(40),
	bairro varchar(40)
        numero int(5),
	cidade varchar(40),
	estado char(2),
	complemento varchar(100),
	IBGE varchar(10),
	inscricao varchar(20),
	regimetrib varchar(100) not null,
	telefone varchar(20)
);
                
        */
        try {
            String codigo, nome, fantasia, cnpj, cep, rua, bairro, numero, cidade, estado, complemento, ibge, inscricaoe, regimetributario, telefone;
                nome = descadloja.getText();
                fantasia = nomefantasia.getText();
                cnpj = cnpjloja.getText();
                cep = ceploja.getText();
                rua = enderloja.getText();
                bairro = bairroloja.getText();
                numero = numeroloja.getText();
                cidade = cidadeloja.getText();
                estado = estadoloja.getText();
                complemento = complementoloja.getText();
                ibge = ibgeloja.getText();
                inscricaoe = ieloja.getText();
                telefone = telefoneloja.getText();
                regimetributario = codregimetributario.getText();
                String sql = "INSERT INTO EMPRESA(idempresa, descricao, fantasia, cnpj, cep, rua, numero, bairro, cidade, estado, complemento, ibge, inscricao, regimetrib, telefone) VALUES "  + "(NULL, '"+nome+"','"+fantasia+"', '"+cnpj+"', '"+cep+"', '"+rua+"', '"+numero+"', '"+bairro+"', '"+cidade+"', '"+estado+"', '"+complemento+"', '"+ibge+"', '"+inscricaoe+"', '"+regimetributario+"', '"+telefone+"')";
                SQLConection conection = new SQLConection();
                conection.SqlExecution(sql);
                JOptionPane.showMessageDialog(null, "Empresa Cadastrada!");
                this.dispose();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro na execução do SQL");
            }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //Botão Pesquisa do CEP
        Adress adress = new Adress();
        JsonCepConnection jsonCepConnection = new JsonCepConnection();
        jsonCepConnection.setCep(ceploja.getText());
        try {
            adress = JsonCepConnection.buscaEnderecoPelo(ceploja.getText());
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar CEP");
        }
        enderloja.setText(adress.getLogradouro());
        bairroloja.setText(adress.getBairro());
        cidadeloja.setText(adress.getLocalidade());
        estadoloja.setText(adress.getUf());
        ibgeloja.setText(adress.getIbge());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String message = "Deseja deletar a empresa selecionado?";
        String title = "Confirmação";
        int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
          if (reply == JOptionPane.YES_OPTION)
          {
            try {
            String deloja = codloja.getText();
            String sql = "DELETE FROM EMPRESA WHERE CODIGO = "+deloja+"";
            SQLConection conection = new SQLConection();
            conection.SqlExecution(sql);
            JOptionPane.showMessageDialog(null, "EMPRESA DELETADA COM SUCESSO!");
            this.dispose();
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "Erro ao deletar empresa!");     
            }
          }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // trazendo informações da minha empresa ja cadastrado 
         try {
            String codigo, nome, fantasia, cnpj, cep, rua, bairro, numero, cidade, estado, complemento, ibge, inscricaoe, regimetributario, telefone;
            
            String desc = descadloja.getText();
            String sql = "SELECT codigo, descricao, fantasia, CNPJ, CEP, rua, bairro, cidade, numero, estado, complemento, ibge, inscricao, regimetrib, telefone FROM EMPRESA WHERE DESCRICAO LIKE '"+desc+"'";
            Connection con = SQLConection.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);
            
            rs.next();
            
            codigo = Integer.toString(rs.getInt("codigo"));
            nome = rs.getString("descricao");
            fantasia = rs.getString("fantasia");
            cnpj = Integer.toString(rs.getInt("cnpj"));
            cep = rs.getString("cep");
            rua = rs.getString("rua");
            bairro = rs.getString("bairro");
            numero = rs.getString("numero");
            cidade = rs.getString("cidade");
            estado = rs.getString("estado");
            complemento = rs.getString("complemento");
            ibge = rs.getString("ibge");
            inscricaoe = rs.getString("inscricao");
            regimetributario = rs.getString("regimetrib");
            telefone = rs.getString("telefone");
         
            codloja.setText(codigo);
            descadloja.setText(nome);
            nomefantasia.setText(fantasia);
            cnpjloja.setText(cnpj);
            ceploja.setText(cep);
            enderloja.setText(rua);
            bairroloja.setText(bairro);
            cidadeloja.setText(cidade);
            estadoloja.setText(estado);
            numeroloja.setText(numero);
            complementoloja.setText(complemento);
            ibgeloja.setText(ibge);
            ieloja.setText(inscricaoe);
            telefoneloja.setText(telefone);
            codregimetributario.setActionCommand(regimetributario);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar empresa!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(CadLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadLoja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairroloja;
    private javax.swing.JTextField ceploja;
    private javax.swing.JTextField cidadeloja;
    private javax.swing.JTextField cnpjloja;
    private javax.swing.JTextField codloja;
    private javax.swing.JTextField codregimetributario;
    private javax.swing.JTextField complementoloja;
    private javax.swing.JTextField descadloja;
    private javax.swing.JTextField enderloja;
    private javax.swing.JTextField estadoloja;
    private javax.swing.JTextField ibgeloja;
    private javax.swing.JTextField ieloja;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nomefantasia;
    private javax.swing.JTextField numeroloja;
    private javax.swing.JTextField telefoneloja;
    // End of variables declaration//GEN-END:variables
}
