package exercicios_aula;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ex2_CopiandoTecladoDigitado {

	private JFrame frmRecebendoMensagem;
	JTextPane textPane_1 = new JTextPane();
	JTextPane textPane_2 = new JTextPane();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex2_CopiandoTecladoDigitado window = new Ex2_CopiandoTecladoDigitado();
					window.frmRecebendoMensagem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ex2_CopiandoTecladoDigitado() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRecebendoMensagem = new JFrame();
		frmRecebendoMensagem.setTitle("Exerc\u00EDcio 2");
		frmRecebendoMensagem.setBounds(100, 100, 450, 300);
		frmRecebendoMensagem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRecebendoMensagem.getContentPane().setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				frmRecebendoMensagem.setTitle(textPane.getText());
				textPane_2.setText(textPane.getText());
			}
			@Override
			public void keyReleased(KeyEvent e) {
				textPane_1.setText(textPane.getText());
			}
		});
		textPane.setBounds(78, 42, 268, 20);
		frmRecebendoMensagem.getContentPane().add(textPane);
		
		JLabel lblDigite = new JLabel("Digite...");
		lblDigite.setBounds(168, 17, 84, 14);
		frmRecebendoMensagem.getContentPane().add(lblDigite);
		
		textPane_1 = new JTextPane();
		textPane_1.setBounds(78, 87, 268, 20);
		frmRecebendoMensagem.getContentPane().add(textPane_1);
		
		
		textPane_2.setBounds(78, 138, 268, 20);
		frmRecebendoMensagem.getContentPane().add(textPane_2);
	}
}
