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

public class cadastroRota extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCdigoDeVoo;
	private JTextField txtOrigem;
	private JTextField txtDestino;
	private JTextField txtCompanhiaArea;
	private JTextField txtDistnciaEmKilmetros;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;

	private String codigoDeVoo;
	private String origem;
	private String destino;
	private String companhiaAerea;
	private int distanciaEmKilometros;
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
	public cadastroRota() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 634, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtCdigoDeVoo = new JTextField();
		txtCdigoDeVoo.setColumns(10);
		txtCdigoDeVoo.setBounds(35, 127, 280, 20);
		contentPane.add(txtCdigoDeVoo);

		txtOrigem = new JTextField();
		txtOrigem.setColumns(10);
		txtOrigem.setBounds(35, 83, 280, 20);
		contentPane.add(txtOrigem);

		txtDestino = new JTextField();
		txtDestino.setColumns(10);
		txtDestino.setBounds(325, 83, 280, 20);
		contentPane.add(txtDestino);

		txtCompanhiaArea = new JTextField();
		txtCompanhiaArea.setColumns(10);
		txtCompanhiaArea.setBounds(35, 41, 570, 20);
		contentPane.add(txtCompanhiaArea);

		txtDistnciaEmKilmetros = new JTextField();
		txtDistnciaEmKilmetros.setColumns(10);
		txtDistnciaEmKilmetros.setBounds(325, 127, 280, 20);
		contentPane.add(txtDistnciaEmKilmetros);

		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codigoDeVoo = txtCdigoDeVoo.getText();
				origem = txtOrigem.getText();
				destino = txtDestino.getText();
				companhiaAerea = txtCompanhiaArea.getText();
				distanciaEmKilometros = Integer.parseInt(txtDistnciaEmKilmetros.getText());
				
				Rota rota = new Rota();
				rota.cadastrarRota(codigoDeVoo, origem, destino, companhiaAerea, distanciaEmKilometros);
				rota.inserirDados();
				
				menuUI menu = new menuUI();
				menu.setVisible(true);

			}
		});
		btnNewButton.setBounds(510, 200, 95, 30);
		contentPane.add(btnNewButton);

		lblNewLabel = new JLabel("Companhia aerea:");
		lblNewLabel.setBounds(35, 26, 171, 14);
		contentPane.add(lblNewLabel);

		lblNewLabel_1 = new JLabel("Origem:");
		lblNewLabel_1.setBounds(35, 69, 69, 14);
		contentPane.add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("Destino:");
		lblNewLabel_2.setBounds(325, 69, 111, 14);
		contentPane.add(lblNewLabel_2);

		lblNewLabel_3 = new JLabel("Codigo de voo:");
		lblNewLabel_3.setBounds(35, 114, 146, 14);
		contentPane.add(lblNewLabel_3);

		lblNewLabel_4 = new JLabel("Distancia em Kilometros:");
		lblNewLabel_4.setBounds(325, 114, 203, 14);
		contentPane.add(lblNewLabel_4);
		
		btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnFechar.setBounds(35, 204, 95, 30);
		contentPane.add(btnFechar);
	}
}
