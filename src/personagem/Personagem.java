package personagem;

import arma.Arma;
import util.Defesa;
import util.Tamanho;
import util.TipoPersonagem;

public class Personagem {
	
	private Tamanho tamanho;
	private Ataque ataque;
	private TipoPersonagem tipoPersonagem;
	private Arma arma;
	private Defesa defesa;

	public Personagem(Tamanho tamanho, Ataque ataque, Defesa defesa, TipoPersonagem tipoPersonagem){
		this.tamanho = tamanho;
		this.setTipoPersonagem(tipoPersonagem);
		this.ataque = ataque;
		this.setDefesa(defesa);
	}

	public void Atacar(){
		System.out.println("Ataque do " + this.getTipoPersonagem() + " " + this.ataque.atacar(this));
	}
	
	public void AtacarComArma(){
		System.out.println("Ataque do " + this.getTipoPersonagem() + " usando um(a) " + this.arma.Descricao() + " : " + this.ataque.atacarComArma(this));
	}
	
	public int getPoderDeAtaque(){
		return this.ataque.atacarComArma(this);
	}

	public Tamanho getTamanho() {
		return tamanho;
	}

	public void setTamanho(Tamanho tamanho) {
		this.tamanho = tamanho;
	}
	

	public String getNome() {
		return getTipoPersonagem().getValor();
	}

	public void setNome(TipoPersonagem tipoPersonagem) {
		this.setTipoPersonagem(tipoPersonagem);
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}
	
	public void info(){
		System.out.println("-- INFO PERSONAGEM --");
		System.out.println("Nome : " + getTipoPersonagem().getValor());
		System.out.println("Tamanho : " + tamanho);
		System.out.print("Ataque : ");
		AtacarComArma();
		System.out.println("Arma : " + arma.Descricao());
		System.out.println("Defesa : " +  getDefesa().name());
		
	}

	public Defesa getDefesa() {
		return defesa;
	}

	public void setDefesa(Defesa defesa) {
		this.defesa = defesa;
	}

	public TipoPersonagem getTipoPersonagem() {
		return tipoPersonagem;
	}

	public void setTipoPersonagem(TipoPersonagem tipoPersonagem) {
		this.tipoPersonagem = tipoPersonagem;
	}

}
