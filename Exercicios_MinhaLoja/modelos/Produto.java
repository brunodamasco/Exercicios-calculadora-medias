package modelos;

public class Produto {
	private int id;
	private String nome;
	private int quantidade;
	private double valor;
	
	public Produto() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setId(String id) {
		setId(Integer.parseInt(id));
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public void setQuantidade(String quantidade) {
		setQuantidade(Integer.parseInt(quantidade));
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public void setValor(String valor) {
		setValor(Integer.parseInt(valor));
	}
	
	@Override
	public String toString() {
		return "Produto \nid: " + id 
				+ "\nnome: " + nome 
				+ "\nquantidade: " + quantidade 
				+ "\nvalor: " + valor;
	}
		
}
