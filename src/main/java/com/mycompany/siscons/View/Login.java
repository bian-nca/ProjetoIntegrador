package com.mycompany.siscons.View;

import static DAO.SQLConection.closeConnection;
import static DAO.SQLConection.getConnection;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
NOTAS AQUI!!!!!

CRIAR NO SEU WORKBENCH UMA TABELA COM OS SEGUINTES DADOS:
(já vou deixar o SQL de criação pra você só copiar e colar =D)

    CREATE TABLE usuarios(
        idusuario INT PRIMARY KEY AUTO_INCREMENT,
        usuario VARCHAR(30) NOT NULL,
        senha VARCHAR(30) NOT NULL,
        gerencia CHAR(1) NOT NULL,
        administrativo CHAR(1) NOT NULL,
        operacional CHAR(1) NOT NULL
    );
    
    Obs: Pensei nas colunas gerencia, administrativo e operacional como os parâmetros
    pra definição dos acessos dentro do programa (s=sim OU n=não)
*/

/**
 *
 * @author Bianca
 */
public class Login extends javax.swing.JFrame {
    String administrativo, operacional, gerencia;
    
    public Login() {
        initComponents();
  
        setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EntrarSistema = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        UsuarioLabel = new javax.swing.JLabel();
        SenhaLabel = new javax.swing.JLabel();
        InfoSenha = new javax.swing.JPasswordField();
        InfoUsuario = new javax.swing.JTextField();
        EntrarSistema1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(245, 198, 129));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EntrarSistema.setBackground(new java.awt.Color(246, 235, 187));
        EntrarSistema.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EntrarSistema.setText("Entrar");
        EntrarSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarSistemaActionPerformed(evt);
            }
        });
        getContentPane().add(EntrarSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 90, 40));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 172, 56));
        jLabel2.setText("Login");
        jLabel2.setToolTipText("");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 160, 90));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, -10, 40, 60));

        UsuarioLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UsuarioLabel.setText("Usuário:");
        getContentPane().add(UsuarioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, -1));

        SenhaLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SenhaLabel.setText("Senha:");
        getContentPane().add(SenhaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, -1, -1));

        InfoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoSenhaActionPerformed(evt);
            }
        });
        InfoSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                InfoSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(InfoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 200, 30));

        InfoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoUsuarioActionPerformed(evt);
            }
        });
        InfoUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                InfoUsuarioKeyPressed(evt);
            }
        });
        getContentPane().add(InfoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 200, 30));

        EntrarSistema1.setBackground(new java.awt.Color(246, 235, 187));
        EntrarSistema1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EntrarSistema1.setText("Entrar");
        EntrarSistema1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarSistema1ActionPerformed(evt);
            }
        });
        getContentPane().add(EntrarSistema1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 90, 40));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, -1, -1));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 30, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bianca\\Documents\\NetBeansProjects\\ProjetoIntegrador\\src\\main\\java\\com\\mycompany\\siscons\\resources\\login.jpg")); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    private void EntrarSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarSistemaActionPerformed
        String user = InfoUsuario.getText();
        String password = String.valueOf(InfoSenha.getPassword());
                
        boolean resposta = false;
        
        try {
            resposta = consultar (user, password);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro na Consulta de Usuáro e Senha");
        }
 
        if (resposta == true){
            loginOK();
         
        }else {
         JOptionPane.showMessageDialog(rootPane, "Usuário ou Senha Inválidos");
        }
    }//GEN-LAST:event_EntrarSistemaActionPerformed

    private void loginOK()
    {
        Menu menu = new Menu();
        menu.setVisible(true);
        menu.setAdministrativo(administrativo);
        menu.setGerencia(gerencia);
        menu.setOperacional(operacional);
        
        this.dispose();
    }
    
    private void InfoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InfoSenhaActionPerformed

    private void InfoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InfoUsuarioActionPerformed

    private void EntrarSistema1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarSistema1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntrarSistema1ActionPerformed

    private void InfoUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InfoUsuarioKeyPressed
        // tentando fazer o enter funcionar
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            InfoSenha.requestFocus();
        }
    }//GEN-LAST:event_InfoUsuarioKeyPressed

    private void InfoSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InfoSenhaKeyPressed
        // enter validar o codigo para entrar ao inves de ter que apertar o botao enter
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            EntrarSistema.requestFocus();
            String user = InfoUsuario.getText();
            String password = String.valueOf(InfoSenha.getPassword());
                
            boolean resposta = false;
        
             try {
                resposta = consultar (user, password);
             } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro na Consulta de Usuáro e Senha");
        }
 
        if (resposta == true){
            loginOK();
         
        }else {
         JOptionPane.showMessageDialog(rootPane, "Usuário ou Senha Inválidos");
        }
        }
    }//GEN-LAST:event_InfoSenhaKeyPressed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EntrarSistema;
    private javax.swing.JButton EntrarSistema1;
    private javax.swing.JPasswordField InfoSenha;
    private javax.swing.JTextField InfoUsuario;
    private javax.swing.JLabel SenhaLabel;
    private javax.swing.JLabel UsuarioLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables

    private boolean consultar(String login, String senha) throws SQLException {
        boolean autenticado = false;
        String sql = "SELECT usuario, senha, administrativo, operacional, gerencia FROM usuarios WHERE usuario = ? and senha = ?";
        PreparedStatement ps;
        Connection connection = getConnection();
 
        ps = connection.prepareStatement(sql);
        ps.setString(1, login);
        ps.setString(2, senha);
        
 
        ResultSet rs;
        rs = ps.executeQuery();
 
        if (rs.next()) 
        {
            autenticado = true;
            administrativo = rs.getString("administrativo");
            operacional = rs.getString("operacional");
            gerencia = rs.getString("gerencia");
        }
 
        ps.close();
        closeConnection(connection);
   
        return autenticado;
    }

    private Object EntrarSistemaActionPerformed() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
