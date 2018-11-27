package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import controller.ListaController;
import model.Pessoa;
import javax.swing.JTable;

public class Painel {

	private JFrame frmCadastroDePessoas;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JTextArea txtAreaResult;
	Pessoa p;
	ListaController lista = new ListaController();
	private JTextField txtIndice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Painel window = new Painel();
					window.frmCadastroDePessoas.setVisible(true);
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
	
	public void limparDados() {
		txtNome.setText(null);
		txtIdade.setText(null);
		txtNome.requestFocus();
		txtAreaResult.setText(null);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCadastroDePessoas = new JFrame();
		frmCadastroDePessoas.setResizable(false);
		frmCadastroDePessoas.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				txtNome.requestFocus();
				//txtNome.setText("");
				txtNome.selectAll();
			}
		});
		frmCadastroDePessoas.setBackground(SystemColor.menu);
		frmCadastroDePessoas.getContentPane().setBackground(SystemColor.scrollbar);
		frmCadastroDePessoas.setTitle("Cadastro de Pessoas");
		frmCadastroDePessoas.setBounds(100, 100, 625, 621);
		frmCadastroDePessoas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCadastroDePessoas.getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 20));
		lblNome.setBounds(15, 16, 107, 32);
		frmCadastroDePessoas.getContentPane().add(lblNome);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdade.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 20));
		lblIdade.setBounds(15, 64, 107, 32);
		frmCadastroDePessoas.getContentPane().add(lblIdade);
		
		txtNome = new JTextField();
		txtNome.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				String c1 = "";
				if(!(e.getKeyCode() >= 48 && e.getKeyCode()<= 57)) {
					c1 = txtNome.getText()+ String.valueOf(e.getKeyChar());
					//System.out.println(e.getKeyChar());
				}
				else {
					JOptionPane.showMessageDialog(null, "Digite apenas letras");
					txtNome.setText(null);
				}
				if(e.getKeyCode() == 10){
					txtIdade.selectAll();
					txtIdade.requestFocus();
				}
			}
		});
		
		JLabel lblIndice = new JLabel("Indice");
		lblIndice.setHorizontalAlignment(SwingConstants.CENTER);
		lblIndice.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 20));
		lblIndice.setBounds(15, 126, 107, 32);
		frmCadastroDePessoas.getContentPane().add(lblIndice);
		txtNome.setBackground(UIManager.getColor("Button.background"));
		txtNome.setFont(new Font("Source Sans Pro", Font.ITALIC, 20));
		txtNome.setText("digite o nome");
		txtNome.setBounds(140, 16, 266, 32);
		frmCadastroDePessoas.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		txtIdade = new JTextField();
		txtIdade.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				String c1 = "";
				if((e.getKeyCode() >= 48 && e.getKeyCode()<= 57) || e.getKeyCode()<= 10) {
				}
				else {
					JOptionPane.showMessageDialog(null, "Digite apenas números");
					txtIdade.setText(null);
				}
				if(e.getKeyCode() == 10){
					txtIdade.selectAll();
					txtIdade.requestFocus();
					lista.addPessoaArrayList(txtNome, txtIdade);
					
				}
			}
		});
		txtIdade.setBackground(UIManager.getColor("Button.background"));
		txtIdade.setText("digite a idade");
		txtIdade.setFont(new Font("Source Sans Pro", Font.ITALIC, 20));
		txtIdade.setColumns(10);
		txtIdade.setBounds(140, 63, 131, 35);
		frmCadastroDePessoas.getContentPane().add(txtIdade);
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lista.imprimirDados(getTxtAreaResult());
			}
		});
		txtIndice = new JTextField();
		txtIndice.setFont(new Font("Source Sans Pro", Font.ITALIC, 20));
		txtIndice.setColumns(10);
		txtIndice.setBackground(SystemColor.menu);
		txtIndice.setBounds(140, 125, 131, 35);
		frmCadastroDePessoas.getContentPane().add(txtIndice);
		btnNewButton.setBackground(UIManager.getColor("InternalFrame.activeTitleBackground"));
		btnNewButton.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 24));
		btnNewButton.setBounds(435, 16, 115, 80);
		frmCadastroDePessoas.getContentPane().add(btnNewButton);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lista.removerPessoa(Integer.parseInt(txtIndice.getText()) - 1);
				lista.imprimirDados(getTxtAreaResult());
			}
		});
		btnExcluir.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 22));
		btnExcluir.setBackground(SystemColor.activeCaption);
		btnExcluir.setBounds(291, 123, 115, 46);
		frmCadastroDePessoas.getContentPane().add(btnExcluir);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 112, 582, 10);
		frmCadastroDePessoas.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 0, 604, 10);
		frmCadastroDePessoas.getContentPane().add(separator_1);
		
		txtAreaResult = new JTextArea();
		txtAreaResult.setToolTipText("");
		txtAreaResult.setFont(new Font("Arial", Font.PLAIN, 24));
		txtAreaResult.setBackground(UIManager.getColor("CheckBox.background"));
		txtAreaResult.setBounds(30, 185, 552, 354);
		frmCadastroDePessoas.getContentPane().add(txtAreaResult);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lista.editarPessoa(Integer.parseInt(txtIndice.getText()), txtNome, txtIdade, txtIndice);
			}
		});
		btnEditar.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 22));
		btnEditar.setBackground(SystemColor.activeCaption);
		btnEditar.setBounds(435, 123, 115, 46);
		frmCadastroDePessoas.getContentPane().add(btnEditar);
	}
	protected JTextArea getTxtAreaResult() {
		return txtAreaResult;
	}
	protected JTextField getTxtIdade() {
		return txtIdade;
	}
	public JTextField getTxtNome() {
		return txtNome;
	}
}
