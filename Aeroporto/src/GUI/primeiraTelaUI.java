package GUI;

import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class primeiraTelaUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField login;
	private JTextField senha;

	public boolean checkPassword(String login, String senha) { //boleano é true or false
		return login.equals("st3") && senha.equals("123");
	}

	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					primeiraTelaUI frame = new primeiraTelaUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public primeiraTelaUI() {
		setTitle("Login\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 236, 299);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.window);
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		login = new JTextField();
		login.setBounds(10, 55, 200, 26);
		contentPane.add(login);
		login.setColumns(10);

		JLabel lblNewLabel = new JLabel("Login:");
		lblNewLabel.setLabelFor(login);
		lblNewLabel.setBounds(10, 34, 74, 26);
		contentPane.add(lblNewLabel);

		senha = new JPasswordField();
		senha.setBounds(10, 133, 197, 26);
		contentPane.add(senha);

		JLabel lblNewLabel_1 = new JLabel("Senha:");
		lblNewLabel_1.setBounds(10, 112, 74, 26);
		contentPane.add(lblNewLabel_1);

		JButton btnNewButton_1 = new JButton("Enviar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkPassword(login.getText(), senha.getText())) {
					JOptionPane.showMessageDialog(null, "Bem Vindo, Administrador!");
					
					menuUI menu = new menuUI();
					menu.setADM(true);
					menu.setVisible(true);
					dispose();//fecha tela
				} else {
					JOptionPane.showMessageDialog(null, "Administrador nao cadastrado!");
				}
			}
		});

		btnNewButton_1.setBounds(126, 211, 84, 26);
		contentPane.add(btnNewButton_1);

	}
}
