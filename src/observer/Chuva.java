package observer;

import util.Dificuldade;

public class Chuva implements Clima{

	private String nome;
	private Dificuldade dificuldade;
	
	public Chuva() {
		this.dificuldade = Dificuldade.DIFICIL;
		this.nome = "Chuva";
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