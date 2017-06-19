package personagem;

import util.ForcaAtaque;
import util.Tamanho;

public class Personagem {
	
	private Tamanho tamanho;
	private Ataque ataque;
	private String nome;

	public Personagem(Tamanho tamanho, ForcaAtaque ataque, String nome){
		this.tamanho = tamanho;
		this.nome = nome;
		switch (ataque) {
		case FORTE:
			this.ataque = new AtaqueForte();
			break;
		case FRACO:
			this.ataque = new AtaqueFraco();
			break;
		default:
			break;
		}
	}

	public void Atacar(){
		System.out.println("Ataque do " + this.nome + " " + this.ataque.atacar(this));
	}

	public Tamanho getTamanho() {
		return tamanho;
	}

	public void setTamanho(Tamanho tamanho) {
		this.tamanho = tamanho;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
