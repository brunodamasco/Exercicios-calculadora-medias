package calculadora;

import java.awt.EventQueue;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ex3_CopiarNumeroInteiro {

	private JFrame frmExerccio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex3_CopiarNumeroInteiro window = new Ex3_CopiarNumeroInteiro();
					window.frmExerccio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ex3_CopiarNumeroInteiro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmExerccio = new JFrame();
		frmExerccio.setTitle("Exerc\u00EDcio 3 - Copiando n\u00FAmero Inteiro");
		frmExerccio.setBounds(100, 100, 450, 300);
		frmExerccio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmExerccio.getContentPane().setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(94, 113, 246, 20);
		frmExerccio.getContentPane().add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() >= 48 && e.getKeyCode()  <= 57){
					textPane.setText(textPane.getText()+ String.valueOf(e.getKeyChar()));
				}
			}
		});
		textPane_1.setBounds(94, 53, 246, 20);
		frmExerccio.getContentPane().add(textPane_1);
	}

}
