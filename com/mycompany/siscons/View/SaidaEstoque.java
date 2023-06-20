
package com.mycompany.siscons.View;

import DAO.SQLConection;
import Model.ConsulteClientes;
import Model.ConsulteFornecedores;
import Model.ConsulteProdutos;
import Model.ConsulteSaidaEstoque;
import Model.ConsulteVendedores;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Bianca
 */
public class SaidaEstoque extends javax.swing.JFrame {
        MaskFormatter mfdata; //para inserir a mascara para data no meu jfield;

    public SaidaEstoque() throws SQLException {
         try {   
            mfdata = new MaskFormatter("##/##/####");
            
        } catch (ParseException ex) {
            System.out.println("Insira uma data válida!");
        } 
        initComponents();
        setLocationRelativeTo(null);
        data_venda.setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date(System.currentTimeMillis())));
        SQLConection conection = new SQLConection();
            String sql = "SELECT MAX(ID) AS MAX_IDSAIDAESTOQUE FROM SAIDA_EST"; 
            Connection con = SQLConection.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                int maxId = rs.getInt("MAX_IDSAIDAESTOQUE");
                int proxId = maxId + 1;
                txt_consulteid.setText(Integer.toString(proxId));
            }  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_consulteid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        sit = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_pesq_cod = new javax.swing.JTextField();
        txt_vendedor = new javax.swing.JTextField();
        txt_desc_forn = new javax.swing.JTextField();
        txt_descvend = new javax.swing.JTextField();
        BotaoFiltrar = new javax.swing.JButton();
        BotaoFiltrar1 = new javax.swing.JButton();
        botao_consulte = new javax.swing.JButton();
        botao_consulte1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        txt_prod = new javax.swing.JTextField();
        txt_descprod = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        codigo_produto = new javax.swing.JTextField();
        txt_estoque = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        produto_descricao = new javax.swing.JTextField();
        qtd_estoqentrada = new javax.swing.JTextField();
        botao_add = new javax.swing.JButton();
        botao_rmv = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_saidaest = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        justificativa = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        data_venda = new javax.swing.JFormattedTextField(mfdata);

        setTitle("Saída de Estoque");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txt_consulteid, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 70, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nº");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        jButton4.setText("Consultar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Cancelada?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 70, -1));

        sit.setEditable(false);
        getContentPane().add(sit, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 60, -1));

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel4.setText("Fornecedor:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Vendedor:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txt_pesq_cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pesq_codActionPerformed(evt);
            }
        });
        getContentPane().add(txt_pesq_cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 70, -1));
        getContentPane().add(txt_vendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 70, -1));
        getContentPane().add(txt_desc_forn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 310, -1));
        getContentPane().add(txt_descvend, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 310, -1));

        BotaoFiltrar.setText("Filtrar");
        BotaoFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoFiltrarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, -1, -1));

        BotaoFiltrar1.setText("Filtrar");
        BotaoFiltrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoFiltrar1ActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoFiltrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, -1, -1));

        botao_consulte.setText("Consultar");
        botao_consulte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_consulteActionPerformed(evt);
            }
        });
        getContentPane().add(botao_consulte, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, -1, -1));

        botao_consulte1.setText("Consultar");
        botao_consulte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_consulte1ActionPerformed(evt);
            }
        });
        getContentPane().add(botao_consulte1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 690, 10));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Codigo Produto:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        txt_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_prodActionPerformed(evt);
            }
        });
        getContentPane().add(txt_prod, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 80, -1));

        txt_descprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_descprodActionPerformed(evt);
            }
        });
        getContentPane().add(txt_descprod, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 300, -1));

        jButton10.setText("Filtrar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, -1, -1));

        jButton11.setText("Consultar");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 690, 10));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Codigo:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setText("Estoque");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        codigo_produto.setEditable(false);
        codigo_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigo_produtoActionPerformed(evt);
            }
        });
        getContentPane().add(codigo_produto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 80, -1));

        txt_estoque.setEditable(false);
        txt_estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_estoqueActionPerformed(evt);
            }
        });
        getContentPane().add(txt_estoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 80, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Produto:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Quantidade:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        produto_descricao.setEditable(false);
        getContentPane().add(produto_descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 300, -1));
        getContentPane().add(qtd_estoqentrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 80, -1));

        botao_add.setText("Adicionar Item");
        botao_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_addActionPerformed(evt);
            }
        });
        getContentPane().add(botao_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, -1));

        botao_rmv.setText("Excluir");
        botao_rmv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_rmvActionPerformed(evt);
            }
        });
        getContentPane().add(botao_rmv, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, -1, -1));

        tabela_saidaest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Saldo Atual", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela_saidaest);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 690, 150));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("OBS:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));
        getContentPane().add(justificativa, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 570, 30));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 0));
        jButton1.setText("Atualizar estoque");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 0, 0));
        jButton2.setText("Cancelar ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, -1, -1));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 51));
        jButton5.setText("Limpar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, -1, 30));

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel5.setText("Data:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, 20));

        new javax.swing.JFormattedTextField(mfdata);
        data_venda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data_vendaActionPerformed(evt);
            }
        });
        getContentPane().add(data_venda, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 80, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // buscando informações da minha saida de estoque realizada
        try { 
            String codsaida, datasaida, codforne, descforn, codvend, descvend, justi, situation;
            String saida = txt_consulteid.getText();
            String sql = "SELECT * from saida_est where id LIKE '"+saida+"'";
            String sqlprods = "SELECT * from saida_prods where id_saida LIKE '"+saida+"'";
            try{
                Connection con = SQLConection.getConnection();
                PreparedStatement stmt = con.prepareStatement(sqlprods);
                ResultSet rs = stmt.executeQuery();
                DefaultTableModel modelo = (DefaultTableModel) tabela_saidaest.getModel();
                modelo.setNumRows(0); /* Vai ter nenhuma linha inicialmente, elas serão adicionadas conforme o bd for encontrando no meu banco de dados*/
                    
                while(rs.next()){   /*Enquanto houver dados ele irá fazer esse comando para pegar todas as minhas informações*/
                    modelo.addRow(new Object[]{rs.getString("codprod"), rs.getString("descprod"),rs.getString("saldoanterior"), rs.getString("qtdprod")});   
                }
                con.close();
            } catch (SQLException ex) {
                    Logger.getLogger(ConsulteClientes.class.getName()).log(Level.SEVERE, null, ex);
                }
            Connection con = SQLConection.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
 
            ResultSet rs = stmt.executeQuery(sql);
            
            rs.next();
            
            codsaida = Integer.toString(rs.getInt("id"));
            datasaida = rs.getString("datasaida");
            codforne = Integer.toString(rs.getInt("id_fornecedor"));
            descforn = rs.getString("fornecedor");            
            codvend = Integer.toString(rs.getInt("id_vend"));
            descvend = rs.getString("name_vend");
            justi = rs.getString("justificativa");
            situation = rs.getString("cancelada");
            
      
            txt_consulteid.setText(codsaida);
            data_venda.setText(datasaida);
            txt_pesq_cod.setText(codforne);
            txt_desc_forn.setText(descforn);
            txt_vendedor.setText(codvend);
            txt_descvend.setText(descvend);
            justificativa.setText(justi);
            sit.setText(situation);
            
            if(txt_consulteid.getText() != null) {        
                data_venda.setEnabled(false);
                txt_pesq_cod.setEnabled(false);
                txt_desc_forn.setEnabled(false);
                txt_vendedor.setEnabled(false);
                txt_descvend.setEnabled(false);
                txt_prod.setEnabled(false);
                txt_descprod.setEnabled(false);
                tabela_saidaest.setEnabled(false);
                justificativa.setEnabled(false);
               
                String situacao = sit.getText();
                
                if(situacao.equals("SIM")) {
                    jButton2.setEnabled(false);
                } else{
                    jButton2.setEnabled(true);
                }        
        }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao consultar entrada de estoque!");

        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // irá buscar para consultar minhas entradas de estoque
        new ConsulteSaidaEstoque().setVisible(true);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void txt_pesq_codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pesq_codActionPerformed
        //

    }//GEN-LAST:event_txt_pesq_codActionPerformed

    private void BotaoFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoFiltrarActionPerformed
        // BUSCANDO O FORNECEDOR PELO CODIGO QUE EU DESEJO, no caso como é uma saída de estoque o fornecedor SEMPRE será o SISCONS TECNOLOGIA
       try {
            String codigo, fornecedor; 
            
            String forn = txt_pesq_cod.getText();
            String sql = "SELECT idpj, razao FROM PESSOAJURIDICA WHERE IDPJ LIKE '"+forn+"'";

            Connection con = SQLConection.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);
            
            rs.next();
            
            codigo = Integer.toString(rs.getInt("idpj"));
            forn = rs.getString("razao");
           
            txt_pesq_cod.setText(codigo);
            txt_desc_forn.setText(forn);
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO BUSCAR FORNECEDOR!");
            JOptionPane.showMessageDialog(null, "Consulte se essa fornecedor está cadastrado!");
        }
    }//GEN-LAST:event_BotaoFiltrarActionPerformed

    private void BotaoFiltrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoFiltrar1ActionPerformed
        // BUSCANDO O VENDEDOR PELO NOME QUE EU DESEJO
        try {
            String codigo, vendedor; 
            
            String vendedores = txt_vendedor.getText();
            String sql = "SELECT idvendedor, nome FROM VENDEDORES WHERE IDVENDEDOR LIKE '"+vendedores+"'";

            Connection con = SQLConection.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);
            
            rs.next();
            
            codigo = Integer.toString(rs.getInt("idvendedor"));
            vendedor = rs.getString("nome");
           
            txt_vendedor.setText(codigo);
            txt_descvend.setText(vendedor);
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO BUSCAR VENDEDOR!");
            JOptionPane.showMessageDialog(null, "Consulte se essa vendedor cadastrado!");
        }
    }//GEN-LAST:event_BotaoFiltrar1ActionPerformed

    private void botao_consulteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_consulteActionPerformed
        // Consultar meus fornecedores ja cadastrados
        new ConsulteFornecedores().setVisible(true);
    }//GEN-LAST:event_botao_consulteActionPerformed

    private void botao_consulte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_consulte1ActionPerformed
        // chamando minha tela onde irei consultar meus vendedores cadastrados;
                  new ConsulteVendedores().setVisible(true);                                                 

    }//GEN-LAST:event_botao_consulte1ActionPerformed

    private void txt_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_prodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_prodActionPerformed

    private void txt_descprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_descprodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_descprodActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        //
        try {
            String codigo, produto, quantidade, saldoatual, est;
            String codprod = txt_prod.getText();
            String sql = "SELECT codigo, descricao, vlr_venda_vista, qtd_estoque FROM PRODUTOS WHERE CODIGO LIKE '"+codprod+"'";

            Connection con = SQLConection.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);

            rs.next();

            codigo = Integer.toString(rs.getInt("codigo"));
            produto = rs.getString("descricao");
            saldoatual = Integer.toString(rs.getInt("qtd_estoque"));
            
            codigo_produto.setText(codigo);
            produto_descricao.setText(produto);
            txt_estoque.setText(saldoatual);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO BUSCAR O PRODUTO!");
            JOptionPane.showMessageDialog(null, "Consulte o suporte técnico para mais informações!");
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        new ConsulteProdutos().setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void codigo_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigo_produtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigo_produtoActionPerformed

    private void txt_estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_estoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_estoqueActionPerformed

    private void botao_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_addActionPerformed
        /*Aqui é onde faremos a inserção dos produtos que terão seus estoques atualizados. */
            DefaultTableModel modelo = (DefaultTableModel) tabela_saidaest.getModel();          
            modelo.addRow(new Object[]{codigo_produto.getText(),produto_descricao.getText(), txt_estoque.getText(), qtd_estoqentrada.getText()});   
        
 
    }//GEN-LAST:event_botao_addActionPerformed

    private void botao_rmvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_rmvActionPerformed
         // irei excluir apenas a linha selecionada, nao irá acrescentar nada quando for adicionado, somente quando a entrada de estoque for confirmada   
        if(botao_rmv.isEnabled()){
            DefaultTableModel modelo = (DefaultTableModel) tabela_saidaest.getModel();
            modelo.removeRow(tabela_saidaest.getSelectedRow());
            tabela_saidaest.setModel(modelo);
         }
    }//GEN-LAST:event_botao_rmvActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      String message = "Deseja confirmar a saída de estoque?";
        String title = "Confirmação";
        
        //inserindo minhas informações no banco de dados referente as informações do fornecedor, vendedor, data e id da entrada
        int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
          if (reply == JOptionPane.YES_OPTION)
          {
               try {
               String identest, data_entrada, idvend, vendedor, idforn, fornecedor, obs;
               identest = txt_consulteid.getText();
               data_entrada = data_venda.getText();
               idforn = txt_pesq_cod.getText();
               fornecedor = txt_desc_forn.getText();
               idvend = txt_vendedor.getText();
               vendedor = txt_descvend.getText();
               obs = justificativa.getText();
               
               String situation = "NÃO"; //isso é quando eu realizo a confirmação da entrada de estoque, dessa forma, no meu banco de dados irá constar que ela não é um estoque cancelado
               SQLConection conection = new SQLConection();
               String sql = "INSERT INTO SAIDA_EST(id, datasaida, id_fornecedor, fornecedor, id_vend, name_vend,"
                       + " justificativa, cancelada, datahora) VALUES ('"+identest+"', '"+data_entrada+"', '"+idforn+"',"
                       + "'"+fornecedor+"','"+idvend+"','"+vendedor+"', '"+obs+"', '"+situation+"',  CURRENT_TIMESTAMP)";               
               conection.SqlExecution(sql);               
                this.dispose();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro na execução do SQL");
                JOptionPane.showMessageDialog(null, "NÃO FOI POSSÍVEL ESTABELECER CONEXÃO COM O BANCO DE DADOS");
            }
            for(int row = 0; row < tabela_saidaest.getRowCount(); row++) {
                int idEstoque = Integer.parseInt(txt_consulteid.getText());
                int codprod = Integer.parseInt(tabela_saidaest.getValueAt(row,0).toString());
                String descprod = (tabela_saidaest.getValueAt(row, 1).toString());
                int saldoant = Integer.parseInt(tabela_saidaest.getValueAt(row,2).toString());
                int qtdprod = Integer.parseInt(tabela_saidaest.getValueAt(row, 3).toString());
                SQLConection conection = new SQLConection();
                String sql = "INSERT INTO SAIDA_PRODS(idsaidaprods, id_saida, codprod, descprod, saldoanterior, qtdprod, datahora) VALUES (NULL, '"+idEstoque+"','"+codprod+"', '"+descprod+"', '"+saldoant+"', '"+qtdprod+"', CURRENT_TIMESTAMP)";     
                try {
                      conection.SqlExecution(sql);  
                } catch (SQLException ex) {
                      Logger.getLogger(Pedidos.class.getName()).log(Level.SEVERE, null, ex);
    }
}
              JOptionPane.showMessageDialog(null, "SAÍDA DE ESTOQUE REALIZADA COM SUCESSO");
   
             //atualizando - update no estoque
            SQLConection conection = new SQLConection();
            int qtdest = 0; //inicializando minha variavel qtdest
           
            try {
               //estornando meus produtos 
               for(int row = 0; row < tabela_saidaest.getRowCount(); row++) {
                   int codprod = Integer.parseInt(tabela_saidaest.getValueAt(row, 0).toString());
                   int qtdpro = Integer.parseInt(tabela_saidaest.getValueAt(row,3).toString());
                   
                   //recuperando minha quantidade atual no estoque e somando com o que foi vendido e posteriormente cancelado
                   Connection con = SQLConection.getConnection();
                   String sql2 = "SELECT qtd_estoque FROM PRODUTOS WHERE CODIGO LIKE '"+codprod+"'";
                   PreparedStatement stmt = con.prepareStatement(sql2);
                   ResultSet rs = stmt.executeQuery();
                   
                   if(rs.next()) {
                       qtdest = rs.getInt("qtd_estoque"); //armazenei a quantidade que tem no meu estoque na minha variavel qtdest
                     
                   }
                   qtdest -= qtdpro; //pegando meu estoque e somando com a quantidade vendida da venda, ou seja, estornando o que foi vendido de volta para o meu estoque
                   String sqlupdate = "UPDATE PRODUTOS SET QTD_ESTOQUE = '"+qtdest+"' WHERE CODIGO = '"+codprod+"'"; //fazendo o update da minha tabela, ou seja, retornando meus produtos vendidos e atualizando meu estoque
                   conection.SqlExecution(sqlupdate);
               }  
    
           } catch (SQLException ex) {
            Logger.getLogger(Pedidos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao fazer requisição");
        }
              
                           }
          
         try {
                new SaidaEstoque().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(EntradaEstoque.class.getName()).log(Level.SEVERE, null, ex);
            }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // retirando o que foi dado de saidade de estoque e atualizando a situação da tabela para cancelada
        String message = "Deseja cancelar a requisição?";
       String title = "Confirmação";
       String txtent = txt_consulteid.getText();
       int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
          if (reply == JOptionPane.YES_OPTION)
          {
               
           try {
               String situation = "SIM";
               String sqlcan = "UPDATE SAIDA_EST SET CANCELADA = '"+situation+"' WHERE id = '"+txtent+"';";
               SQLConection conection = new SQLConection();
               int qtdest = 0; //inicializando minha variavel qtdest
               
               try {
                   conection.SqlExecution(sqlcan);
                   JOptionPane.showMessageDialog(null, "SAIDA DE ESTOQUE CANCELADA");
                   //estornando meus produtos
                   for(int row = 0; row < tabela_saidaest.getRowCount(); row++) {
                       int codprod = Integer.parseInt(tabela_saidaest.getValueAt(row, 0).toString());
                       int qtdpro = Integer.parseInt(tabela_saidaest.getValueAt(row,3).toString());
                       
                       //recuperando minha quantidade atual no estoque e somando com o que foi vendido e posteriormente cancelado
                       Connection con = SQLConection.getConnection();
                       String sql2 = "SELECT qtd_estoque FROM PRODUTOS WHERE CODIGO LIKE '"+codprod+"'";
                       PreparedStatement stmt = con.prepareStatement(sql2);
                       ResultSet rs = stmt.executeQuery();
                       
                       if(rs.next()) {
                           qtdest = rs.getInt("qtd_estoque"); //armazenei a quantidade que tem no meu estoque na minha variavel qtdest
                       }
                       qtdest += qtdpro; //pegando meu estoque e somando com a quantidade que foi retirada da saida de estoque, ou seja, estornando o que foi vendido de volta para o meu estoque
                       String sqlupdate = "UPDATE PRODUTOS SET QTD_ESTOQUE = '"+qtdest+"' WHERE CODIGO = '"+codprod+"'"; //fazendo o update da minha tabela, ou seja, retornando meus produtos vendidos e atualizando meu estoque
                       conection.SqlExecution(sqlupdate);
                   }
                   
                   
                   JOptionPane.showMessageDialog(null, "Estoque foi atualizado");
                   
                   
               } catch (SQLException ex) {
                   Logger.getLogger(Pedidos.class.getName()).log(Level.SEVERE, null, ex);
                   JOptionPane.showMessageDialog(null, "Ocorreu um erro.", "Erro", JOptionPane.ERROR_MESSAGE);
                   JOptionPane.showMessageDialog(null, "Erro ao fazer o cancelamento");
                   
               }
               new SaidaEstoque().setVisible(true);
               
           } catch (SQLException ex) {
            Logger.getLogger(SaidaEstoque.class.getName()).log(Level.SEVERE, null, ex);
            
        }
              
          }    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {                                         
            // facilitando para o cliente poder limpar os campos
            data_venda.setText(null);
            txt_pesq_cod.setText(null);
            txt_desc_forn.setText(null);
            txt_vendedor.setText(null);
            txt_descvend.setText(null);
            txt_prod.setText(null);
            txt_descprod.setText(null);
            justificativa.setText(null);
            sit.setText(null);
            DefaultTableModel model = (DefaultTableModel) tabela_saidaest.getModel();
            model.setRowCount(0); // limpa a tabela
            
            try {
                mfdata = new MaskFormatter("##/##/####");
                
            } catch (ParseException ex) {
                System.out.println("Insira uma data válida!");
            }
            
            data_venda.setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date(System.currentTimeMillis())));
            SQLConection conection = new SQLConection();
            String sql = "SELECT MAX(ID) AS MAX_IDSAIDAEST FROM SAIDA_EST"; //estou obtendo o ultimo valor da coluna "idvenda" da minha tablea "vendas" e irei incrementá-lo posteriormente em +1
            Connection con = SQLConection.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                int maxIdVenda = rs.getInt("MAX_IDSAIDAEST");
                int proxIdVenda = maxIdVenda + 1;
                txt_consulteid.setText(Integer.toString(proxIdVenda));
            }   
        } catch (SQLException ex) {
            Logger.getLogger(EntradaEstoque.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
                data_venda.setEnabled(true);
                txt_pesq_cod.setEnabled(true);
                txt_desc_forn.setEnabled(true);
                txt_vendedor.setEnabled(true);
                txt_descvend.setEnabled(true);
                txt_prod.setEnabled(true);
                txt_descprod.setEnabled(true);
                tabela_saidaest.setEnabled(true);
                justificativa.setEnabled(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void data_vendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_vendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_data_vendaActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoFiltrar;
    private javax.swing.JButton BotaoFiltrar1;
    private javax.swing.JButton botao_add;
    private javax.swing.JButton botao_consulte;
    private javax.swing.JButton botao_consulte1;
    private javax.swing.JButton botao_rmv;
    private javax.swing.JTextField codigo_produto;
    private javax.swing.JTextField data_venda;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField justificativa;
    private javax.swing.JTextField produto_descricao;
    private javax.swing.JTextField qtd_estoqentrada;
    private javax.swing.JTextField sit;
    private javax.swing.JTable tabela_saidaest;
    private javax.swing.JTextField txt_consulteid;
    private javax.swing.JTextField txt_desc_forn;
    private javax.swing.JTextField txt_descprod;
    private javax.swing.JTextField txt_descvend;
    private javax.swing.JTextField txt_estoque;
    private javax.swing.JTextField txt_pesq_cod;
    private javax.swing.JTextField txt_prod;
    private javax.swing.JTextField txt_vendedor;
    // End of variables declaration//GEN-END:variables
}
