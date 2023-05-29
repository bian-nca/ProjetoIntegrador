package Reports;

import DAO.SQLConection;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.mycompany.siscons.View.Relatorios;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Alvaro
 */
public class RelatorioCotacao {
    
    public void criarRelatorioCotacao(int idCotacaoAtual) throws SQLException
    {
        gerarRelatorioCotacao(idCotacaoAtual);
    }
    
    private void gerarRelatorioCotacao(int idCotacaoAtual) throws SQLException {
        Document documento = new Document();
        try{
            PdfWriter.getInstance(documento, new FileOutputStream("D:\\Relatorio_COTACAO.pdf"));
            documento.open();
            documento.setPageSize(PageSize.A4);

            documento.add(new Paragraph("SYSCONS - COTAÇÃO DE VENDA"));
            documento.add(new Paragraph(" "));
            documento.add(new Paragraph(" "));
            
            String cliente, data, endereco, desconto, vlr_total, valor_wth_desc;
            String sql2 = "SELECT nome_cli, datavenda, rua, numero, cidade, desconto, vlr_total, valor_wth_desc FROM cotacao WHERE idcotacao LIKE '"+idCotacaoAtual+"'";
            Connection con = SQLConection.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql2);
            ResultSet rs = stmt.executeQuery(sql2);
            rs.next();
            cliente = rs.getString("nome_cli");
            data = rs.getString("datavenda");
            endereco = rs.getString("rua")+", "+rs.getString("numero")+" - "+rs.getString("cidade");
            desconto = rs.getString("desconto");
            vlr_total = rs.getString("vlr_total");
            valor_wth_desc = rs.getString("valor_wth_desc");
            
            documento.add(new Paragraph("Cliente: "+cliente));
            documento.add(new Paragraph("Endereço: "+endereco));
            documento.add(new Paragraph("Data da Cotação: "+data));

            documento.add(createTablePF(idCotacaoAtual));
            
            documento.add(new Paragraph("Valor Total: "+vlr_total));
            documento.add(new Paragraph("Desconto: "+desconto));
            documento.add(new Paragraph("Valor com Desconto: "+valor_wth_desc));

            JOptionPane.showMessageDialog(null, "Relatório Criado em D://");
        }catch(DocumentException | IOException de){}
        finally{
            documento.close();
        }
    }
    
        private static PdfPTable createTablePF(int idCotacaoAtual){
            //CRIAR A TABELA DE ITENS DA COTAÇÃO PRA PUXAR AQUI:
            
            PdfPTable table = new PdfPTable(4);
            try {
                String item, quantidade, valorUnit, valorTotal;                
                PdfPCell c1 = new PdfPCell(new Phrase("Item"));
                c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(c1);
                c1 = new PdfPCell(new Phrase("Quantidade"));
                c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(c1);
                c1 = new PdfPCell(new Phrase("Valor Unit."));
                c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(c1);
                c1 = new PdfPCell(new Phrase("Valor total"));
                c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(c1);
                table.setHeaderRows(1);

                int count = 1;
                String sql = "SELECT descproduto, qtdproduto, valorunit, valortotal FROM itens_cotacao WHERE idcotacao LIKE '"+idCotacaoAtual+"'";
                Connection con = SQLConection.getConnection();
                PreparedStatement stmt = con.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery(sql);
                while(rs.next()){
                    item = rs.getString("descproduto");
                    quantidade = rs.getString("qtdproduto");
                    valorUnit =rs.getString("valorunit");
                    valorTotal =rs.getString("valortotal");
                    table.addCell(item);
                    table.addCell(quantidade);
                    table.addCell(valorUnit);
                    table.addCell(valorTotal);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao criar a tabela do relatório");
            }
            return table;
        }
}
