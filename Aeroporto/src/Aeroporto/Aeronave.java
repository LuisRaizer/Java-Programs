package Aeroporto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Aeronave {

	private String numDeSerie;
	private String fabricante;
	private String modelo;
	private int capacidade;
	private int anoUltimaVistoria;
	private int anoFabricacao;

	public void cadastrarAero(String numDeSerie, String fabricante, String modelo, int capacidade,
			int anoUltimaVistoria, int anoFabricacao) {
		this.numDeSerie = numDeSerie;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.capacidade = capacidade;
		this.anoUltimaVistoria = anoUltimaVistoria;
		this.anoFabricacao = anoFabricacao;
	}

	public void apagarAero(String numDeSerie) {
		this.numDeSerie = numDeSerie;
	}

	public void inserirDados() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con;
			Statement st;
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aeroportodb", "root", "aluno");
			st = con.createStatement();
			st.executeUpdate("INSERT INTO aeronave VALUES('" + numDeSerie + "', '" + fabricante + "', '" + modelo
					+ "', " + capacidade + ", " + anoUltimaVistoria + ", " + anoFabricacao + ");");
			JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");

		} catch (ClassNotFoundException ex) {
			JOptionPane.showMessageDialog(null, "O Driver nao esta na biblioteca");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Erro nas operacoes no BD");
		}
	}

	public void apagarDados() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aeroportodb", "root", "aluno");
			Statement st = con.createStatement();
			st.executeUpdate("DELETE FROM aeronave WHERE numDeSerie = '" + numDeSerie + "';");
			JOptionPane.showMessageDialog(null, "Dados apagados com sucesso!");
		} catch (ClassNotFoundException ex) {
			JOptionPane.showMessageDialog(null, "O Driver não está na biblioteca");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Erro nas operações no BD");
		}
	}
}
