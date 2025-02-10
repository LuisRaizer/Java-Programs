package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class menuUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private boolean ADM;
	private JButton btnApagarFuncionario;
	private JButton btnApagarAeronave;
	private JButton btnApagarRota;

	protected void setADM(boolean ADM) { //"bolean": true or false
		this.ADM = ADM;
		if (!ADM) { //"bolean" + valor ali = falso
			btnApagarFuncionario.setEnabled(false); //desabilita o botao
			btnApagarAeronave.setEnabled(false);
			btnApagarRota.setEnabled(false);
		}
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menuUI frame = new menuUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public menuUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("Cadastrar funcionario");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastroFunc cadastroFunc = new cadastroFunc();
				cadastroFunc.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(10, 11, 162, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Cadastar aeronave");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastroAeronave cadastroAeronave = new cadastroAeronave();
				cadastroAeronave.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(10, 45, 162, 23);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Cadastrar rota");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastroRota cadastroRota = new cadastroRota();
				cadastroRota.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(10, 79, 162, 23);
		contentPane.add(btnNewButton_2);

		btnNewButton = new JButton("Fechar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(351, 0, 83, 23);
		contentPane.add(btnNewButton);

		btnApagarFuncionario = new JButton("Apagar funcionario");
		btnApagarFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				apagarFunc func = new apagarFunc();
				func.setVisible(true);

			}
		});
		btnApagarFuncionario.setBounds(10, 114, 162, 23);
		contentPane.add(btnApagarFuncionario);

		btnApagarAeronave = new JButton("Apagar aeronave");
		btnApagarAeronave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				apagarAeronave apagar = new apagarAeronave();
				apagar.setVisible(true);
			}
		});
		btnApagarAeronave.setBounds(10, 148, 162, 23);
		contentPane.add(btnApagarAeronave);

		btnApagarRota = new JButton("Apagar rota");
		btnApagarRota.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				apagarRota apagar = new apagarRota();
				apagar.setVisible(true);
			}
		});
		btnApagarRota.setBounds(10, 182, 162, 23);
		contentPane.add(btnApagarRota);
	}
}
