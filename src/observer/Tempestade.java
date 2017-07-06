package observer;

import util.Dificuldade;

public class Tempestade implements Clima {

	private String nome;
	private Dificuldade dificuldade;

	public Tempestade() {
		this.dificuldade = Dificuldade.DIFICIL;
		this.nome = "Tempestade";
	}

	@Override
	public Dificuldade getDificuldade() {
		return this.dificuldade;
	}

	public void setDificuldade(Dificuldade dificuldade) {
		this.dificuldade = dificuldade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
