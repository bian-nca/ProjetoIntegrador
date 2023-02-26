/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.siscons.View;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Bianca
 */
public class Menu extends javax.swing.JFrame {
    
    String gerencia, operacional, administrativo;

    public void setGerencia(String gerencia) {
        this.gerencia = gerencia;
    }

    public void setOperacional(String operacional) {
        this.operacional = operacional;
    }

    public void setAdministrativo(String administrativo) {
        this.administrativo = administrativo;
    }
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        InfosCad = new javax.swing.JMenu();
        CadadastrarEmpresa = new javax.swing.JMenuItem();
        CadUsuario = new javax.swing.JMenuItem();
        CadBancos = new javax.swing.JMenuItem();
        CadProdutos = new javax.swing.JMenuItem();
        CadOperacoes = new javax.swing.JMenuItem();
        InfosCadClientes = new javax.swing.JMenuItem();
        InfosCot = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        InfosConfig = new javax.swing.JMenu();
        TelaPedidos = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISCONS");

        InfosCad.setText("Cadastro");
        InfosCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfosCadActionPerformed(evt);
            }
        });

        CadadastrarEmpresa.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bianca\\Documents\\NetBeansProjects\\Siscons\\ProjetoIntegrador\\src\\main\\java\\com\\mycompany\\siscons\\resources\\companhia.png")); // NOI18N
        CadadastrarEmpresa.setText("Cadastro de Empresa");
        CadadastrarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadadastrarEmpresaActionPerformed(evt);
            }
        });
        InfosCad.add(CadadastrarEmpresa);

        CadUsuario.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bianca\\Documents\\NetBeansProjects\\Siscons\\ProjetoIntegrador\\src\\main\\java\\com\\mycompany\\siscons\\resources\\Usuarios.png")); // NOI18N
        CadUsuario.setText("Cadastro Usuarios");
        CadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadUsuarioActionPerformed(evt);
            }
        });
        InfosCad.add(CadUsuario);

        CadBancos.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bianca\\Documents\\NetBeansProjects\\Siscons\\ProjetoIntegrador\\src\\main\\java\\com\\mycompany\\siscons\\resources\\banco.png")); // NOI18N
        CadBancos.setText("Cadastro de Bancos");
        CadBancos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadBancosActionPerformed(evt);
            }
        });
        InfosCad.add(CadBancos);

        CadProdutos.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bianca\\Documents\\NetBeansProjects\\Siscons\\ProjetoIntegrador\\src\\main\\java\\com\\mycompany\\siscons\\resources\\materiais.png")); // NOI18N
        CadProdutos.setText("Cadastro Produtos");
        CadProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadProdutosActionPerformed(evt);
            }
        });
        InfosCad.add(CadProdutos);

        CadOperacoes.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bianca\\Documents\\NetBeansProjects\\Siscons\\ProjetoIntegrador\\src\\main\\java\\com\\mycompany\\siscons\\resources\\forma-de-pagamento.png")); // NOI18N
        CadOperacoes.setText("Cadastro Operações");
        CadOperacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadOperacoesActionPerformed(evt);
            }
        });
        InfosCad.add(CadOperacoes);

        InfosCadClientes.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bianca\\Documents\\NetBeansProjects\\Siscons\\ProjetoIntegrador\\src\\main\\java\\com\\mycompany\\siscons\\resources\\clientes.png")); // NOI18N
        InfosCadClientes.setText("Cadastro Clientes | Fornecedores");
        InfosCadClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfosCadClientesActionPerformed(evt);
            }
        });
        InfosCad.add(InfosCadClientes);

        jMenuBar1.add(InfosCad);

        InfosCot.setText("Cotação");

        jMenuItem13.setText("Cotação de Compra");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        InfosCot.add(jMenuItem13);

        jMenuItem1.setText("jMenuItem1");
        InfosCot.add(jMenuItem1);

        jMenuBar1.add(InfosCot);

        InfosConfig.setText("Operação");

        TelaPedidos.setText("Vendas");
        TelaPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelaPedidosActionPerformed(evt);
            }
        });
        InfosConfig.add(TelaPedidos);

        jMenuItem12.setText("Movimento de Caixa");
        InfosConfig.add(jMenuItem12);

        jMenuBar1.add(InfosConfig);

        jMenu3.setText("Financeiro");

        jMenu1.setText("Contas a Pagar");

        jMenuItem2.setText("Lançamentos");
        jMenu1.add(jMenuItem2);

        jMenuItem5.setText("Lançamentos e Alterações");
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Baixa de Títulos");
        jMenu1.add(jMenuItem6);

        jMenuItem7.setText("Conta Corrente do Fornecedor");
        jMenu1.add(jMenuItem7);

        jMenu3.add(jMenu1);

        jMenu2.setText("Contas a Receber");

        jMenuItem8.setText("Lançamentos");
        jMenu2.add(jMenuItem8);

        jMenuItem9.setText("Lançamentos e Alterações");
        jMenu2.add(jMenuItem9);

        jMenuItem10.setText("Baixa de Titulos");
        jMenu2.add(jMenuItem10);

        jMenuItem11.setText("Conta Corrente do Cliente");
        jMenu2.add(jMenuItem11);

        jMenu3.add(jMenu2);

        jMenuBar1.add(jMenu3);

        jMenu6.setText("Relatórios");
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 467, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InfosCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfosCadActionPerformed
        // CHAMANDO MINHA TELA DE CADASTRO DE CLIENTES
        
    }//GEN-LAST:event_InfosCadActionPerformed

    private void InfosCadClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfosCadClientesActionPerformed
        if ("s".equals(gerencia) || "s".equals(administrativo) || "s".equals(operacional)) 
        {
            new CadClienteFornecedor().setVisible(true);
        }
        else
            JOptionPane.showMessageDialog(null, "Você não tem permissão");
    }//GEN-LAST:event_InfosCadClientesActionPerformed

    private void CadOperacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadOperacoesActionPerformed
        // Cadastraremos as formas de pagamento por aqui a qual irá chamar a tela de cadastro de pagamento
        if ("s".equals(gerencia) || "s".equals(administrativo)) 
        {
            new FormaPagamento().setVisible(true);
        }
        else
            JOptionPane.showMessageDialog(null, "Você não tem permissão");
    }//GEN-LAST:event_CadOperacoesActionPerformed

    private void CadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadUsuarioActionPerformed
        // Salvaremos nossos usuarios novos aqui
        // Acesso Gerência e Administrativo
        if ("s".equals(gerencia) || "s".equals(administrativo)) 
        {
            new CadUsuario().setVisible(true);
        }
        else
            JOptionPane.showMessageDialog(null, "Você não tem permissão");
    }//GEN-LAST:event_CadUsuarioActionPerformed

    private void CadProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadProdutosActionPerformed
        // chamar tela de cadastro de produtos
        if ("s".equals(gerencia) || "s".equals(administrativo)) 
        {
            new CadProdutos().setVisible(true);
        }
        else
            JOptionPane.showMessageDialog(null, "Você não tem permissão");
    }//GEN-LAST:event_CadProdutosActionPerformed

    private void CadBancosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadBancosActionPerformed
        // chamar minha tela de cadastro de bancos
        if ("s".equals(gerencia) || "s".equals(administrativo)) 
        {
            new Bancos().setVisible(true);
        }
        else
            JOptionPane.showMessageDialog(null, "Você não tem permissão");
    }//GEN-LAST:event_CadBancosActionPerformed

    private void CadadastrarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadadastrarEmpresaActionPerformed
        // chamar minha tela de cadstro de empresa
        if ("s".equals(gerencia) || "s".equals(administrativo)) 
        {
            new CadLoja().setVisible(true);
        }
        else
            JOptionPane.showMessageDialog(null, "Você não tem permissão");
    }//GEN-LAST:event_CadadastrarEmpresaActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void TelaPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelaPedidosActionPerformed
        // TODO add your handling code here:
        new Pedidos().setVisible(true);
    }//GEN-LAST:event_TelaPedidosActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CadBancos;
    private javax.swing.JMenuItem CadOperacoes;
    private javax.swing.JMenuItem CadProdutos;
    private javax.swing.JMenuItem CadUsuario;
    private javax.swing.JMenuItem CadadastrarEmpresa;
    private javax.swing.JMenu InfosCad;
    private javax.swing.JMenuItem InfosCadClientes;
    private javax.swing.JMenu InfosConfig;
    private javax.swing.JMenu InfosCot;
    private javax.swing.JMenuItem TelaPedidos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables

}
