package view;

import javax.swing.JOptionPane;

import modelos.Funcionario;
import modelos.Produto;

public class Preencher {

	public static Funcionario CadastroF() {
		Funcionario f1 = new Funcionario();
		f1.setNome(JOptionPane.showInputDialog(null, "Digite o nome do funcionário", "Cadastrando Funcionários", JOptionPane.INFORMATION_MESSAGE));
		// CONFIRMAÇÃO DO NOME DO FUNCIONÁRIO
		int opcao = JOptionPane.showConfirmDialog(null, f1.getNome(),
				"Confirme se o nome está correto", JOptionPane.YES_NO_CANCEL_OPTION);
		if(opcao == 0){
			
		} else if(opcao != 0){
			f1.setNome(JOptionPane.showInputDialog(null, "Digite novamente o nome do Funcionário"));
		}
		
		f1.setId(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ID do Funcionário", "Cadastrando Funcionários", JOptionPane.INFORMATION_MESSAGE)));
		// CONFIRMAÇÃO DO ID DO FUNCIONÁRIO
		int opcao2 = JOptionPane.showConfirmDialog(null, f1.getId(),
				"Confirme se o ID está correto", JOptionPane.YES_NO_CANCEL_OPTION);
		if(opcao2 == 0) {
			
		} else if (opcao2 != 0) {
			f1.setId(JOptionPane.showInputDialog(null, "Digite o ID correto"));
		}
		
		f1.setIdade(JOptionPane.showInputDialog(null, "Digite a Idade do Funcionário", "Cadastrando Funcionários", JOptionPane.INFORMATION_MESSAGE));
		//CONFIRMAÇÃO DA IDADE DO FUNCIONÁRIO
		int opcao3 = JOptionPane.showConfirmDialog(null, f1.getIdade(),
				"Confirme se a idade está correta", JOptionPane.YES_NO_CANCEL_OPTION);
		if(opcao3 == 0) {
			
		} else if (opcao3 != 0) {
			f1.setIdade(JOptionPane.showInputDialog(null, "Digite a idade correta"));
		}
		return f1;
	}

	public static Funcionario AtualizarF() {
		Funcionario f1 = new Funcionario();
		f1.setNome(JOptionPane.showInputDialog(null, "Digite o Nome do Funcionário", "Atualizando o Cadastro dos Funcionários", JOptionPane.INFORMATION_MESSAGE));
		f1.setId(JOptionPane.showInputDialog(null, "Digite o Id do Funcionário", "Atualizando o Cadastro dos Funcionários", JOptionPane.INFORMATION_MESSAGE));
		f1.setIdade(JOptionPane.showInputDialog(null, "Digite a Idade do Funcionário", "Atualizando o Cadastro dos Funcionários", JOptionPane.INFORMATION_MESSAGE));
		return f1;
	}

	public static Funcionario DeletarF() {
		Funcionario f1 = new Funcionario();
		f1.setNome(JOptionPane.showInputDialog(null, "Digite o Nome do Funcionário", "Deletar Funcionários", JOptionPane.INFORMATION_MESSAGE));
		JOptionPane.showConfirmDialog(null, "Deseja Deletar", "Deletar Funcionario", JOptionPane.YES_NO_OPTION);
		return f1;
	}

	public static Funcionario ConsultarF() {
		Funcionario f1 = new Funcionario();
		f1.setNome(JOptionPane.showInputDialog(null, "Digite o Nome do Funcionário", "Consultar Funcionários", JOptionPane.INFORMATION_MESSAGE));
		JOptionPane.showConfirmDialog(null, "Deseja Consultar este funcionário ", "Deletar Funcionario", JOptionPane.YES_NO_OPTION);
		return f1;
	}

	public static Produto CadastroP() {
		// TODO Auto-generated method stub
		return null;
	}
	public static Produto AtualizarP( ) {
		return null;
	}

	public static Produto DeletarP() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Produto ConsultarP() {
		// TODO Auto-generated method stub
		return null;
	}


}
