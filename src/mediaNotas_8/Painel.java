package mediaNotas_8;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Painel {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JComboBox comboBox;
	private String c1;
	private JTextField textField_2;
	private JTextField textField_3;
	private int n;
	private int array[] = new int[n]; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Painel window = new Painel();
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
	public Painel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				textField.setVisible(true);
				textField.requestFocus();
				textField.select(0, textField.getText().length());
			}
		});
		frame.setBounds(100, 100, 590, 444);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblQuantidadeDeNotas = new JLabel("N\u00FAmero de notas");
		lblQuantidadeDeNotas.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuantidadeDeNotas.setFont(new Font("Arial", Font.PLAIN, 18));
		lblQuantidadeDeNotas.setBounds(26, 16, 147, 31);
		frame.getContentPane().add(lblQuantidadeDeNotas);
		
		JLabel lblNomeMatria = new JLabel("Nome mat\u00E9ria");
		lblNomeMatria.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomeMatria.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNomeMatria.setBounds(201, 16, 137, 31);
		frame.getContentPane().add(lblNomeMatria);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial", Font.PLAIN, 18));
		comboBox.setBounds(372, 16, 147, 31);
		frame.getContentPane().add(comboBox);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(!(e.getKeyCode() >= 48 && e.getKeyCode()  <= 57 || e.getKeyCode()  <= 10)){
					textField_1.setText(textField_1.getText()+ String.valueOf(e.getKeyChar()));
				}
				if(e.getKeyChar() == 8) {
					textField_1.setText(textField.getText());
				}
				if(e.getKeyChar() == 10) {
					textField_2.setText(textField.getText());
					for(int i = 0; i < array.length;i++) {
						comboBox.setSelectedIndex(i);
					}
				}
			}
		});
		textField.setFont(new Font("Arial", Font.PLAIN, 18));
		textField.setBounds(201, 63, 146, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(201, 109, 146, 31);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(372, 63, 146, 31);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_3.setColumns(10);
		textField_3.setBounds(27, 63, 146, 31);
		frame.getContentPane().add(textField_3);
	}
	protected JTextField getTxtDigiteAMatria() {
		return textField;
	}
	protected JTextField getTextField() {
		return textField_1;
	}
	protected JComboBox getComboBox() {
		return comboBox;
	}
	protected JTextField getTextField_2() {
		return textField_2;
	}
}
