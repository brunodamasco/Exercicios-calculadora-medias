package exercicios_aula;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;

public class Ex4_MediaEscolar {

	private JFrame frmEscolaPiratasDa;
	private JLabel lblNota;
	private JLabel lblNota_1;
	private JLabel lblNota_2;
	private JTextField txtNotaDigitada_1;
	private JTextField txtNotaDigitada_2;
	private JTextField txtNotaDigitada_3;
	private JTextField textField;
	
	private String c1 = "";
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex4_MediaEscolar window = new Ex4_MediaEscolar();
					window.frmEscolaPiratasDa.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ex4_MediaEscolar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEscolaPiratasDa = new JFrame();
		frmEscolaPiratasDa.addWindowListener(new WindowAdapter() {
			
		});
		frmEscolaPiratasDa.setResizable(false);
		frmEscolaPiratasDa.setTitle("Escola Piratas da Linguagem");
		frmEscolaPiratasDa.setBounds(100, 100, 456, 332);
		frmEscolaPiratasDa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEscolaPiratasDa.getContentPane().setLayout(null);
		
		lblNota = new JLabel("Nota 1");
		lblNota.setBounds(36, 94, 46, 14);
		frmEscolaPiratasDa.getContentPane().add(lblNota);
		
		lblNota_1 = new JLabel("Nota 2");
		lblNota_1.setBounds(36, 138, 46, 14);
		frmEscolaPiratasDa.getContentPane().add(lblNota_1);
		
		lblNota_2 = new JLabel("Nota 3");
		lblNota_2.setBounds(36, 180, 46, 14);
		frmEscolaPiratasDa.getContentPane().add(lblNota_2);
		
		txtNotaDigitada_1 = new JTextField();
		txtNotaDigitada_1.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() >= 48 && e.getKeyCode()  <= 57 || e.getKeyCode() == 10){
					c1 = c1 + e.getKeyChar();
					txtNotaDigitada_1.setText(c1);
				}
				else {
					JOptionPane.showMessageDialog(null, "Informe apenas números");
					txtNotaDigitada_1.setText(null);
				}
				if(e.getKeyCode() == 10){
					txtNotaDigitada_2.requestFocus();
					c1 = "";
				}
			}
		});
		txtNotaDigitada_1.setColumns(10);
		txtNotaDigitada_1.setBounds(109, 91, 106, 20);
		frmEscolaPiratasDa.getContentPane().add(txtNotaDigitada_1);
		
		txtNotaDigitada_2 = new JTextField();
		txtNotaDigitada_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() >= 48 && e.getKeyCode()  <= 57 || e.getKeyCode() == 10){
					c1 = c1 +e .getKeyChar();
					txtNotaDigitada_2.setText(c1);
				}
				else {
					JOptionPane.showMessageDialog(null, "Informe apenas números");
					txtNotaDigitada_2.setText(null);
				}
				if(e.getKeyCode() == 10){
					txtNotaDigitada_3.requestFocus();
					c1 = "";
				}
			}
		});
		txtNotaDigitada_2.setColumns(10);
		txtNotaDigitada_2.setBounds(109, 135, 106, 20);
		frmEscolaPiratasDa.getContentPane().add(txtNotaDigitada_2);
		
		txtNotaDigitada_3 = new JTextField();
		txtNotaDigitada_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() >= 48 && e.getKeyCode()  <= 57 || e.getKeyCode() == 10){
					c1 = c1+e.getKeyChar();
					txtNotaDigitada_3.setText(c1);
				}
				else {
					JOptionPane.showMessageDialog(null, "Informe apenas números");
					txtNotaDigitada_3.setText(null);
				}
				if(e.getKeyCode() == 10){
					textField.requestFocus();
					double nota1 = Double.parseDouble(txtNotaDigitada_1.getText());
					double nota2 = Double.parseDouble(txtNotaDigitada_2.getText());
					double nota3 = Double.parseDouble(txtNotaDigitada_3.getText());
					double soma = (nota1 + nota2 + nota2)/3;
					DecimalFormat df = new DecimalFormat("0.##");
					df.format(soma);
					textField.setText(df.format(soma));
					c1 = "";
					txtNotaDigitada_1.setText("");
					txtNotaDigitada_2.setText("");
					txtNotaDigitada_3.setText("");
					txtNotaDigitada_1.requestFocus(); // seta retorna pra essa campus
					if(soma >= 7) {
						textField_1.setText("APROVADO");
						textField_1.setForeground(Color.GREEN);
					} 
					else {
						textField_1.setText("REPROVADO");
						textField_1.setForeground(Color.RED);
					}
				}
			}
		});
		txtNotaDigitada_3.setColumns(10);
		txtNotaDigitada_3.setBounds(109, 177, 106, 20);
		frmEscolaPiratasDa.getContentPane().add(txtNotaDigitada_3);
		
		JButton btnNewButton = new JButton("M\u00E9dia Escolar");
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double nota1 = Double.parseDouble(txtNotaDigitada_1.getText());
				double nota2 = Double.parseDouble(txtNotaDigitada_2.getText());
				double nota3 = Double.parseDouble(txtNotaDigitada_3.getText());
				double soma = (nota1 + nota2 + nota2)/3;
				DecimalFormat df = new DecimalFormat("0.##");
				df.format(soma);
				textField.setText(df.format(soma));
				c1 = "";
				txtNotaDigitada_1.setText("");
				txtNotaDigitada_2.setText("");
				txtNotaDigitada_3.setText("");
				txtNotaDigitada_1.requestFocus();
				if(soma >= 7) {
					textField_1.setText("APROVADO");
					textField_1.setForeground(Color.GREEN);
				} 
				else {
					textField_1.setText("REPROVADO");
					textField_1.setForeground(Color.RED);
				}
			}
			
		});
		btnNewButton.setBounds(279, 90, 135, 23);
		frmEscolaPiratasDa.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(293, 135, 106, 20);
		frmEscolaPiratasDa.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(293, 177, 106, 20);
		frmEscolaPiratasDa.getContentPane().add(textField_1);
	}
}
