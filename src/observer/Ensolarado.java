package observer;

import util.Dificuldade;

public class Ensolarado implements Clima{

	private String nome;
	private Dificuldade dificuldade;

	public Ensolarado() {
		this.dificuldade = Dificuldade.FACIL;
		this.nome = "Ensolarado";
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