package br.edu.insper.desagil.aula5.cbf;

public class Partida {
	private Equipe mandante;
	private Equipe visitante;
	private int golsMandante;
	private int golsVisitante;

	public Partida(Equipe mandante, Equipe visitante) {
		this.mandante = mandante;
		this.visitante = visitante;
		this.golsMandante = 0;
		this.golsVisitante = 0;
	}

	public Equipe getMandante() {
		return mandante;
	}

	public Equipe getVisitante() {
		return visitante;
	}

	public int getGolsMandante() {
		return golsMandante;
	}

	public int getGolsVisitante() {
		return golsVisitante;
	}

	public void marcaMandante() {
		golsMandante++;
	}

	public void marcaVisitante() {
		golsVisitante++;
	}
}
