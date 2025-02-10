package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Aeroporto.funcionario;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class apagarFunc extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtcpf;
	private JLabel lblNewLabel;

	private String cpf;

	private JButton btnFechar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cadastroRota frame = new cadastroRota();
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
	public apagarFunc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 256, 247);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtcpf = new JTextField();
		txtcpf.setColumns(10);
		txtcpf.setBounds(35, 41, 167, 20);
		contentPane.add(txtcpf);

		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				cpf = txtcpf.getText();

				funcionario func = new funcionario();
				func.apagarfunc(cpf);
				func.apagarDados();

				menuUI menu = new menuUI();
				menu.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(138, 161, 95, 30);
		contentPane.add(btnNewButton);

		lblNewLabel = new JLabel("Digite o cpf que deseja apagar:");
		lblNewLabel.setBounds(35, 26, 203, 14);
		contentPane.add(lblNewLabel);

		btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnFechar.setBounds(10, 161, 95, 30);
		contentPane.add(btnFechar);
	}
}
