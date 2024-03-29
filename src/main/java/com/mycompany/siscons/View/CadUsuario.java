package com.mycompany.siscons.View;

import DAO.SQLConection;
import Model.ConsulteUsers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CadUsuario extends javax.swing.JFrame {

    String administrativo = "n";
    String gerencia = "n";
    String operacional = "n";
    
    /**
     * Creates new form CadUsuario
     */
    public CadUsuario() {
        initComponents();
        setLocationRelativeTo(null);
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
        jLabel3 = new javax.swing.JLabel();
        CadUsuarioNome = new javax.swing.JTextField();
        CadUsuarioSenha = new javax.swing.JPasswordField();
        SalvarUsuario = new javax.swing.JButton();
        CadUsuarioSenhaRepLabel = new javax.swing.JLabel();
        CadUsuarioSenhaRep = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        AdministrativoRB = new javax.swing.JRadioButton();
        OperacionalRB = new javax.swing.JRadioButton();
        GerenciaRB = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        Codusuario = new javax.swing.JTextField();
        ConsultarUsuario = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setTitle("Cadastro de Usuários");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Código:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Usuário:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Senha:");

        SalvarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SalvarUsuario.setForeground(new java.awt.Color(0, 102, 0));
        SalvarUsuario.setText("SALVAR");
        SalvarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarUsuarioActionPerformed(evt);
            }
        });

        CadUsuarioSenhaRepLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CadUsuarioSenhaRepLabel.setText("Repita a Senha:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Acessos:");

        AdministrativoRB.setText("Administrativo");
        AdministrativoRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdministrativoRBActionPerformed(evt);
            }
        });

        OperacionalRB.setText("Operacional");
        OperacionalRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OperacionalRBActionPerformed(evt);
            }
        });

        GerenciaRB.setText("Gerência");
        GerenciaRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerenciaRBActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 0, 0));
        jButton2.setText("DELETAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Codusuario.setEditable(false);

        ConsultarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ConsultarUsuario.setForeground(new java.awt.Color(0, 0, 102));
        ConsultarUsuario.setText("Buscar");
        ConsultarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarUsuarioActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 51));
        jButton3.setText("CONSULTAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 51));
        jButton5.setText("Limpar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(AdministrativoRB)
                        .addGap(18, 18, 18)
                        .addComponent(OperacionalRB)
                        .addGap(18, 18, 18)
                        .addComponent(GerenciaRB))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(66, 66, 66))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(CadUsuarioSenhaRepLabel)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(68, 68, 68)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CadUsuarioSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                            .addComponent(CadUsuarioSenhaRep, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Codusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(CadUsuarioNome)
                                .addGap(18, 18, 18)
                                .addComponent(ConsultarUsuario)))))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SalvarUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Codusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CadUsuarioNome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ConsultarUsuario)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(CadUsuarioSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CadUsuarioSenhaRep, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CadUsuarioSenhaRepLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AdministrativoRB)
                        .addComponent(OperacionalRB)
                        .addComponent(GerenciaRB)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SalvarUsuario)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalvarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarUsuarioActionPerformed
        //SALVAR USUARIO
        String senha1 = String.valueOf(CadUsuarioSenha.getPassword());
        String senha2 = String.valueOf(CadUsuarioSenhaRep.getPassword());
        String usuario = CadUsuarioNome.getText();
        String senha = String.valueOf(CadUsuarioSenha.getPassword()); 
        
        if (senha1 == null ? senha2 == null : senha1.equals(senha2)) 
        {
            if (Codusuario.getText().isEmpty()) {
                try {
             
                    String sql = "INSERT INTO USUARIOS(idusuario, usuario, senha, gerencia, administrativo, operacional) VALUES (NULL, '"+usuario+"', '"+senha+"', '"+gerencia+"', '"+administrativo+"', '"+operacional+"');";
                    SQLConection conection = new SQLConection();
                    conection.SqlExecution(sql);
                    JOptionPane.showMessageDialog(null, "Usuário Cadastrado");
                    this.dispose();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro na execução do SQL <CADASTRO NOVO USUÁRIO>");
                }
                new CadUsuario().setVisible(true);
            }
            else
            {
                try {
                    String sql = "UPDATE USUARIOS SET senha = '"+senha+"' WHERE usuario LIKE '"+usuario+"';";
                    SQLConection conection = new SQLConection();
                    conection.SqlExecution(sql);
                    sql = "UPDATE USUARIOS SET gerencia = '"+gerencia+"' WHERE usuario LIKE '"+usuario+"';";
                    conection.SqlExecution(sql);
                    sql = "UPDATE USUARIOS SET administrativo = '"+administrativo+"' WHERE usuario LIKE '"+usuario+"';";
                    conection.SqlExecution(sql);
                    sql = "UPDATE USUARIOS SET operacional = '"+operacional+"' WHERE usuario LIKE '"+usuario+"';";
                    conection.SqlExecution(sql);
                    
                    JOptionPane.showMessageDialog(null, "Usuário Alterado");
                    this.dispose();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro na execução do SQL <ALTERAÇÃO USUARIO>");
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "As senhas digitadas não conferem");
        }
        
        new CadUsuario().setVisible(true);
    }//GEN-LAST:event_SalvarUsuarioActionPerformed

    private void AtualizarRBs()
    {
        if (AdministrativoRB.isSelected())
            administrativo = "s";
        else
            administrativo = "n";
        
        if (OperacionalRB.isSelected())
            operacional = "s";
        else
            operacional = "n";
        
        if (GerenciaRB.isSelected())
            gerencia = "s";
        else
            gerencia = "n";
    }
    
    private void AdministrativoRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdministrativoRBActionPerformed
        if (AdministrativoRB.isSelected()) {
                administrativo = "s";
        } else {
                administrativo = "n";
        }
    }//GEN-LAST:event_AdministrativoRBActionPerformed

    private void OperacionalRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OperacionalRBActionPerformed
        if (OperacionalRB.isSelected()) {
            operacional = "s";
        } else {
            operacional = "n";
        }
    }//GEN-LAST:event_OperacionalRBActionPerformed

    private void GerenciaRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerenciaRBActionPerformed
        if (GerenciaRB.isSelected()) {
            gerencia = "s";
        } else {
            gerencia = "n";
        }     
    }//GEN-LAST:event_GerenciaRBActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // DELETANDO USUÁRIOS
        
        String message = "Deseja deletar o Usuário Selecionado?";
        String title = "Confirmação";
        //Exibe caixa de dialogo (veja figura) solicitando confirmação ou não. 
        //Se o usuário clicar em "Sim" retorna 0 pra variavel reply, se informado não retorna 1
        int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
          if (reply == JOptionPane.YES_OPTION)
          {
            try {
            String delusuario = Codusuario.getText();
            String sql = "DELETE FROM USUARIOS WHERE IDUSUARIO = "+delusuario+"";
            SQLConection conection = new SQLConection();
            conection.SqlExecution(sql);
            JOptionPane.showMessageDialog(null, "USUÁRIO DELETADO COM SUCESSO!");
            this.dispose();
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "Erro ao deletar usuario!");     
            }
          }
          new CadUsuario().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ConsultarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarUsuarioActionPerformed
        try {
            //SQL para preencher os campos Codusuario, cadUsuarioNome, AdministrativoRB, OperacionalRB e GerenciaRB
            String codigo;
            String gerenciaId, administrativoId, operacionalId;

            String usuario = CadUsuarioNome.getText();
            String sql = "SELECT idusuario, gerencia, administrativo, operacional FROM USUARIOS WHERE USUARIO LIKE '"+usuario+"'";

            Connection con = SQLConection.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);
            
            rs.next();
            
            codigo = Integer.toString(rs.getInt("idusuario"));
            gerenciaId = rs.getString("gerencia");
            administrativoId = rs.getString("administrativo");
            operacionalId = rs.getString("operacional");

            Codusuario.setText(codigo);
            
            if ("s".equals(administrativoId))
                AdministrativoRB.setSelected(true);
            else
                AdministrativoRB.setSelected(false);
            
            if ("s".equals(operacionalId))
                OperacionalRB.setSelected(true);
            else
                OperacionalRB.setSelected(false);
            
            if ("s".equals(gerenciaId))
                GerenciaRB.setSelected(true);
            else
                GerenciaRB.setSelected(false); 
            
            AtualizarRBs();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar usuario!");
        }
    }//GEN-LAST:event_ConsultarUsuarioActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // iremos chamar minha tela de consulteUsers
         new ConsulteUsers().setVisible(true);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
  
            // facilitando para o cliente poder limpar os campos
            Codusuario.setText(null);
            CadUsuarioNome.setText(null);
            CadUsuarioSenha.setText(null);
            CadUsuarioSenhaRep.setText(null);
            AdministrativoRB.setSelected(false);
            OperacionalRB.setSelected(false);
            GerenciaRB.setSelected(false);
            
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AdministrativoRB;
    private javax.swing.JTextField CadUsuarioNome;
    private javax.swing.JPasswordField CadUsuarioSenha;
    private javax.swing.JPasswordField CadUsuarioSenhaRep;
    private javax.swing.JLabel CadUsuarioSenhaRepLabel;
    private javax.swing.JTextField Codusuario;
    private javax.swing.JButton ConsultarUsuario;
    private javax.swing.JRadioButton GerenciaRB;
    private javax.swing.JRadioButton OperacionalRB;
    private javax.swing.JButton SalvarUsuario;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
