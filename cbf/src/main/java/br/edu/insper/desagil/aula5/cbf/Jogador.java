package br.edu.insper.desagil.aula5.cbf;

public class Jogador {
	private String nome;
	private int forca;
	private int agilidade;
	private int folego;

	public Jogador(String nome, int forca, int agilidade, int folego) {
		this.nome = nome;
		this.forca = forca;
		this.agilidade = agilidade;
		this.folego = folego;
	}

	public String getNome() {
		return nome;
	}

	public int getForca() {
		return forca;
	}

	public int getAgilidade() {
		return agilidade;
	}

	public int getFolego() {
		return folego;
	}
}
