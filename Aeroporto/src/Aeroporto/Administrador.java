
package Aeroporto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Administrador {
	private String cpf;
	private String nomeCompleto;
	private String email;
	private String numero;
	private String profissao;
	private String instituicaoDeEnsino;
	private String anoComecoAnotermino;
	private String numRegistro;
	private String curso;
	private int salario;

	public void cadastrarADM(String cpf, String nomeCompleto, String email, String numero, String profissao,
			String instituicaoDeEnsino, String anoComecoAnotermino, String numRegistro, String curso, int salario,
			boolean ADM) {
		this.cpf = cpf;
		this.nomeCompleto = nomeCompleto;
		this.email = email;
		this.numero = numero;
		this.profissao = profissao;
		this.instituicaoDeEnsino = instituicaoDeEnsino;
		this.anoComecoAnotermino = anoComecoAnotermino;
		this.numRegistro = numRegistro;
		this.curso = curso;
		this.salario = salario;
	}

	public void inserirDados() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con;
			Statement st;
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aeroportodb", "root", "aluno");
			st = con.createStatement();
			st.executeUpdate("INSERT INTO administrador VALUES('" + cpf + "', '" + nomeCompleto + "', '" + email
					+ "', '" + numero + "', '" + profissao + "', '" + instituicaoDeEnsino + "'," + " '"
					+ anoComecoAnotermino + "', '" + numRegistro + "', '" + curso + "', " + salario + ");");
			JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");

		} catch (ClassNotFoundException ex) {
			JOptionPane.showMessageDialog(null, "O Driver nao esta na biblioteca");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Erro nas operacoes no BD");
		}

	}

}
