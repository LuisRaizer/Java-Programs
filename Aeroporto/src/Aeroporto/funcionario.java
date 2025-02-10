package Aeroporto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class funcionario {
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

	public void cadastrarfunc(String cpf, String nomeCompleto, String email, String numero, String profissao,
			String instituicaoDeEnsino, String anoComecoAnotermino, String numRegistro, String curso, int salario) {
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
	public void apagarfunc(String cpf) {
		this.cpf = cpf;
	}

	public void inserirDados() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //verifica se está funcionando
			Connection con;
			Statement st;
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aeroportodb", "root", "aluno");
			st = con.createStatement();
			st.executeUpdate("INSERT INTO funcionario VALUES('" + cpf + "', '" + nomeCompleto + "', '" + email + "', '"
					+ numero + "', '" + profissao + "', '" + instituicaoDeEnsino + "'," + " '" + anoComecoAnotermino
					+ "', '" + numRegistro + "', '" + curso + "', " + salario + ");");
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
            st.executeUpdate("DELETE FROM funcionario WHERE cpf = '" + cpf + "';");
            JOptionPane.showMessageDialog(null, "Dados apagados com sucesso!");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "O Driver não está na biblioteca");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro nas operações no BD");
        }
    }

}
