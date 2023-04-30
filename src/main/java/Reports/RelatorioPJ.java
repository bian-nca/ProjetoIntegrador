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
public class RelatorioPJ {
    
    public void gerarRelatorioPJ(){
        gerarRelatorio();
    }
    private void gerarRelatorio() {
        Document documento = new Document();
    try{
        PdfWriter.getInstance(documento, new FileOutputStream("D:\\Relatorio_PJ_PDF.pdf"));
        documento.open();
        documento.setPageSize(PageSize.A4);
        
        documento.add(new Paragraph("SYSCONS - Relatório de Cadastros Pessoa Jurídica"));
        documento.add(new Paragraph(" "));
        documento.add(new Paragraph(" "));
        
        
        documento.add(createTablePF());
    
        JOptionPane.showMessageDialog(null, "Relatório Criado em D://");
    }catch(DocumentException | IOException de){
    }finally{
        documento.close();
    }
    }
    
        private static PdfPTable createTablePF(){
        PdfPTable table = new PdfPTable(3);
        try {
            String nome, cpf, telefone;
            PdfPCell c1 = new PdfPCell(new Phrase("Razão Social"));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(c1);
            c1 = new PdfPCell(new Phrase("CNPJ"));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(c1);
            c1 = new PdfPCell(new Phrase("Telefone"));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(c1);
            table.setHeaderRows(1);
            
            int count = 1;
            String sql = "SELECT * FROM pessoajuridica";
            Connection con = SQLConection.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                nome = rs.getString("razao");
                cpf = rs.getString("cnpj");
                telefone =rs.getString("telefone");
                table.addCell(nome);
                table.addCell(cpf);
                table.addCell(telefone);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Relatorios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return table;
    }
}
