package view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.ListaController;

public class Editar {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextArea textArea;
	private JButton btnNewButton;
	ListaController lista = new ListaController();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Editar window = new Editar();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Editar() {
		initialize();
		lista.imprimirDados(textArea);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 605, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Arial", Font.PLAIN, 16));
		textArea.setBounds(15, 16, 378, 212);
		frame.getContentPane().add(textArea);
		
		textField = new JTextField();
		textField.setBounds(512, 13, 56, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblIndice = new JLabel("Indice");
		lblIndice.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIndice.setHorizontalAlignment(SwingConstants.CENTER);
		lblIndice.setBounds(440, 10, 69, 31);
		frame.getContentPane().add(lblIndice);
		
		JLabel lblAterarNome = new JLabel("Aterar nome");
		lblAterarNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblAterarNome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAterarNome.setBounds(408, 46, 160, 31);
		frame.getContentPane().add(lblAterarNome);
		
		JLabel lblAterarIdade = new JLabel("Aterar idade");
		lblAterarIdade.setHorizontalAlignment(SwingConstants.CENTER);
		lblAterarIdade.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAterarIdade.setBounds(408, 113, 160, 31);
		frame.getContentPane().add(lblAterarIdade);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(408, 83, 160, 26);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(408, 151, 160, 26);
		frame.getContentPane().add(textField_2);
		
		btnNewButton = new JButton("Salvar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.setBounds(418, 193, 138, 35);
		frame.getContentPane().add(btnNewButton);
	}
	protected JTextArea getTextArea() {
		return textArea;
	}
	protected JTextField getTextField() {
		return textField;
	}
	protected JTextField getTextField_1() {
		return textField_1;
	}
	protected JTextField getTextField_2() {
		return textField_2;
	}
	protected JButton getBtnNewButton() {
		return btnNewButton;
	}
}
