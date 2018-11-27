package view;

import javax.swing.JOptionPane;

import modelos.Funcionario;
import modelos.Produto;

public class Preencher {

	public static Funcionario CadastroF() {
		Funcionario f1 = new Funcionario();
		f1.setNome(JOptionPane.showInputDialog(null, "Digite o nome do funcion�rio", "Cadastrando Funcion�rios", JOptionPane.INFORMATION_MESSAGE));
		// CONFIRMA��O DO NOME DO FUNCION�RIO
		int opcao = JOptionPane.showConfirmDialog(null, f1.getNome(),
				"Confirme se o nome est� correto", JOptionPane.YES_NO_CANCEL_OPTION);
		if(opcao == 0){
			
		} else if(opcao != 0){
			f1.setNome(JOptionPane.showInputDialog(null, "Digite novamente o nome do Funcion�rio"));
		}
		
		f1.setId(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ID do Funcion�rio", "Cadastrando Funcion�rios", JOptionPane.INFORMATION_MESSAGE)));
		// CONFIRMA��O DO ID DO FUNCION�RIO
		int opcao2 = JOptionPane.showConfirmDialog(null, f1.getId(),
				"Confirme se o ID est� correto", JOptionPane.YES_NO_CANCEL_OPTION);
		if(opcao2 == 0) {
			
		} else if (opcao2 != 0) {
			f1.setId(JOptionPane.showInputDialog(null, "Digite o ID correto"));
		}
		
		f1.setIdade(JOptionPane.showInputDialog(null, "Digite a Idade do Funcion�rio", "Cadastrando Funcion�rios", JOptionPane.INFORMATION_MESSAGE));
		//CONFIRMA��O DA IDADE DO FUNCION�RIO
		int opcao3 = JOptionPane.showConfirmDialog(null, f1.getIdade(),
				"Confirme se a idade est� correta", JOptionPane.YES_NO_CANCEL_OPTION);
		if(opcao3 == 0) {
			
		} else if (opcao3 != 0) {
			f1.setIdade(JOptionPane.showInputDialog(null, "Digite a idade correta"));
		}
		return f1;
	}

	public static Funcionario AtualizarF() {
		Funcionario f1 = new Funcionario();
		f1.setNome(JOptionPane.showInputDialog(null, "Digite o Nome do Funcion�rio", "Atualizando o Cadastro dos Funcion�rios", JOptionPane.INFORMATION_MESSAGE));
		f1.setId(JOptionPane.showInputDialog(null, "Digite o Id do Funcion�rio", "Atualizando o Cadastro dos Funcion�rios", JOptionPane.INFORMATION_MESSAGE));
		f1.setIdade(JOptionPane.showInputDialog(null, "Digite a Idade do Funcion�rio", "Atualizando o Cadastro dos Funcion�rios", JOptionPane.INFORMATION_MESSAGE));
		return f1;
	}

	public static Funcionario DeletarF() {
		Funcionario f1 = new Funcionario();
		f1.setNome(JOptionPane.showInputDialog(null, "Digite o Nome do Funcion�rio", "Deletar Funcion�rios", JOptionPane.INFORMATION_MESSAGE));
		JOptionPane.showConfirmDialog(null, "Deseja Deletar", "Deletar Funcionario", JOptionPane.YES_NO_OPTION);
		return f1;
	}

	public static Funcionario ConsultarF() {
		Funcionario f1 = new Funcionario();
		f1.setNome(JOptionPane.showInputDialog(null, "Digite o Nome do Funcion�rio", "Consultar Funcion�rios", JOptionPane.INFORMATION_MESSAGE));
		JOptionPane.showConfirmDialog(null, "Deseja Consultar este funcion�rio ", "Deletar Funcionario", JOptionPane.YES_NO_OPTION);
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
