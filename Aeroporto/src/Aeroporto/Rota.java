package Aeroporto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Rota {
    private String codigoVoo;
    private String origem;
    private String destino;
    private String companhiaAerea;
    private int distanciaEmKm;

    public void cadastrarRota(String codigoVoo, String origem, String destino, String companhiaAerea, int distanciaEmKm) {
        this.codigoVoo = codigoVoo;
        this.origem = origem;
        this.destino = destino;
        this.companhiaAerea = companhiaAerea;
        this.distanciaEmKm = distanciaEmKm;
    }
    
    public void apagarRota(String codigoVoo) {
        this.codigoVoo = codigoVoo;
    }

    public void inserirDados() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aeroportodb", "root", "aluno");
            Statement st = con.createStatement();
            st.executeUpdate("INSERT INTO rota VALUES('" + codigoVoo + "', '" + origem + "', '" + destino + "', '"
                    + companhiaAerea + "', " + distanciaEmKm + ");");
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "O Driver não está na biblioteca");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro nas operações no BD");
        }
    }

    public void apagarDados() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aeroportodb", "root", "aluno");
            Statement st = con.createStatement();
            st.executeUpdate("DELETE FROM rota WHERE codigoVoo = '" + codigoVoo + "';");
            JOptionPane.showMessageDialog(null, "Dados apagados com sucesso!");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "O Driver não está na biblioteca");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro nas operações no BD");
        }
    }
}
