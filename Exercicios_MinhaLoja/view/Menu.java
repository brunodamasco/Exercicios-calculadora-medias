package view;

import javax.swing.JOptionPane;

import dao.FuncionarioDAO;
import dao.ProdutoDAO;
import modelos.Funcionario;
import modelos.Produto;

public class Menu {

	public static void Inicio() {
		int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua opção:"
				+ "\n1 - Menu Funcionário"
				+ "\n2 - Menu Produtos"
				+ "\n3 - Sair", "Minha Loja", JOptionPane.QUESTION_MESSAGE));
		
		switch(opcao) {
		
		case 1:
			/*JOptionPane.showMessageDialog(null, "Menu Funcionários");*/
			Menu.MenuF();
			break;
		
		case 2:
			/*JOptionPane.showMessageDialog(null, "Menu Produtos");*/
			Menu.MenuP();
			break;
		}
	}

	private static void MenuF() {
		int opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"Selecione sua opção:"
				+ "\n1 - Cadastrar Funcionários"
				+ "\n2 - Atualizar Funcionários"
				+ "\n3 - Deletar Funcionários"
				+ "\n4 - Consultar Funcionários"
				+ "\n5 - Sair", "Teste", JOptionPane.INFORMATION_MESSAGE));
		
		FuncionarioDAO f = new FuncionarioDAO();
		Funcionario f1 = new Funcionario();
		
		switch(opcao) {
		
		case 1:
			f1 = Preencher.CadastroF();
			JOptionPane.showMessageDialog(null, f.cadastrar(f1), "Cadastrar", JOptionPane.ERROR_MESSAGE);
			Menu.MenuF();
			break;
			
		case 2:
			f1 = Preencher.AtualizarF();
			JOptionPane.showMessageDialog(null, f.atualizar(f1),"Atualizar", JOptionPane.ERROR_MESSAGE);
			Menu.MenuF();
			break;

		case 3:
			f1 = Preencher.DeletarF();
			JOptionPane.showMessageDialog(null, f.deletar(f1),"Deletar", JOptionPane.ERROR_MESSAGE);
			Menu.MenuF();
			break;
		case 4:
			f1 = Preencher.ConsultarF();
			JOptionPane.showMessageDialog(null, f.consultar(f1),"Consultar todos os Funcionários", JOptionPane.ERROR_MESSAGE);
			Menu.MenuF();
			break;
		case 5: 
			/*JOptionPane.showMessageDialog(null, "Voltando para o menu", "Sair", JOptionPane.ERROR_MESSAGE);*/
			Menu.Inicio();
			break;
		}	
	}
	private static void MenuP() {
		int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecione sua opção:"
				+ "\n1 - Cadastrar Produto" 
				+ "\n2 - Atualizar Produto" 
				+ "\n3 - Deletar Produto" 
				+ "\n4 - Consultar Produtos" 
				+ "\n5 - Sair", "Teste", JOptionPane.INFORMATION_MESSAGE));
		
		ProdutoDAO p = new ProdutoDAO();
		Produto p1 = new Produto();
		
		switch(opcao) {
		
		case 1:
			p1 = Preencher.CadastroP();
			JOptionPane.showMessageDialog(null, p.cadastrar(p1), "Cadastro", JOptionPane.ERROR_MESSAGE);
			Menu.MenuP();
			break;
			
		case 2:
			p1 = Preencher.AtualizarP();
			JOptionPane.showMessageDialog(null, p.cadastrar(p1), "Cadastro", JOptionPane.ERROR_MESSAGE);
			Menu.MenuP();
			break;
			
		case 3:
			p1 = Preencher.DeletarP();
			JOptionPane.showMessageDialog(null, p.deletar(p1), "Deletar", JOptionPane.ERROR_MESSAGE);
			Menu.MenuP();
			break;
			
		case 4:
			p1 = Preencher.ConsultarP();
			JOptionPane.showMessageDialog(null, p.consultar(p1), "Consultar", JOptionPane.ERROR_MESSAGE);
			Menu.MenuP();
			break;
		case 5: 
			JOptionPane.showMessageDialog(null, "Voltando para o menu", "Sair", JOptionPane.ERROR_MESSAGE);
			Menu.Inicio();
			break;
		}
	}

}
