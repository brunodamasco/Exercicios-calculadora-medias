package mediaNotas_7;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MediaPainel {

	private JFrame frmColgioTiticaNa;
	private int tipoDisciplina;
	private int tipoAvaliacao;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	
	
	private Avaliacao av1;
	private Avaliacao av2;
	private Avaliacao av3;
	
	private double medMatematica;
	private double medHistoria;
	private double medPortugues;
	
	private JTextField textField_4;
	private JTextField textField_10;
	private JButton btnMdia;
	private JButton btnSituao;
	private JSeparator separator_4;
	private JSeparator separator_5;
	private JTextField textField_6;
	private JLabel lblDisciplina;
	private JComboBox comboBox_2;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_5;
	Disciplina d1;
	Disciplina d2;
	Disciplina d3;
	Disciplina d;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MediaPainel window = new MediaPainel();
					window.frmColgioTiticaNa.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MediaPainel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void limparSelecao() {
		comboBox_1.requestFocus();
		comboBox_1.setSelectedIndex(0);
		textField_1.setText("");
		textField_2.setText("");
		textField_3.setText("");
	}
	private void focus() {
		textField.requestFocus();
		textField.setText("");
	}
	

	
	private void initialize() {
		frmColgioTiticaNa = new JFrame();
		frmColgioTiticaNa.setFont(new Font("Dialog", Font.BOLD, 12));
		frmColgioTiticaNa.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				comboBox.setSelectedIndex(3);
			}
		});
		frmColgioTiticaNa.setResizable(false);
		frmColgioTiticaNa.setTitle("Col\u00E9gio Titica na cabe\u00E7a");
		frmColgioTiticaNa.setBounds(100, 100, 506, 580);
		frmColgioTiticaNa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmColgioTiticaNa.getContentPane().setLayout(null);
	
		
		comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				d = (Disciplina) comboBox.getSelectedItem();
				d1 = (Disciplina) comboBox.getSelectedItem();
				d2 = (Disciplina) comboBox.getSelectedItem();
				d3 = (Disciplina) comboBox.getSelectedItem();
				if(!d.getNome().equals("Escolha"))
					textField_6.setText(d.getNome());	
			}
		});
		comboBox.addMouseListener(new MouseAdapter() {
		});
		comboBox.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(comboBox.getSelectedIndex() == 0) {
					limparSelecao();
				}
				if(comboBox.getSelectedIndex() == 1) {
					limparSelecao();
				}
				if(comboBox.getSelectedIndex() == 2) {
					limparSelecao();
				}
				if(e.getKeyCode() == 10) {
					comboBox_1.requestFocus();
					comboBox_1.setSelectedIndex(0);
					if(comboBox.getSelectedIndex() == 0) {
						textField_6.setText(d.getNome());
					}
					if(comboBox.getSelectedIndex() == 1) {
						textField_6.setText(d.getNome());
					}
					if(comboBox.getSelectedIndex() == 2) {
						textField_6.setText(d.getNome());
					}
					if(comboBox.getSelectedIndex() == 3) {
						comboBox.requestFocus();
						comboBox.setSelectedIndex(3);
					}
				}
			}
		});
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Disciplina[] disciplinas = new Disciplina[4];
		disciplinas[0] = new Disciplina("Matemática");
		disciplinas[1] = new Disciplina("Programação");
		disciplinas[2] = new Disciplina("Banco de dados");
		disciplinas[3] = new Disciplina("Escolha");
		
		comboBox.setModel(new DefaultComboBoxModel(disciplinas));
		comboBox.setBounds(67, 57, 137, 36);
		frmColgioTiticaNa.getContentPane().add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				switch (comboBox_1.getSelectedIndex()) {
				case 0:
					System.out.println("nota 1 selecionado");	
					focus();
					break;
				case 1:
					System.out.println("nota 2 selecionado");	
					focus();
					break;
				case 2:
					System.out.println("nota 3 selecionado");	
					focus();
					break;
				}
			}
		});
		comboBox_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == 10) {
					textField.requestFocus();
				}
				
			}
		});
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Nota 1", "Nota 2", "Nota 3"}));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_1.setBounds(281, 57, 137, 36);
		frmColgioTiticaNa.getContentPane().add(comboBox_1);
		
		comboBox_2 = new JComboBox();
		comboBox_2.addMouseListener(new MouseAdapter() {
		});
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Matem\u00E1tica", "Programa\u00E7\u00E3o", "Banco de Dados"}));
		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_2.setBounds(265, 253, 137, 36);
		frmColgioTiticaNa.getContentPane().add(comboBox_2);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				tipoDisciplina = comboBox.getSelectedIndex();
				tipoAvaliacao = comboBox_1.getSelectedIndex();
				if(e.getKeyCode() >= 48 && e.getKeyCode()  <= 57 || e.getKeyCode()  <= 10){
					if(tipoDisciplina == 0) {
						if(tipoAvaliacao == 0) {
							
							textField_1.setText(textField_1.getText()+ String.valueOf(e.getKeyChar()));
								if(e.getKeyCode() == 10) {
									d1.getAv1().setNota1(textField_1.getText());
									System.out.println("nota1 matemática: "+d1.getAv1().getNota1());
									comboBox_1.setSelectedIndex(1);
									comboBox_1.requestFocus();
									textField.setText("");
								}
						}
						if(tipoAvaliacao == 1) {
							textField_2.setText(textField_2.getText()+ String.valueOf(e.getKeyChar()));
								if(e.getKeyCode() == 10) {
									d1.getAv2().setNota2(textField_2.getText());
									System.out.println("nota2 matemática: "+d1.getAv2().getNota2());
									comboBox_1.setSelectedIndex(2);
									comboBox_1.requestFocus();
									textField.setText("");
								}
						} 	
						if(tipoAvaliacao == 2) {
							textField_3.setText(textField_3.getText()+ String.valueOf(e.getKeyChar()));
								if(e.getKeyCode() == 10) {
									d1.getAv3().setNota3(textField_3.getText());
									System.out.println("nota3 matemática: "+d1.getAv3().getNota3());
									d1.getMedia1();
									System.out.println("media matematica: "+ d1.getMedia1());
									comboBox.setSelectedIndex(1);
									comboBox.requestFocus();
									textField.setText("");
								}
						}
					}
					if(tipoDisciplina == 1) {
						if(tipoAvaliacao == 0) {
							textField_1.setText(textField_1.getText()+ String.valueOf(e.getKeyChar()));
								if(e.getKeyCode() == 10) {
									d2.getAv1().setNota1(textField_1.getText());
									System.out.println("nota1 programação: "+d2.getAv1().getNota1());
									comboBox_1.setSelectedIndex(1);
									comboBox_1.requestFocus();
									textField.setText("");
								}
						}
						if(tipoAvaliacao == 1) {
							textField_2.setText(textField_2.getText()+ String.valueOf(e.getKeyChar()));
								if(e.getKeyCode() == 10) {
									d2.getAv2().setNota2(textField_2.getText());
									System.out.println("nota2 programação: "+d2.getAv2().getNota2());
									comboBox_1.setSelectedIndex(2);
									comboBox_1.requestFocus();
									textField.setText("");
								}
						}
						if(tipoAvaliacao == 2) {
							textField_3.setText(textField_3.getText()+ String.valueOf(e.getKeyChar()));
								if(e.getKeyCode() == 10) {
									d2.getAv3().setNota3(textField_3.getText());
									System.out.println("nota3 programação: "+d2.getAv3().getNota3());
									d2.getMedia1();
									System.out.println("media programação: "+ d2.getMedia1());
									comboBox.setSelectedIndex(2);
									comboBox.requestFocus();
									textField.setText("");
								}
						}
					}
					if(tipoDisciplina == 2) {
						if(tipoAvaliacao == 0) {
							textField_1.setText(textField_1.getText()+ String.valueOf(e.getKeyChar()));
								if(e.getKeyCode() == 10) {
									d3.getAv1().setNota1(textField_1.getText());
									System.out.println("nota1 banco de dados: "+d3.getAv1().getNota1());
									comboBox_1.setSelectedIndex(1);
									comboBox_1.requestFocus();
									textField.setText("");
								}
						}
						if(tipoAvaliacao == 1) {
							textField_2.setText(textField_2.getText()+ String.valueOf(e.getKeyChar()));
								if(e.getKeyCode() == 10) {
									d3.getAv2().setNota2(textField_2.getText());
									System.out.println("nota2 banco de dados: "+d3.getAv2().getNota2());
									comboBox_1.setSelectedIndex(2);
									comboBox_1.requestFocus();
									textField.setText("");
								}
						}
						if(tipoAvaliacao == 2) {
							textField_3.setText(textField_3.getText()+ String.valueOf(e.getKeyChar()));
								if(e.getKeyCode() == 10) {
									d3.getAv3().setNota3(textField_3.getText());
									System.out.println("nota3 banco de dados: "+d3.getAv3().getNota3());
									d3.getMedia1();
									System.out.println("media banco de dados: "+ d3.getMedia1());
									comboBox.setSelectedIndex(0);
									comboBox.requestFocus();
									textField.setText("");
								}
						}
					}
				}
			}
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyChar() == 8) {
					textField_1.setText(textField.getText());
				}
				
			}
		});
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(265, 161, 137, 36);
		frmColgioTiticaNa.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.BLUE);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == 10) {
					textField_1.setText("");
				}
			}
		});
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(15, 233, 137, 36);
		frmColgioTiticaNa.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.BLUE);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == 10) {
					textField_3.requestFocus();
				}
			}
		});
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(15, 305, 137, 36);
		frmColgioTiticaNa.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setForeground(Color.BLUE);
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == 10) {
					comboBox.requestFocus();
				}
			}
		});
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_3.setColumns(10);
		textField_3.setBounds(15, 374, 137, 36);
		frmColgioTiticaNa.getContentPane().add(textField_3);
		
		btnMdia = new JButton("M\u00E9dia");
		btnMdia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(comboBox_2.getSelectedIndex() == 0) {
					textField_4.setText(d1.getMedia1());
						if(Integer.parseInt(d1.getMedia1()) >= 7) {
							textField_7.setText(d1.getMedia1());
							textField_7.setForeground(Color.BLUE);
						}
						else {
							textField_7.setText(d1.getMedia1());
							textField_7.setForeground(Color.RED);
						}
						System.out.println("media matematica: "+ d1.getMedia1());
				}
				if(comboBox_2.getSelectedIndex() == 1) {
					textField_4.setText(d2.getMedia1());
					System.out.println("Media programacao "+ d2.getMedia1());
						if(Integer.parseInt(d2.getMedia1()) >= 7) {
							textField_8.setText(d2.getMedia1());
							textField_8.setForeground(Color.BLUE);
						}
						else {
							textField_8.setText(d2.getMedia1());
							textField_8.setForeground(Color.RED);
						}
						System.out.println("media programaçaõ: "+ d2.getMedia1());
				}
				if(comboBox_2.getSelectedIndex() == 2) {
					textField_4.setText(d3.getMedia1());
						if(Integer.parseInt(d3.getMedia1()) >= 7) {
							textField_9.setText(d3.getMedia1());
							textField_9.setForeground(Color.BLUE);
						}
						else {
							textField_9.setText(d3.getMedia1());
							textField_9.setForeground(Color.RED);
						}
						System.out.println("media banco de dados: "+ d3.getMedia1());
				}
				
			}
		});
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_4.setColumns(10);
		textField_4.setBounds(199, 357, 115, 36);
		frmColgioTiticaNa.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_5.setColumns(10);
		textField_5.setBounds(341, 357, 125, 36);
		frmColgioTiticaNa.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setForeground(Color.BLUE);
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_6.setColumns(10);
		textField_6.setBounds(15, 160, 137, 36);
		frmColgioTiticaNa.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_7.setColumns(10);
		textField_7.setBounds(15, 488, 105, 36);
		frmColgioTiticaNa.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_8.setColumns(10);
		textField_8.setBounds(123, 488, 105, 36);
		frmColgioTiticaNa.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_9.setColumns(10);
		textField_9.setBounds(231, 488, 105, 36);
		frmColgioTiticaNa.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_10.setColumns(10);
		textField_10.setBounds(341, 488, 125, 36);
		frmColgioTiticaNa.getContentPane().add(textField_10);
		btnMdia.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnMdia.setBounds(199, 305, 115, 36);
		frmColgioTiticaNa.getContentPane().add(btnMdia);
		
		btnSituao = new JButton("Click");
		btnSituao.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(comboBox_2.getSelectedIndex() == 0) {
					if(Double.parseDouble(d1.getMedia1()) >= 7) {
						textField_10.setText("APROVADO");
						textField_10.setForeground(Color.GREEN);
					} 
					else {
						textField_10.setText("REPROVADO");
						textField_10.setForeground(Color.RED);
					}
				}
				if(comboBox_2.getSelectedIndex() == 1) {
					if(Double.parseDouble(d2.getMedia1()) >= 7) {
						textField_10.setText("APROVADO");
						textField_10.setForeground(Color.GREEN);
					} 
					else {
						textField_10.setText("REPROVADO");
						textField_10.setForeground(Color.RED);
					}
				}
				if(comboBox_2.getSelectedIndex() == 2) {
					if(Double.parseDouble(d3.getMedia1()) >= 7) {
						textField_10.setText("APROVADO");
						textField_10.setForeground(Color.GREEN);
					} 
					else {
						textField_10.setText("REPROVADO");
						textField_10.setForeground(Color.RED);
					}
				}
			}
		});
		btnSituao.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSituao.setBounds(341, 450, 125, 36);
		frmColgioTiticaNa.getContentPane().add(btnSituao);
		
		JButton btnMdiaFinal = new JButton("M\u00E9dia Final");
		btnMdiaFinal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				double mediaFinal = (medMatematica + medHistoria + medPortugues) / 3;
				DecimalFormat df = new DecimalFormat("0.##");
				df.format(mediaFinal);
				textField_5.setText(df.format(mediaFinal));
				if(mediaFinal >= 7) {
					textField_5.setForeground(Color.GREEN);
					textField_10.setText("APROVADO");
					textField_10.setForeground(Color.GREEN);
				} 
				else {
					textField_5.setForeground(Color.RED);
					textField_10.setText("REPROVADO");
					textField_10.setForeground(Color.RED);
				}
				
			}
		});
		btnMdiaFinal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnMdiaFinal.setBounds(341, 305, 125, 36);
		frmColgioTiticaNa.getContentPane().add(btnMdiaFinal);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(179, 233, 303, 2);
		frmColgioTiticaNa.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(179, 408, 303, 2);
		frmColgioTiticaNa.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(179, 233, 2, 177);
		frmColgioTiticaNa.getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(480, 233, 2, 177);
		frmColgioTiticaNa.getContentPane().add(separator_3);
		
		separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBounds(15, 161, 2, 249);
		frmColgioTiticaNa.getContentPane().add(separator_4);
		
		separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setBounds(150, 161, 2, 249);
		frmColgioTiticaNa.getContentPane().add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(15, 528, 467, 2);
		frmColgioTiticaNa.getContentPane().add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBounds(15, 450, 467, 2);
		frmColgioTiticaNa.getContentPane().add(separator_7);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setOrientation(SwingConstants.VERTICAL);
		separator_8.setBounds(15, 450, 2, 79);
		frmColgioTiticaNa.getContentPane().add(separator_8);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setOrientation(SwingConstants.VERTICAL);
		separator_9.setBounds(480, 450, 2, 79);
		frmColgioTiticaNa.getContentPane().add(separator_9);
		
		JLabel lblDigiteANota = new JLabel("Digite a nota e press Enter");
		lblDigiteANota.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDigiteANota.setHorizontalAlignment(SwingConstants.CENTER);
		lblDigiteANota.setBounds(189, 122, 272, 36);
		frmColgioTiticaNa.getContentPane().add(lblDigiteANota);
		
		JLabel lblDisciplinas = new JLabel("Disciplinas");
		lblDisciplinas.setHorizontalAlignment(SwingConstants.CENTER);
		lblDisciplinas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDisciplinas.setBounds(67, 16, 137, 36);
		frmColgioTiticaNa.getContentPane().add(lblDisciplinas);
		
		JLabel lblAvaliaes = new JLabel("Avalia\u00E7\u00F5es");
		lblAvaliaes.setHorizontalAlignment(SwingConstants.CENTER);
		lblAvaliaes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAvaliaes.setBounds(281, 16, 137, 36);
		frmColgioTiticaNa.getContentPane().add(lblAvaliaes);
		
		JLabel lblNota = new JLabel("Nota 1");
		lblNota.setHorizontalAlignment(SwingConstants.CENTER);
		lblNota.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNota.setBounds(15, 199, 137, 36);
		frmColgioTiticaNa.getContentPane().add(lblNota);
		
		JLabel lblNota_1 = new JLabel("Nota 2");
		lblNota_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNota_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNota_1.setBounds(15, 270, 137, 36);
		frmColgioTiticaNa.getContentPane().add(lblNota_1);
		
		JLabel lblNota_2 = new JLabel("Nota 3");
		lblNota_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNota_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNota_2.setBounds(15, 339, 137, 36);
		frmColgioTiticaNa.getContentPane().add(lblNota_2);
		
		JLabel lblSituaoAcadmicaDo = new JLabel("M\u00E9dia em cada disciplina\r\n\r\n");
		lblSituaoAcadmicaDo.setHorizontalAlignment(SwingConstants.CENTER);
		lblSituaoAcadmicaDo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSituaoAcadmicaDo.setBounds(179, 199, 303, 36);
		frmColgioTiticaNa.getContentPane().add(lblSituaoAcadmicaDo);
		
		lblDisciplina = new JLabel("Disciplina");
		lblDisciplina.setHorizontalAlignment(SwingConstants.CENTER);
		lblDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDisciplina.setBounds(15, 122, 137, 36);
		frmColgioTiticaNa.getContentPane().add(lblDisciplina);
		
		JLabel lblSituaoAcadmicaDo_1 = new JLabel("M\u00E9dia de cada mat\u00E9ria");
		lblSituaoAcadmicaDo_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSituaoAcadmicaDo_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSituaoAcadmicaDo_1.setBounds(15, 416, 325, 36);
		frmColgioTiticaNa.getContentPane().add(lblSituaoAcadmicaDo_1);
		
		JLabel lblMatemtica = new JLabel("Matem\u00E1tica");
		lblMatemtica.setHorizontalAlignment(SwingConstants.CENTER);
		lblMatemtica.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMatemtica.setBounds(15, 450, 105, 36);
		frmColgioTiticaNa.getContentPane().add(lblMatemtica);
		
		JLabel lblDisciplistriaina = new JLabel("Hist\u00F3ria");
		lblDisciplistriaina.setHorizontalAlignment(SwingConstants.CENTER);
		lblDisciplistriaina.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDisciplistriaina.setBounds(124, 450, 94, 36);
		frmColgioTiticaNa.getContentPane().add(lblDisciplistriaina);
		
		JLabel lblPortugus = new JLabel("Portugu\u00EAs");
		lblPortugus.setHorizontalAlignment(SwingConstants.CENTER);
		lblPortugus.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPortugus.setBounds(221, 450, 105, 36);
		frmColgioTiticaNa.getContentPane().add(lblPortugus);
		
		JLabel lblSituaoFinal = new JLabel("Situa\u00E7\u00E3o Final");
		lblSituaoFinal.setHorizontalAlignment(SwingConstants.CENTER);
		lblSituaoFinal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSituaoFinal.setBounds(329, 416, 153, 36);
		frmColgioTiticaNa.getContentPane().add(lblSituaoFinal);
	}
	protected JComboBox getComboBox() {
		return comboBox;
	}
	protected JComboBox getComboBox_1() {
		return comboBox_1;
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
	protected JTextField getTextField_3() {
		return textField_3;
	}
	protected JButton getBtnMdia() {
		return btnMdia;
	}
	protected JButton getBtnSituao() {
		return btnSituao;
	}
	protected JTextField getTextField_4() {
		return textField_4;
	}
	protected JTextField getTextField_5() {
		return textField_10;
	}
	protected JComboBox getComboBox_2() {
		return comboBox_2;
	}
}
