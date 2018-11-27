package entities;

import aplication.Program;

public class Viagem {
	private Ponto inicio;
	private Ponto fim;
	private double tempoHoras;
	private double combustivelLitros;
	
	public Viagem() {
		super();
	}

	public Viagem(Ponto inicio, Ponto fim, double tempoHoras, double combustivelLitros) {
		super();
		this.inicio = inicio;
		this.fim = fim;
		this.tempoHoras = tempoHoras;
		this.combustivelLitros = combustivelLitros;
	}

	Program p1 = new Program();
	
	
	public Ponto getInicio() {
		return inicio;
	}

	public void setInicio(Ponto inicio) {
		this.inicio = inicio;
	}

	public Ponto getFim() {
		return fim;
	}

	public void setFim(Ponto fim) {
		this.fim = fim;
	}

	public double getTempoHoras() {
		return tempoHoras;
	}

	public void setTempoHoras(double tempoHoras) {
		this.tempoHoras = tempoHoras;
	}

	public double getCombustivelLitros() {
		return combustivelLitros;
	}

	public void setCombustivelLitros(double combustivelLitros) {
		this.combustivelLitros = combustivelLitros;
	}

	@Override
	public String toString() {
		return "Viagem [inicio=" + inicio + ", fim=" + fim + ", tempoHoras=" + tempoHoras + ", combustivelLitros="
				+ combustivelLitros + "]";
	}
	
}
