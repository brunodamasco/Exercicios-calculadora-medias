package calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex5_Localizacao {

	private JFrame frmGps;
	private JTextField PiLatitude;
	private JTextField PiLongitude;
	private JTextField PfLatitude;
	private JTextField PfLongitude;
	private String c1 = "";
	private JTextField TempoViagem;
	private JTextField DistanciaPerc;
	private JTextField VelocidadeM;
	private JTextField Autonomia;
	private double distancia = 0;
	private double lat;
	private double log;
	private double lat1;
	private double log1;
	private double aut;
	private double distanc = 0;
	private JTextField Combustvel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex5_Localizacao window = new Ex5_Localizacao();
					window.frmGps.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ex5_Localizacao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGps = new JFrame();
		frmGps.setTitle("GPS  <>   Idas e Vindas  <>");
		frmGps.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				PiLatitude.setVisible(true);
				PiLatitude.requestFocus();
				PiLatitude.select(0, PiLatitude.getText().length());
				//PiLatitude.grabFocus();
				//PiLatitude.requestFocusInWindow();
				
			}
		});
		frmGps.setBounds(100, 100, 450, 300);
		frmGps.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGps.getContentPane().setLayout(null);
		
		PiLatitude = new JTextField();
		PiLatitude.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() >= 48 && e.getKeyCode()<= 57 || e.getKeyCode() == 10) {
					c1 = c1 + e.getKeyChar();
					PiLatitude.setText(c1);
					System.out.println(c1);
				}
				else {
					JOptionPane.showMessageDialog(null, "Informe apenas números");
					PiLatitude.setText(null);
				}
				if(e.getKeyCode() == 10){
					PiLongitude.requestFocus();
					PiLongitude.select(0, PiLongitude.getText().length());
					c1 = "";
				}
			}
		});
		PiLatitude.setText("Digite a latitude");
		PiLatitude.setBounds(21, 42, 109, 20);
		frmGps.getContentPane().add(PiLatitude);
		PiLatitude.setColumns(10);
		
		PiLongitude = new JTextField();
		PiLongitude.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() >= 48 && e.getKeyCode()<= 57 || e.getKeyCode() == 10) {
					c1 = c1 + e.getKeyChar();
					PiLongitude.setText(c1);
					System.out.println(c1);
				}
				else {
					JOptionPane.showMessageDialog(null, "Informe apenas números");
					PiLongitude.setText(null);
				}
				if(e.getKeyCode() == 10){
					PfLatitude.requestFocus();
					PfLatitude.select(0, PfLatitude.getText().length());
					c1 = "";
				}
			}
		});
		PiLongitude.setText("Digite a longitude");
		PiLongitude.setColumns(10);
		PiLongitude.setBounds(21, 73, 109, 20);
		frmGps.getContentPane().add(PiLongitude);
		
		JLabel TxtPontoInicial = new JLabel("Ponto Inicial");
		TxtPontoInicial.setHorizontalAlignment(SwingConstants.CENTER);
		TxtPontoInicial.setForeground(Color.BLACK);
		TxtPontoInicial.setBackground(Color.WHITE);
		TxtPontoInicial.setFont(new Font("Tahoma", Font.PLAIN, 12));
		TxtPontoInicial.setBounds(21, 11, 109, 20);
		frmGps.getContentPane().add(TxtPontoInicial);
		
		PfLatitude = new JTextField();
		PfLatitude.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() >= 48 && e.getKeyCode()<= 57 || e.getKeyCode() == 10) {
					c1 = c1 + e.getKeyChar();
					PfLatitude.setText(c1);
					System.out.println(c1);
				}
				else {
					JOptionPane.showMessageDialog(null, "Informe apenas números");
					PfLatitude.setText(null);
				}
				if(e.getKeyCode() == 10){
					PfLongitude.requestFocus();
					PfLongitude.select(0, PfLongitude.getText().length());
					c1 = "";
				}
			}
		});
		PfLatitude.setText("Digite a latitude");
		PfLatitude.setColumns(10);
		PfLatitude.setBounds(161, 42, 109, 20);
		frmGps.getContentPane().add(PfLatitude);
		
		PfLongitude = new JTextField();
		PfLongitude.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() >= 48 && e.getKeyCode()<= 57 || e.getKeyCode() == 10) {
					c1 = c1 + e.getKeyChar();
					PfLongitude.setText(c1);
					System.out.println(c1);
				}
				else {
					JOptionPane.showMessageDialog(null, "Informe apenas números");
					PfLongitude.setText(null);
				}
				if(e.getKeyCode() == 10){
					TempoViagem.requestFocus();
					TempoViagem.select(0, TempoViagem.getText().length());
					c1 = "";
				}
			}
		});
		PfLongitude.setText("Digite a longitude");
		PfLongitude.setColumns(10);
		PfLongitude.setBounds(161, 73, 109, 20);
		frmGps.getContentPane().add(PfLongitude);
		
		JLabel TxtPontoFinal = new JLabel("Ponto Final");
		TxtPontoFinal.setHorizontalAlignment(SwingConstants.CENTER);
		TxtPontoFinal.setForeground(Color.BLACK);
		TxtPontoFinal.setFont(new Font("Tahoma", Font.PLAIN, 12));
		TxtPontoFinal.setBackground(Color.WHITE);
		TxtPontoFinal.setBounds(161, 11, 109, 20);
		frmGps.getContentPane().add(TxtPontoFinal);
		
		JLabel lblTempoDeViagem = new JLabel("Tempo de viagem");
		lblTempoDeViagem.setHorizontalAlignment(SwingConstants.CENTER);
		lblTempoDeViagem.setForeground(Color.BLACK);
		lblTempoDeViagem.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTempoDeViagem.setBackground(Color.WHITE);
		lblTempoDeViagem.setBounds(302, 11, 109, 20);
		frmGps.getContentPane().add(lblTempoDeViagem);
		
		TempoViagem = new JTextField();
		TempoViagem.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() >= 48 && e.getKeyCode()<= 57 || e.getKeyCode() == 10) {
					c1 = c1 + e.getKeyChar();
					TempoViagem.setText(c1);
					System.out.println(c1);
				}
				else {
					JOptionPane.showMessageDialog(null, "Informe apenas números");
					TempoViagem.setText(null);
				}
				if(e.getKeyCode() == 10){
					Combustvel.requestFocus();
					Combustvel.select(0, Combustvel.getText().length());
					c1 = "";
				}
			}
		});
		TempoViagem.setText("Tempo de viagem?");
		TempoViagem.setColumns(10);
		TempoViagem.setBounds(302, 42, 109, 20);
		frmGps.getContentPane().add(TempoViagem);
		
		JButton btnDistnciaPercorrida = new JButton("Dist\u00E2ncia Percorrida");
		btnDistnciaPercorrida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lat = Double.parseDouble(PiLatitude.getText()); 
				lat1 = Double.parseDouble(PfLatitude.getText());
				log = Double.parseDouble(PiLongitude.getText());
				log1 = Double.parseDouble(PfLongitude.getText());
				distancia = Math.sqrt(((lat1 - lat) * (lat1 - lat)) + ((log1 - log) * (log1 - log)));
				/*DecimalFormat df = new DecimalFormat("0.##");
				df.format(distancia);*/
				DistanciaPerc.setText(String.valueOf(distancia));
			}
		});
		btnDistnciaPercorrida.setBounds(10, 133, 134, 23);
		frmGps.getContentPane().add(btnDistnciaPercorrida);
		
		JButton btnVelocidadeMdia = new JButton("Velocidade M\u00E9dia");
		btnVelocidadeMdia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double vel;
				
				vel = distancia / Double.parseDouble(TempoViagem.getText());
				
				VelocidadeM.setText(""+vel); 
				Autonomia.requestFocus();
			}
		});
		btnVelocidadeMdia.setBounds(157, 133, 134, 23);
		frmGps.getContentPane().add(btnVelocidadeMdia);
		
		DistanciaPerc = new JTextField();
		DistanciaPerc.setColumns(10);
		DistanciaPerc.setBounds(21, 182, 109, 20);
		frmGps.getContentPane().add(DistanciaPerc);
		
		VelocidadeM = new JTextField();
		VelocidadeM.setColumns(10);
		VelocidadeM.setBounds(161, 182, 109, 20);
		frmGps.getContentPane().add(VelocidadeM);
		
		Autonomia = new JTextField();
		Autonomia.setColumns(10);
		Autonomia.setBounds(302, 182, 109, 20);
		frmGps.getContentPane().add(Autonomia);
		
		Combustvel = new JTextField();
		Combustvel.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() >= 48 && e.getKeyCode()<= 57 || e.getKeyCode() == 10) {
					c1 = c1 + e.getKeyChar();
					Combustvel.setText(c1);
					System.out.println(c1);
				}
				else {
					JOptionPane.showMessageDialog(null, "Informe apenas números");
					Combustvel.setText(null);
				}
				if(e.getKeyCode() == 10){
					DistanciaPerc.requestFocus();
					DistanciaPerc.select(0, DistanciaPerc.getText().length());
					c1 = "";
				}
			}
		});
		Combustvel.setText("Qtd combust\u00EDvel");
		Combustvel.setColumns(10);
		Combustvel.setBounds(302, 73, 109, 20);
		frmGps.getContentPane().add(Combustvel);
		
		JButton btnAutonomia = new JButton("Autonomia");
		btnAutonomia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				distanc = Double.parseDouble(DistanciaPerc.getText());
				double comb = Double.parseDouble(Combustvel.getText());
				distancia = distanc / comb;
				
				Autonomia.setText(String.valueOf(distancia));
				
			}
		});
		btnAutonomia.setBounds(298, 133, 134, 23);
		frmGps.getContentPane().add(btnAutonomia);
	}
}
