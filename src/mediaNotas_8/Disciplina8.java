package mediaNotas_8;

public class Disciplina8 {
	private String nome;
	private Avaliacao8 av1;
	private Avaliacao8 av2;
	private Avaliacao8 av3;
	public Disciplina8() {
		super();
	}
	public Disciplina8(String nome, Avaliacao8 av1, Avaliacao8 av2, Avaliacao8 av3) {
		super();
		this.nome = nome;
		this.av1 = av1;
		this.av2 = av2;
		this.av3 = av3;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Avaliacao8 getAv1() {
		return av1;
	}
	public void setAv1(Avaliacao8 av1) {
		this.av1 = av1;
	}
	public void setAv1(String av1) {
		setAv1(String.valueOf(av1));
	}
	public Avaliacao8 getAv2() {
		return av2;
	}
	public void setAv2(Avaliacao8 av2) {
		this.av2 = av2;
	}
	public Avaliacao8 getAv3() {
		return av3;
	}
	public void setAv3(Avaliacao8 av3) {
		this.av3 = av3;
	}
	public double getMedia() {
		double media = (av1.getNota1() + av2.getNota2() + av3.getNota3()) / 3;
		return media;
	}
}
