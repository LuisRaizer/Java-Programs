package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Aeroporto.Aeronave;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class cadastroAeronave extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtModelo;
	private JTextField txtFabricante;
	private JTextField txtNmeroDeSrie;
	private JTextField txtCapacidadeDePassageiros;
	private JTextField txtltimaVistoria;
	private JTextField txtAnoDeFabricao;

	private String numDeSerie;
	private String fabricante;
	private String modelo;
	private int capacidade;
	private int anoUltimaVistoria;
	private int anoFabricacao;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cadastroAeronave frame = new cadastroAeronave();
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
	public cadastroAeronave() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 644, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtModelo = new JTextField();
		txtModelo.setColumns(10);
		txtModelo.setBounds(35, 31, 570, 20);
		contentPane.add(txtModelo);
		
		txtFabricante = new JTextField();
		txtFabricante.setColumns(10);
		txtFabricante.setBounds(35, 81, 570, 20);
		contentPane.add(txtFabricante);
		
		txtNmeroDeSrie = new JTextField();
		txtNmeroDeSrie.setColumns(10);
		txtNmeroDeSrie.setBounds(35, 134, 280, 20);
		contentPane.add(txtNmeroDeSrie);
		
		txtCapacidadeDePassageiros = new JTextField();
		txtCapacidadeDePassageiros.setColumns(10);
		txtCapacidadeDePassageiros.setBounds(325, 134, 280, 20);
		contentPane.add(txtCapacidadeDePassageiros);
		
		txtltimaVistoria = new JTextField();
		txtltimaVistoria.setColumns(10);
		txtltimaVistoria.setBounds(325, 194, 280, 20);
		contentPane.add(txtltimaVistoria);
		
		txtAnoDeFabricao = new JTextField();
		txtAnoDeFabricao.setColumns(10);
		txtAnoDeFabricao.setBounds(35, 194, 280, 20);
		contentPane.add(txtAnoDeFabricao);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				numDeSerie = txtNmeroDeSrie.getText();
				fabricante = txtFabricante.getText();
				modelo = txtModelo.getText();
				capacidade = Integer.parseInt(txtCapacidadeDePassageiros.getText());
				anoUltimaVistoria = Integer.parseInt(txtltimaVistoria.getText());
				anoFabricacao = Integer.parseInt(txtAnoDeFabricao.getText());
				
				Aeronave cadastro = new Aeronave();
				cadastro.cadastrarAero(numDeSerie, fabricante, modelo, capacidade, anoUltimaVistoria, anoFabricacao);
				cadastro.inserirDados();
				
				menuUI menu = new menuUI(); 
				menu.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(510, 234, 95, 30);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Modelo:");
		lblNewLabel.setBounds(35, 11, 189, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Fabricante:");
		lblNewLabel_1.setBounds(34, 62, 217, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Numero de serie:");
		lblNewLabel_2.setBounds(35, 115, 171, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Capacidade de Passageiros:");
		lblNewLabel_3.setBounds(325, 115, 268, 20);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Ano de fabricacao:");
		lblNewLabel_4.setBounds(35, 177, 195, 20);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Ano da ultima vistoria:");
		lblNewLabel_5.setBounds(325, 180, 217, 17);
		contentPane.add(lblNewLabel_5);
		
	}
}
