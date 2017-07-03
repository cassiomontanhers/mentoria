package personagem;

import java.util.Random;

import arma.Arma;
import state.ConstituicaoState;
import state.MoralNormal;
import state.MoralState;
import util.Defesa;
import util.NumerosMagicos;
import util.TipoPersonagem;

public class Personagem {

	private ConstituicaoState constituicao;
	private Ataque ataque;
	private TipoPersonagem tipoPersonagem;
	private Arma arma;
	private Defesa defesa;
	private MoralState moral;

	public Personagem(ConstituicaoState constituicao, Ataque ataque, Defesa defesa, TipoPersonagem tipoPersonagem){
		this.constituicao = constituicao;
		this.setTipoPersonagem(tipoPersonagem);
		this.ataque = ataque;
		this.setDefesa(defesa);
		this.setMoral(new MoralNormal());
	}

	public Integer atacar(Personagem defensor){

		Random random = new Random();
		int range = 80 - 1 + 1;
		int valorAtaque =  random.nextInt(range) + 1;
		valorAtaque += this.getPoderDeAtaque();

		System.out.println("~ Ataque : "+valorAtaque+" Defesa : "+defensor.getDefesa().getValor()+" ~ Dano : "+(this.ataque.atacarComArma(this)+moral.getForcaMoral())+ " ~");

		if(defensor.getDefesa().getValor() < valorAtaque){
			return (this.ataque.atacarComArma(this)+moral.getForcaMoral());
		}
		return NumerosMagicos.ZERO.getValor();
	}

	public void atacarInfo(){
		System.out.println("Ataque do " + this.getTipoPersonagem() + " usando um(a) " + this.arma.Descricao() + " : " + this.ataque.atacarComArma(this));
	}

	public int getPoderDeAtaque(){
		return this.ataque.atacarComArma(this);
	}

	public ConstituicaoState getConstituicao() {
		return constituicao;
	}

	public void setConstituicao(ConstituicaoState constituicao) {
		this.constituicao = constituicao;
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
		System.out.println("Tamanho : " + constituicao);
		System.out.print("Ataque : ");
		atacarInfo();
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

	public MoralState getMoral() {
		return moral;
	}

	public void setMoral(MoralState moral) {
		this.moral = moral;
	}

}
