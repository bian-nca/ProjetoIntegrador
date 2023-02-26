/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.siscons.View;

import DAO.SQLConection;
import Model.ConsultaBanco;
import Model.ConsulteProdutos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bianca
 */
public class CadProdutos extends javax.swing.JFrame {

    /**
     * Creates new form CadProdutos
     */
    public CadProdutos() {
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
        jLabel4 = new javax.swing.JLabel();
        descricao = new javax.swing.JTextField();
        ncm = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cest = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        vlr_custo = new javax.swing.JTextField();
        vlr_venda_vista = new javax.swing.JTextField();
        vlr_venda_prazo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        marca = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        qtd_estoque = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        tipo_item = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        unidade = new javax.swing.JTextField();
        codigo = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setTitle("Cadastro de Estoque");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Código:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Descrição:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("NCM:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("CEST:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Valor de Custo:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Venda a Vista:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Venda a Prazo:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Unidade:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Marca:");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Qtd em Estoque:");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Tipo do Item:");

        tipo_item.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "00 - Mercadoria para Revenda", "01 - Matéria Prima", "02 - Embalagem", "03 - Produto em Processo", "04 - Produto Acabado", "05- Subproduto", "06 - Produto Intermediário", "07 - Materia de Uso e Consumo", "08 - Serviços", "09 - Outros Insumos", "10 - Outros" }));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 0));
        jButton3.setText("SALVAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 102));
        jButton5.setText("CONSULTAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        codigo.setEditable(false);

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(102, 0, 0));
        jButton6.setText("EXCLUIR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 102));
        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setText("EDITAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel15))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(vlr_custo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(qtd_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel11)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(unidade, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel13)
                        .addGap(26, 26, 26)
                        .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(vlr_venda_vista, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel10)
                        .addGap(6, 6, 6)
                        .addComponent(vlr_venda_prazo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(300, 300, 300)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(ncm, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(tipo_item, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12)
                        .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(9, 9, 9)
                        .addComponent(cest, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(ncm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(tipo_item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jButton1))
                            .addComponent(cest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jLabel15)
                        .addComponent(qtd_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(unidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(vlr_custo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(vlr_venda_vista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(vlr_venda_prazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // SALVANDO OS PRODUTOS NO BANCO DE DADOS
        /**
         * 
    create table produtos(
        codigo int primary key auto_increment,
        descricao varchar(100) not null,
        ncm int(8),
        cest int(8),
        tipo_item varchar(100),
        qtd_estoque int not null,
        unidade varchar(50),
        marca varchar(100),
        vlr_custo float,
        vlr_venda_vista float,
        vlr_venda_prazo float
);
         * 
         */
          try {
                String desc = descricao.getText();
                String numero_cm = ncm.getText();
                String c_est = cest.getText();
                String item = tipo_item.getItemAt(WIDTH);
                String est = qtd_estoque.getText();
                String und = unidade.getText();
                String marc = marca.getText();
                String custo = vlr_custo.getText();
                String vista = vlr_venda_vista.getText();
                String prazo = vlr_venda_prazo.getText();
                String sqlprod = "INSERT into PRODUTOS(codigo, descricao, ncm, cest, tipo_item, qtd_estoque, unidade, marca, vlr_custo, vlr_venda_vista, vlr_venda_prazo) VALUES (NULL, '"+desc+"','"+numero_cm+"', '"+c_est+"', '"+item+"', '"+est+"', '"+und+"', '"+marc+"', '"+custo+"', '"+vista+"', '"+prazo+"')";
                SQLConection conection = new SQLConection();
                conection.SqlExecution(sqlprod);
                JOptionPane.showMessageDialog(null, "Produto Cadastrado!");
                this.dispose();    
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro na execução do SQL");
                JOptionPane.showMessageDialog(null, "NÃO FOI POSSÍVEL ESTABELECER CONEXÃO COM O BANCO DE DADOS");
            }
                         
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //Buscando produtos cadastrados anteriormente para podermos editar ou excluir
         new ConsulteProdutos().setVisible(true);
         
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //trazendo informações de produto ja cadastrado 
         try {
            String cod,desc, ncmer,cestpro, titem, est, und, marc, custo, vista, prazo;
            
            String prod = descricao.getText();
            String sql = "SELECT codigo, descricao, ncm, cest,tipo_item, qtd_estoque, unidade, marca, vlr_custo, vlr_venda_vista, vlr_venda_prazo FROM PRODUTOS WHERE DESCRICAO LIKE '"+prod+"'";

            Connection con = SQLConection.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);
            
            rs.next();
            
            cod = Integer.toString(rs.getInt("codigo"));
            desc = rs.getString("descricao");
            ncmer = Integer.toString(rs.getInt("ncm"));
            cestpro = Integer.toString(rs.getInt("cest"));
            titem = rs.getString("tipo_item");
            est = Integer.toString(rs.getInt("qtd_estoque"));
            und = rs.getString("unidade");
            marc = rs.getString("marca");
            custo = Float.toString(rs.getFloat("vlr_custo"));
            vista = Float.toString(rs.getFloat("vlr_venda_vista"));
            prazo = Float.toString(rs.getFloat("vlr_venda_prazo"));
            
            
            codigo.setText(cod);
            descricao.setText(desc);
            ncm.setText(ncmer);
            cest.setText(cestpro);
            tipo_item.setToolTipText(titem);
            qtd_estoque.setText(est);
            unidade.setText(und);
            marca.setText(marc);
            vlr_custo.setText(custo);
            vlr_venda_vista.setText(vista);
            vlr_venda_prazo.setText(prazo);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar produto!");
        }
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // editando os dados 
        
        try {
                    String codprod = codigo.getText();
                    String prod = descricao.getText();
                    String ncmer = ncm.getText();
                    String ce_st = cest.getText();
                    String titem = tipo_item.getItemAt(WIDTH);
                    String saldo = qtd_estoque.getText();
                    String und = unidade.getText();
                    String marc = marca.getText();
                    String vlrcusto = vlr_custo.getText();
                    String vista = vlr_venda_vista.getText();
                    String prazo = vlr_venda_prazo.getText();
                    
                    String sql = "UPDATE PRODUTOS SET descricao = '"+prod+"' WHERE codigo = '"+codprod+"';";
                    SQLConection conection = new SQLConection();
                    conection.SqlExecution(sql);
                    String sql1 = "UPDATE PRODUTOS SET ncm = '"+ncmer+"' WHERE codigo = '"+codprod+"';";
                    conection.SqlExecution(sql1);
                    String sql2 = "UPDATE PRODUTOS SET cest = '"+ce_st+"' WHERE codigo = '"+codprod+"';";
                    conection.SqlExecution(sql2);
                    String sql3 = "UPDATE PRODUTOS SET tipo_item = '"+titem+"' WHERE codigo = '"+codprod+"';";
                    conection.SqlExecution(sql3);
                    String sql4 = "UPDATE PRODUTOS SET qtd_estoque = '"+saldo+"' WHERE codigo = '"+codprod+"';";
                    conection.SqlExecution(sql4);
                    String sql5 = "UPDATE PRODUTOS SET unidade = '"+und+"' WHERE codigo = '"+codprod+"';";
                    conection.SqlExecution(sql5);
                    String sql6 = "UPDATE PRODUTOS SET marca = '"+marc+"' WHERE codigo = '"+codprod+"';";
                    conection.SqlExecution(sql6);
                    String sql7 = "UPDATE PRODUTOS SET vlr_custo = '"+vlrcusto+"' WHERE codigo = '"+codprod+"';";
                    conection.SqlExecution(sql7);
                    String sql8 = "UPDATE PRODUTOS SET vlr_venda_vista = '"+vista+"' WHERE codigo = '"+codprod+"';";
                    conection.SqlExecution(sql8);
                    String sql9 = "UPDATE PRODUTOS SET vlr_venda_prazo = '"+prazo+"' WHERE codigo = '"+codprod+"';";
                    conection.SqlExecution(sql9);
                    
                    JOptionPane.showMessageDialog(null, "PRODUTO ALTERADO COM SUCESSO");
                    this.dispose();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "ERRO AO CONSULTAR O PRODUTO");
                }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // EXCLUINDO O PRODUTO  -UTILIZEI O CÓDIGO DO ALVARO EM USUARIOS AQUI PARA CONFIRMAÇÃO DE DELETAREM 
        String message = "Deseja deletar o Produto Selecionado?";
        String title = "Confirmação";
        int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
          if (reply == JOptionPane.YES_OPTION)
          {
            try {
            String delprod = codigo.getText();
            String sql = "DELETE FROM PRODUTOS WHERE CODIGO = "+delprod+"";
            SQLConection conection = new SQLConection();
            conection.SqlExecution(sql);
            JOptionPane.showMessageDialog(null, "PRODUTO DELETADO COM SUCESSO!");
            this.dispose();
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "Erro ao deletar produto!");     
            }
          }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cest;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField descricao;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField marca;
    private javax.swing.JTextField ncm;
    private javax.swing.JTextField qtd_estoque;
    private javax.swing.JComboBox<String> tipo_item;
    private javax.swing.JTextField unidade;
    private javax.swing.JTextField vlr_custo;
    private javax.swing.JTextField vlr_venda_prazo;
    private javax.swing.JTextField vlr_venda_vista;
    // End of variables declaration//GEN-END:variables
}
