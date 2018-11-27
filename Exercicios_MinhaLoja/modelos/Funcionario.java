package modelos;

public class Funcionario {
	private int id;
	private String nome;
	private int idade;
	
	public Funcionario() {
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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setIdade(String idade) {
		setIdade(Integer.parseInt(idade));
	}

	@Override
	public String toString() {
		return "Funcionario \nid: " + id 
				+ "\nnome: " + nome 
				+ "\nidade: " + idade;
	}
	
	
}
