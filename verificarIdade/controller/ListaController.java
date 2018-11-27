package controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import model.Pessoa;

public class ListaController {
	private ArrayList<Pessoa> listPessoa;
	private Pessoa pessoa;
	
	public ListaController() {
		listPessoa = new ArrayList<>();
		pessoa = new Pessoa();
	}

	public ListaController(ArrayList<Pessoa> listPessoa, Pessoa pessoa) {
		this.listPessoa = listPessoa;
		this.pessoa = pessoa;
	}

	public ArrayList<Pessoa> getListPessoa() {
		return listPessoa;
	}

	public void setListPessoa(ArrayList<Pessoa> listPessoa) {
		this.listPessoa = listPessoa;
	}
	
	public void addPessoa(String p) {
		listPessoa.add(pessoa);
	}
	
	public void addPessoaArrayList(JTextField textNome, JTextField txtIdade) {
		this.pessoa = new Pessoa();
		this.pessoa.setNome(textNome.getText());
		this.pessoa.setIdade(Integer.parseInt(txtIdade.getText()));
		textNome.setText("");
		txtIdade.setText("");
		textNome.requestFocus();
		this.listPessoa.add(pessoa);
	}
	
	public void imprimirDados(JTextArea txtAreaResult) {
		txtAreaResult.setText("");
		for(int i = 0; i < getQuantidadePessoas(); i++) {
			txtAreaResult.setText(txtAreaResult.getText()+"\n"+(i+1)+ ") "
			+ this.getListPessoa().get(i).getNome() + " - "
			+ this.getListPessoa().get(i).getIdade() + " - "
			+ this.getListPessoa().get(i).maioridade());
		}
	}
	public int getQuantidadePessoas() {
		return listPessoa.size();
	}
	public void editarPessoa(int indice, JTextField txtNome, JTextField txtIdade, JTextField txtIndice) {
		indice = Integer.parseInt(txtIndice.getText());
		txtNome.setText("");
		txtIdade.setText("");
		txtNome.requestFocus();
		pessoa = listPessoa.get(indice);
		txtNome.setText(pessoa.getNome());
		txtIdade.setText(""+pessoa.getIdade());
	}
	
	public void removerPessoa(int indice) {
		listPessoa.remove(indice);
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

 }
