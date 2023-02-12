package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*

Essa Classe é responsável pela conexão com o Banco de Dados. Antes de me bater, 
só copiei o que você tinha feito e organizei aqui pra facilitar.. =)

Pra fazer uma conexão e passar uma SQL pro Banco, só usar o método:

        SqlExecution(STRING_SQL);

\o/

*/

public class SQLConection 
{
    private static final String URL = "jdbc:mysql://localhost:3306/siscons";
    private static final String USER = "root";
    private static final String PASS = "1234";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "FALHA NA CONEXÃO!");
            throw new RuntimeException("Erro na conexão com o Banco de Dados: " + e);
        }
    }

    public static void closeConnection(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO AO FECHAR CONEXÃO COM B.D.");
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt) {
        closeConnection(con);
        try {
            if (stmt != null) {
                stmt.close();
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO AO FECHAR CONEXÃO COM B.D.");
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {
        closeConnection(con, stmt);
        try {
            if (rs != null) {
                rs.close();
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO AO FECHAR CONEXÃO COM B.D.");
        }
    }
    
    public void SqlExecution(String sqlSentence) throws SQLException
    {
        Connection connection = getConnection();
        // Execute the insert statement
	try {
            Statement stmt = (Statement) connection.createStatement();
            stmt.executeUpdate(sqlSentence);
	} catch (SQLException e) {
	    JOptionPane.showMessageDialog(null, "Erro de execução SQL");
	}
        closeConnection(connection);
    }
}
