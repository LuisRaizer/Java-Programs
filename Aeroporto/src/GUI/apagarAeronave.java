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

public class apagarAeronave extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNum;

	private String numDeSerie;
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
	public apagarAeronave() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 351, 205);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNum = new JTextField();
		txtNum.setColumns(10);
		txtNum.setBounds(35, 64, 280, 20);
		contentPane.add(txtNum);
		
		JButton btnNewButton = new JButton("Apagar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numDeSerie = txtNum.getText();
				
				Aeronave cadastro = new Aeronave();
				cadastro.apagarAero(numDeSerie);
				cadastro.apagarDados();
				
				menuUI menu = new menuUI(); 
				menu.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(220, 109, 95, 30);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Digite qual numero de serie deseja apagar:");
		lblNewLabel_2.setBounds(35, 33, 294, 20);
		contentPane.add(lblNewLabel_2);
	}
}
