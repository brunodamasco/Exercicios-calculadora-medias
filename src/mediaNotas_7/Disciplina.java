package mediaNotas_7;

import java.text.DecimalFormat;

public class Disciplina {
	private String nome;
	private Avaliacao av1;
	private Avaliacao av2;
	private Avaliacao av3;
	
	public Disciplina() {
		av1 = new Avaliacao();
		av2 = new Avaliacao();
		av3 = new Avaliacao();
	}
	
	public Disciplina(String nome) {
		super();
		this.nome = nome;
		av1 = new Avaliacao();
		av2 = new Avaliacao();
		av3 = new Avaliacao();
	}

	public Disciplina(String nome, Avaliacao av1, Avaliacao av2, Avaliacao av3) {
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
	
	public Avaliacao getAv1() {
		return av1;
	}
	public void setAv1(Avaliacao av1) {
		this.av1 = av1;
	}
	public void setAv1(String av1) {
		setAv1(String.valueOf(av1));
	}
	public Avaliacao getAv2() {
		return av2;
	}
	public void setAv2(Avaliacao av2) {
		this.av2 = av2;
	}
	public Avaliacao getAv3() {
		return av3;
	}
	public void setAv3(Avaliacao av3) {
		this.av3 = av3;
	}
	public double getMedia() {
		double media = (av1.getNota1() + av2.getNota2() + av3.getNota3()) / 3;
		return media;
	}
	public String getMedia1() {
		DecimalFormat df = new DecimalFormat("0.##");
		double media = (av1.getNota1() + av2.getNota2() + av3.getNota3()) / 3;
		df.format(media);
		return (df.format(media));
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nome;
	}
}
