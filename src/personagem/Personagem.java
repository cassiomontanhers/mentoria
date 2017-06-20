package personagem;

import arma.Arma;
import util.ForcaAtaque;
import util.Tamanho;

public class Personagem {
	
	private Tamanho tamanho;
	private Ataque ataque;
	private String nome;
	private Arma arma;

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
	
	public void AtacarComArma(){
		System.out.println("Ataque do " + this.nome + " usando um(a) " + this.arma.getNome() + " : " + this.ataque.atacarComArma(this));
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

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

}
