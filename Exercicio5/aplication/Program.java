package aplication;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import entities.Ponto;
import entities.Viagem;

public class Program {

	private JFrame frmGpsPerdidos;
	private JTextField latInicio;
	private JTextField latFinal;
	private JTextField LongInicio;
	private JTextField LongFinal;
	private String c1 = "";
	private JTextField TempViagem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Program window = new Program();
					window.frmGpsPerdidos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Program() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	Viagem v1 = new Viagem();
	Ponto lat = new Ponto();
	Ponto log = new Ponto();
	
	private void initialize() {
		frmGpsPerdidos = new JFrame();
		frmGpsPerdidos.setForeground(SystemColor.textHighlight);
		frmGpsPerdidos.setBackground(SystemColor.textHighlight);
		frmGpsPerdidos.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				latInicio.setVisible(true);
				latInicio.requestFocus();
				latInicio.select(0, latInicio.getText().length());
			}
		});
		frmGpsPerdidos.setTitle("GPS - Perdidos no Espa\u00E7o");
		frmGpsPerdidos.setBounds(100, 100, 695, 549);
		frmGpsPerdidos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGpsPerdidos.getContentPane().setLayout(null);
		
		JLabel lblPontoIncio = new JLabel("Ponto In\u00EDcio");
		lblPontoIncio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPontoIncio.setBounds(41, 87, 114, 34);
		frmGpsPerdidos.getContentPane().add(lblPontoIncio);
		
		JLabel lblPontoFinal = new JLabel("Ponto Final");
		lblPontoFinal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPontoFinal.setBounds(41, 158, 114, 34);
		frmGpsPerdidos.getContentPane().add(lblPontoFinal);
		
		JLabel lblLatitude = new JLabel("Latitude");
		lblLatitude.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblLatitude.setHorizontalAlignment(SwingConstants.CENTER);
		lblLatitude.setBounds(104, 39, 114, 32);
		frmGpsPerdidos.getContentPane().add(lblLatitude);
		
		JLabel lblLongitude = new JLabel("Longitude");
		lblLongitude.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblLongitude.setHorizontalAlignment(SwingConstants.CENTER);
		lblLongitude.setBounds(421, 39, 126, 32);
		frmGpsPerdidos.getContentPane().add(lblLongitude);
		
		latInicio = new JTextField();
		latInicio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		latInicio.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() >= 48 && e.getKeyCode()<= 57 || e.getKeyCode() == 10) {
					c1 = c1 + e.getKeyChar();
					latInicio.setText(c1);
					System.out.println(c1);
				}
				else {
					JOptionPane.showMessageDialog(null, "Informe apenas números");
					latInicio.setText(null);
				}
				if(e.getKeyCode() == 10){
					latFinal.requestFocus();
					latFinal.select(0, latFinal.getText().length());
					c1 = "";
				}			
				
				//v1.getInicio(latInicio.getText());
				System.out.println("Latitude: "+latInicio.getText());
				
				/*if(e.getKeyCode() >= 48 && e.getKeyCode() <= 57){
					c1 = c1 + e.getKeyChar();
					//valor1.setText(c1);
					System.out.println(c1);
				}
				else if (e.getKeyCode() == 8){
					c1 = c1.substring(0, c1.length() - 1);
					//JOptionPane.showMessageDialog(null, "Informe apenas números");
				}
				else{
					c1 = c1.substring(0, c1.length());
					valor1.setText(c1);
					JOptionPane.showMessageDialog(null, "Informe apenas números");
				}
					if (e.getKeyCode() == 10){
					valor2.requestFocus();
					valor2.select(0, valor2.getText().length());
					c1 = "";
				}*/
			}
		});
		latInicio.setText("digite o valor");
		latInicio.setBounds(168, 87, 126, 34);
		frmGpsPerdidos.getContentPane().add(latInicio);
		latInicio.setColumns(10);
		
		latFinal = new JTextField();
		latFinal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		latFinal.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() >= 48 && e.getKeyCode()<= 57 || e.getKeyCode() == 10) {
					c1 = c1 + e.getKeyChar();
					latFinal.setText(c1);
					System.out.println(c1);
				}
				else {
					JOptionPane.showMessageDialog(null, "Informe apenas números");
					latFinal.setText(null);
				}
				if(e.getKeyCode() == 10){
					LongInicio.requestFocus();
					LongInicio.select(0, LongInicio.getText().length());
					c1 = "";
				}	
			}
		});
		latFinal.setText("digite o valor");
		latFinal.setColumns(10);
		latFinal.setBounds(168, 158, 126, 34);
		frmGpsPerdidos.getContentPane().add(latFinal);
		
		LongInicio = new JTextField();
		LongInicio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		LongInicio.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() >= 48 && e.getKeyCode()<= 57 || e.getKeyCode() == 10) {
					c1 = c1 + e.getKeyChar();
					LongInicio.setText(c1);
					System.out.println(c1);
				}
				else {
					JOptionPane.showMessageDialog(null, "Informe apenas números");
					LongInicio.setText(null);
				}
				if(e.getKeyCode() == 10){
					LongFinal.requestFocus();
					LongFinal.select(0, LongFinal.getText().length());
					c1 = "";
				}
			}
		});
		LongInicio.setText("digite o valor");
		LongInicio.setColumns(10);
		LongInicio.setBounds(494, 87, 126, 34);
		frmGpsPerdidos.getContentPane().add(LongInicio);
		
		LongFinal = new JTextField();
		LongFinal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		LongFinal.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() >= 48 && e.getKeyCode()<= 57 || e.getKeyCode() == 10) {
					c1 = c1 + e.getKeyChar();
					LongFinal.setText(c1);
					System.out.println(c1);
				}
				else {
					JOptionPane.showMessageDialog(null, "Informe apenas números");
					LongFinal.setText(null);
				}
				if(e.getKeyCode() == 10){
					TempViagem.requestFocus();
					TempViagem.select(0, TempViagem.getText().length());
					c1 = "";
				}
			}
		});
		LongFinal.setText("digite o valor");
		LongFinal.setColumns(10);
		LongFinal.setBounds(494, 158, 126, 34);
		frmGpsPerdidos.getContentPane().add(LongFinal);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(10, 136, 648, 1);
		frmGpsPerdidos.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(10, 208, 648, 2);
		frmGpsPerdidos.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(10, 37, 648, 2);
		frmGpsPerdidos.getContentPane().add(separator_2);
		
		JLabel lblTempoDaViagem = new JLabel("Tempo Viagem");
		lblTempoDaViagem.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTempoDaViagem.setBounds(41, 226, 155, 45);
		frmGpsPerdidos.getContentPane().add(lblTempoDaViagem);
		
		TempViagem = new JTextField();
		TempViagem.setFont(new Font("Tahoma", Font.PLAIN, 18));
		TempViagem.setText("digite o valor");
		TempViagem.setColumns(10);
		TempViagem.setBounds(223, 231, 126, 34);
		frmGpsPerdidos.getContentPane().add(TempViagem);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBackground(Color.BLACK);
		separator_3.setBounds(10, 287, 648, 12);
		frmGpsPerdidos.getContentPane().add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBackground(Color.BLACK);
		separator_4.setBounds(10, 36, 2, 411);
		frmGpsPerdidos.getContentPane().add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setBackground(Color.BLACK);
		separator_5.setBounds(657, 37, 2, 411);
		frmGpsPerdidos.getContentPane().add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBackground(Color.BLACK);
		separator_6.setBounds(10, 446, 648, 2);
		frmGpsPerdidos.getContentPane().add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setOrientation(SwingConstants.VERTICAL);
		separator_7.setBackground(Color.BLACK);
		separator_7.setBounds(321, 37, 2, 171);
		frmGpsPerdidos.getContentPane().add(separator_7);
		
		JButton btnDistancia = new JButton("Dist\u00E2ncia");
		btnDistancia.setBounds(40, 315, 115, 34);
		frmGpsPerdidos.getContentPane().add(btnDistancia);
		
		JButton btnVelMedia = new JButton("Velocidade");
		btnVelMedia.setBounds(272, 315, 115, 34);
		frmGpsPerdidos.getContentPane().add(btnVelMedia);
		
		JButton btnAutonomia = new JButton("Autonomia");
		btnAutonomia.setBounds(505, 315, 115, 34);
		frmGpsPerdidos.getContentPane().add(btnAutonomia);
		
		JTextPane textDistancia = new JTextPane();
		textDistancia.setBackground(Color.LIGHT_GRAY);
		textDistancia.setBounds(40, 378, 115, 34);
		frmGpsPerdidos.getContentPane().add(textDistancia);
		
		JLabel label = new JLabel("Ponto In\u00EDcio");
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label.setBounds(338, 87, 128, 34);
		frmGpsPerdidos.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Ponto Final");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_1.setBounds(338, 158, 114, 34);
		frmGpsPerdidos.getContentPane().add(label_1);
		
		JTextPane textVelocidade = new JTextPane();
		textVelocidade.setBackground(Color.LIGHT_GRAY);
		textVelocidade.setBounds(272, 378, 115, 34);
		frmGpsPerdidos.getContentPane().add(textVelocidade);
		
		JTextPane textAutonomia = new JTextPane();
		textAutonomia.setBackground(Color.LIGHT_GRAY);
		textAutonomia.setBounds(505, 378, 115, 34);
		frmGpsPerdidos.getContentPane().add(textAutonomia);
	}
}
