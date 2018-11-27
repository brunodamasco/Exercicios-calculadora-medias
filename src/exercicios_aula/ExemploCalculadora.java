package exercicios_aula;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.Box;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class ExemploCalculadora {

	private JFrame frmBasic;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	String titulo = "";
	String titulo1 = "";
	String titulo2 = "";
	String titulo3 = "";
	int soma;
	int subtracao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExemploCalculadora window = new ExemploCalculadora();
					window.frmBasic.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ExemploCalculadora() {
		initialize();
	}

	private void initialize() {
		frmBasic = new JFrame();
		frmBasic.setResizable(false);
		frmBasic.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Usuario\\Desktop\\icon.png"));
		frmBasic.setTitle(" Basic Calculator");
		frmBasic.setBounds(100, 100, 371, 323);
		frmBasic.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBasic.getContentPane().setLayout(null);
		
		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setBounds(162, 99, 1, 1);
		frmBasic.getContentPane().add(horizontalBox);
		
		JButton button = new JButton("+");
		button.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				int x = Integer.parseInt(textField_2.getText());
				int y = Integer.parseInt(textField_3.getText());
				soma = x + y;
				textField_4.setText(String.valueOf(soma));
			}
		});
		button.setBounds(235, 103, 53, 39);
		frmBasic.getContentPane().add(button);
		
		JButton button_1 = new JButton("-");
		button_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int x = Integer.parseInt(textField_2.getText());
				int y = Integer.parseInt(textField_3.getText());
				subtracao = x - y;				textField_4.setText(String.valueOf(subtracao));
			}
		});
		button_1.setBounds(287, 103, 53, 39);
		frmBasic.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("x");
		button_2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				double x = Integer.parseInt(textField_2.getText());
				double y = Integer.parseInt(textField_3.getText());
				double multiplicar = x * y;
				textField_4.setText(String.valueOf(multiplicar));

				
			}
		});
		button_2.setBounds(235, 141, 53, 39);
		frmBasic.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("/");
		button_3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				double x = Integer.parseInt(textField_2.getText());
				double y = Integer.parseInt(textField_3.getText());
				double dividir = x / y;;
				textField_4.setText(String.valueOf(dividir));
				
			}
		});
		button_3.setBounds(287, 141, 53, 39);
		frmBasic.getContentPane().add(button_3);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyCode()>=48 && arg0.getKeyCode()<=57) {
					titulo = String.valueOf(arg0.getKeyChar());
					textField.setText(titulo);
					System.out.println(textField);
				}
				if(arg0.getKeyCode()==10){
					textField_2.setText(textField.getText());
				}

			}
		});
		textField.setBounds(10, 91, 91, 39);
		frmBasic.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()>=48 && e.getKeyCode()<=57) {
					titulo1 = String.valueOf(e.getKeyChar());
					textField_1.setText(titulo1);
					System.out.println(textField_1);
				}
				if(e.getKeyCode()==10){
					textField_3.setText(textField_1.getText());
				}
			}
		});
		textField_1.setBounds(10, 153, 91, 39);
		frmBasic.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(116, 91, 91, 39);
		frmBasic.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(116, 153, 91, 39);
		frmBasic.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(162, 221, 131, 39);
		frmBasic.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblEnterANumber = new JLabel("Enter a number");
		lblEnterANumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEnterANumber.setBounds(10, 53, 105, 27);
		frmBasic.getContentPane().add(lblEnterANumber);
		
		JLabel lblPressEnter = new JLabel("Press Enter");
		lblPressEnter.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPressEnter.setBounds(125, 53, 105, 27);
		frmBasic.getContentPane().add(lblPressEnter);
		
		JLabel lblClickOnThe = new JLabel("Click on the button\r\n");
		lblClickOnThe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblClickOnThe.setBounds(227, 53, 138, 27);
		frmBasic.getContentPane().add(lblClickOnThe);
		
		JLabel lblYourAnswer = new JLabel("Your answer");
		lblYourAnswer.setForeground(Color.BLACK);
		lblYourAnswer.setBackground(Color.GRAY);
		lblYourAnswer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblYourAnswer.setBounds(28, 221, 124, 39);
		frmBasic.getContentPane().add(lblYourAnswer);
		
		JLabel lblBasicCalculator = new JLabel("BASIC CALCULATOR");
		lblBasicCalculator.setHorizontalAlignment(SwingConstants.CENTER);
		lblBasicCalculator.setForeground(Color.BLACK);
		lblBasicCalculator.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBasicCalculator.setBackground(SystemColor.desktop);
		lblBasicCalculator.setBounds(71, 3, 237, 39);
		frmBasic.getContentPane().add(lblBasicCalculator);
	}
}
