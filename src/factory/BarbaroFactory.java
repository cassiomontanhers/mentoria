package factory;

import arma.Afiado;
import arma.ArcoEFlecha;
import arma.Lanca;
import arma.Machado;
import personagem.AtaqueForte;
import personagem.AtaqueFraco;
import personagem.AtaqueMedio;
import personagem.Personagem;
import util.Defesa;
import util.Tamanho;
import util.TipoPersonagem;

public class BarbaroFactory implements PersonagemFactory{
	
	private String nomeFactory = "Barbaro";

	@Override
	public Personagem criarGuerreiro() {
		Personagem personagem = new Personagem(Tamanho.GRANDE, new AtaqueForte(), Defesa.FRACA, TipoPersonagem.GUERREIRO);
		personagem.setArma(new Afiado(new Machado()));
		return personagem;
	}

	@Override
	public Personagem criarArqueiro() {
		Personagem personagem = new Personagem(Tamanho.MEDIO, new AtaqueFraco(), Defesa.MUITO_FRACA, TipoPersonagem.ARQUEIRO);
		personagem.setArma(new ArcoEFlecha());
		return personagem;
	}

	@Override
	public Personagem criarLanceiro() {
		Personagem personagem = new Personagem(Tamanho.MEDIO, new AtaqueMedio(), Defesa.FRACA, TipoPersonagem.LANCEIRO);
		personagem.setArma(new Lanca());
		return personagem;
	}

	@Override
	public String getNomeFactory() {
		return nomeFactory;
	}

}
