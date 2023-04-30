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
        jMenuItem3 = new javax.swing.JMenuItem();
        InfosCadClientes = new javax.swing.JMenuItem();
        InfosCot = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        InfosConfig = new javax.swing.JMenu();
        TelaPedidos = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

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

        CadadastrarEmpresa.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bianca\\Documents\\NetBeansProjects\\ProjetoIntegrador\\src\\main\\java\\com\\mycompany\\siscons\\resources\\companhia.png")); // NOI18N
        CadadastrarEmpresa.setText("Cadastro de Empresa");
        CadadastrarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadadastrarEmpresaActionPerformed(evt);
            }
        });
        InfosCad.add(CadadastrarEmpresa);

        CadUsuario.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bianca\\Documents\\NetBeansProjects\\ProjetoIntegrador\\src\\main\\java\\com\\mycompany\\siscons\\resources\\Usuarios.png")); // NOI18N
        CadUsuario.setText("Cadastro Usuarios");
        CadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadUsuarioActionPerformed(evt);
            }
        });
        InfosCad.add(CadUsuario);

        CadBancos.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bianca\\Documents\\NetBeansProjects\\ProjetoIntegrador\\src\\main\\java\\com\\mycompany\\siscons\\resources\\banco.png")); // NOI18N
        CadBancos.setText("Cadastro de Bancos");
        CadBancos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadBancosActionPerformed(evt);
            }
        });
        InfosCad.add(CadBancos);

        CadProdutos.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bianca\\Documents\\NetBeansProjects\\ProjetoIntegrador\\src\\main\\java\\com\\mycompany\\siscons\\resources\\materiais.png")); // NOI18N
        CadProdutos.setText("Cadastro Produtos");
        CadProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadProdutosActionPerformed(evt);
            }
        });
        InfosCad.add(CadProdutos);

        CadOperacoes.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bianca\\Documents\\NetBeansProjects\\ProjetoIntegrador\\src\\main\\java\\com\\mycompany\\siscons\\resources\\forma-de-pagamento.png")); // NOI18N
        CadOperacoes.setText("Cadastro Operações");
        CadOperacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadOperacoesActionPerformed(evt);
            }
        });
        InfosCad.add(CadOperacoes);

        jMenuItem3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bianca\\Documents\\NetBeansProjects\\ProjetoIntegrador\\src\\main\\java\\com\\mycompany\\siscons\\resources\\vendedora.png")); // NOI18N
        jMenuItem3.setText("Cadastro de Vendedores");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        InfosCad.add(jMenuItem3);

        InfosCadClientes.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bianca\\Documents\\NetBeansProjects\\ProjetoIntegrador\\src\\main\\java\\com\\mycompany\\siscons\\resources\\clientes.png")); // NOI18N
        InfosCadClientes.setText("Cadastro Clientes | Fornecedores");
        InfosCadClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfosCadClientesActionPerformed(evt);
            }
        });
        InfosCad.add(InfosCadClientes);

        jMenuBar1.add(InfosCad);

        InfosCot.setText("Cotação");

        jMenuItem1.setText("Cotação de Vendas");
        InfosCot.add(jMenuItem1);

        jMenuItem13.setText("Cotação de Compras");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        InfosCot.add(jMenuItem13);

        jMenuBar1.add(InfosCot);

        InfosConfig.setText("Operação");

        TelaPedidos.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bianca\\Documents\\NetBeansProjects\\ProjetoIntegrador\\src\\main\\java\\com\\mycompany\\siscons\\resources\\adicionar-ao-carrinho.png")); // NOI18N
        TelaPedidos.setText("Vendas");
        TelaPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelaPedidosActionPerformed(evt);
            }
        });
        InfosConfig.add(TelaPedidos);

        jMenuItem12.setText("Movimento de Caixa");
        InfosConfig.add(jMenuItem12);

        jMenuItem5.setText("Entrada de Estoque");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        InfosConfig.add(jMenuItem5);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Saída de Estoque");
        InfosConfig.add(jCheckBoxMenuItem1);

        jMenuBar1.add(InfosConfig);

        jMenu3.setText("Financeiro");

        jMenu1.setText("Contas a Pagar");

        jMenuItem2.setText("Lançamentos");
        jMenu1.add(jMenuItem2);

        jMenuItem7.setText("Conta Corrente do Fornecedor");
        jMenu1.add(jMenuItem7);

        jMenu3.add(jMenu1);

        jMenu2.setText("Contas a Receber");

        jMenuItem8.setText("Lançamentos");
        jMenu2.add(jMenuItem8);

        jMenuItem11.setText("Conta Corrente do Cliente");
        jMenu2.add(jMenuItem11);

        jMenu3.add(jMenu2);

        jMenuBar1.add(jMenu3);

        jMenu6.setText("Relatórios");
        jMenu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu6ActionPerformed(evt);
            }
        });

        jMenuItem4.setText("Gerar Relatórios");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem4);

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
            new Empresa().setVisible(true); //chamando minha tela de cadastro de empresa.
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

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        new Vendedores().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu6ActionPerformed
        
    }//GEN-LAST:event_jMenu6ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new Relatorios().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed



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
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables

}
