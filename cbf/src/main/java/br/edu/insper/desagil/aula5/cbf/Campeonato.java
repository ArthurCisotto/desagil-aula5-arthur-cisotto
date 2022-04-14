package br.edu.insper.desagil.aula5.cbf;

public class Campeonato {
	private int calculaDiferenca(Partida partida) {
		return partida.getGolsVisitante() - partida.getGolsMandante();
	}

	public Equipe defineVencedor(Partida partida) {
		int diferenca = calculaDiferenca(partida);
		if (diferenca == 0) {
			return null;
		}
		if (diferenca < 0) {
			return partida.getMandante();
		}
		return partida.getVisitante();
	}

	public Equipe definePerdedor(Partida partida) {
		int diferenca = calculaDiferenca(partida);
		if (diferenca == 0) {
			return null;
		}
		if (diferenca < 0) {
			return partida.getVisitante();
		}
		return partida.getMandante();
	}
}
