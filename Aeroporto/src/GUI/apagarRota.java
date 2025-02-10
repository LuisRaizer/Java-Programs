package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Aeroporto.Rota;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class apagarRota extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCodigo;
	private JLabel lblNewLabel;

	private String codigoVoo;

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
	public apagarRota() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 358, 233);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtCodigo = new JTextField();
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(35, 51, 280, 20);
		contentPane.add(txtCodigo);

		JButton btnNewButton = new JButton("Apagar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String codigoVoo = txtCodigo.getText();

				Rota rota = new Rota();
				rota.apagarRota(codigoVoo);
				rota.apagarDados();

				menuUI menu = new menuUI();
				menu.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(224, 155, 95, 30);
		contentPane.add(btnNewButton);

		lblNewLabel = new JLabel("Digite o codigo de voo que voce deseja apagar");
		lblNewLabel.setBounds(35, 35, 280, 14);
		contentPane.add(lblNewLabel);

		btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnFechar.setBounds(35, 155, 95, 30);
		contentPane.add(btnFechar);
	}
}
