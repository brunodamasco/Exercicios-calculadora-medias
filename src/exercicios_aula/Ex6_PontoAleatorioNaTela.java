package exercicios_aula;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import java.awt.event.MouseMotionAdapter;

public class Ex6_PontoAleatorioNaTela {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex6_PontoAleatorioNaTela window = new Ex6_PontoAleatorioNaTela();
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
	public Ex6_PontoAleatorioNaTela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnClick = new JButton("Click ");
		btnClick.addMouseMotionListener(new MouseMotionAdapter() {
			
		});
		btnClick.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent arg0) {
			
				Random ran = new Random();
				Random ran1 = new Random();

				int x = ran.nextInt(frame.getWidth() - 100);
				int y = ran1.nextInt(frame.getHeight() - 100);
				
				btnClick.setBounds(x , y, 100, 100);
				
				
			}
		});
		frame.getContentPane().add(btnClick);
	}

}
