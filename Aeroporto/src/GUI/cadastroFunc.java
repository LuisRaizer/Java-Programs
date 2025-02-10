package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Aeroporto.Administrador;
import Aeroporto.funcionario;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;

public class cadastroFunc extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNomeCompleto;
	private JTextField txtCpf;
	private JTextField txtEmail;
	private JTextField txtNmeroParaContato;
	private JTextField txtProfisso;
	private JTextField txtInstituioDeEnsino;
	private JTextField txtAnoDeComeo;
	private JTextField txtCurso;
	private JTextField txtNmeroDeRegistro;
	private JTextField txtsalario;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JCheckBox Checkbox;

	private String cpf;
	private String nomeCompleto;
	private String email;
	private String numero;
	private String profissao;
	private String instituicaoDeEnsino;
	private String anoComecoAnotermino;
	private String curso;
	private String numRegistro;
	private int salario;
	protected boolean ADM;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cadastroFunc frame = new cadastroFunc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public cadastroFunc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 419);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtNomeCompleto = new JTextField();
		txtNomeCompleto.setBounds(25, 32, 559, 20);
		contentPane.add(txtNomeCompleto);
		txtNomeCompleto.setColumns(10);

		txtCpf = new JTextField();
		txtCpf.setColumns(10);
		txtCpf.setBounds(25, 80, 280, 20);
		contentPane.add(txtCpf);

		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(25, 127, 280, 20);
		contentPane.add(txtEmail);

		txtNmeroParaContato = new JTextField();
		txtNmeroParaContato.setColumns(10);
		txtNmeroParaContato.setBounds(315, 80, 269, 20);
		contentPane.add(txtNmeroParaContato);

		txtProfisso = new JTextField();
		txtProfisso.setColumns(10);
		txtProfisso.setBounds(25, 209, 559, 20);
		contentPane.add(txtProfisso);

		txtInstituioDeEnsino = new JTextField();
		txtInstituioDeEnsino.setColumns(10);
		txtInstituioDeEnsino.setBounds(25, 251, 280, 20);
		contentPane.add(txtInstituioDeEnsino);

		txtAnoDeComeo = new JTextField();
		txtAnoDeComeo.setColumns(10);
		txtAnoDeComeo.setBounds(315, 251, 269, 20);
		contentPane.add(txtAnoDeComeo);

		txtCurso = new JTextField();
		txtCurso.setColumns(10);
		txtCurso.setBounds(25, 294, 280, 20);
		contentPane.add(txtCurso);

		txtNmeroDeRegistro = new JTextField();
		txtNmeroDeRegistro.setColumns(10);
		txtNmeroDeRegistro.setBounds(315, 294, 269, 20);
		contentPane.add(txtNmeroDeRegistro);

		txtsalario = new JTextField();
		txtsalario.setColumns(10);
		txtsalario.setBounds(315, 127, 269, 20);
		contentPane.add(txtsalario);

		Checkbox = new JCheckBox("E administrador?");
		Checkbox.setBounds(266, 328, 123, 23);
		contentPane.add(Checkbox);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cpf = txtCpf.getText();
				nomeCompleto = txtNomeCompleto.getText();
				email = txtEmail.getText();
				numero = txtNmeroParaContato.getText();
				profissao = txtProfisso.getText();
				instituicaoDeEnsino = txtInstituioDeEnsino.getText();
				anoComecoAnotermino = txtAnoDeComeo.getText();
				curso = txtCurso.getText();
				numRegistro = txtNmeroDeRegistro.getText();
				salario = Integer.parseInt(txtsalario.getText());

				if (Checkbox.isSelected()) {
					JOptionPane.showMessageDialog(null, "O funcionário é um administrador.");

					ADM = true;
					Administrador adm = new Administrador();
					adm.cadastrarADM(cpf, nomeCompleto, email, numero, profissao, instituicaoDeEnsino,
							anoComecoAnotermino, numRegistro, curso, salario, ADM);
					adm.inserirDados();
				} else {
					JOptionPane.showMessageDialog(null, "O funcionário não é um administrador.");

					funcionario func = new funcionario();
					func.cadastrarfunc(cpf, nomeCompleto, email, numero, profissao, instituicaoDeEnsino,
							anoComecoAnotermino, numRegistro, curso, salario);
					func.inserirDados();
				}

				menuUI menu = new menuUI();
				menu.setADM(ADM);
				menu.setVisible(true);
				dispose();
			}
		});
		btnCadastrar.setBounds(491, 325, 95, 29);
		contentPane.add(btnCadastrar);

		lblNewLabel = new JLabel("Nome completo:");
		lblNewLabel.setBounds(24, 11, 198, 29);
		contentPane.add(lblNewLabel);

		lblNewLabel_1 = new JLabel("CPF:");
		lblNewLabel_1.setBounds(25, 63, 118, 20);
		contentPane.add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("Numero para contato:");
		lblNewLabel_2.setBounds(315, 66, 198, 14);
		contentPane.add(lblNewLabel_2);

		lblNewLabel_3 = new JLabel("E-mail:");
		lblNewLabel_3.setBounds(25, 111, 166, 14);
		contentPane.add(lblNewLabel_3);

		lblNewLabel_4 = new JLabel("Salario:");
		lblNewLabel_4.setBounds(315, 111, 221, 14);
		contentPane.add(lblNewLabel_4);

		lblNewLabel_5 = new JLabel("Cargo:");
		lblNewLabel_5.setBounds(25, 195, 102, 14);
		contentPane.add(lblNewLabel_5);

		lblNewLabel_6 = new JLabel("Instituicao de ensino:");
		lblNewLabel_6.setBounds(25, 238, 221, 14);
		contentPane.add(lblNewLabel_6);

		lblNewLabel_7 = new JLabel("Ano de comeco e termino do curso:");
		lblNewLabel_7.setBounds(315, 238, 272, 14);
		contentPane.add(lblNewLabel_7);

		lblNewLabel_8 = new JLabel("Curso:");
		lblNewLabel_8.setBounds(25, 281, 150, 14);
		contentPane.add(lblNewLabel_8);

		lblNewLabel_9 = new JLabel("numero de registro academico:");
		lblNewLabel_9.setBounds(315, 281, 237, 14);
		contentPane.add(lblNewLabel_9);

		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnFechar.setBounds(25, 325, 102, 29);
		contentPane.add(btnFechar);
	}
}
