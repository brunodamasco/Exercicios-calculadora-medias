package mediaNotas_8;

public class Avaliacao8 {
	private double nota1;
	private double nota2;
	private double nota3;
	
	public Avaliacao8() {
		super();
	}

	public Avaliacao8(double nota1, double nota2, double nota3) {
		super();
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	
	public void setNota1(String n1) {
		setNota1(Double.parseDouble(n1));
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	public void setNota2(String n2) {
		setNota2(Double.parseDouble(n2));
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	
	public void setNota3(String n3) {
		setNota3(Double.parseDouble(n3));
	}
	public double getMedia() {
		double media = (nota1 + nota2 + nota3) / 3;
		return media;
	}
}
