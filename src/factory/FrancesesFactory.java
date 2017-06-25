package factory;

import arma.Afiado;
import arma.ArcoEFlecha;
import arma.Espada;
import arma.Lanca;
import arma.Reforcado;
import personagem.AtaqueForte;
import personagem.AtaqueMedio;
import personagem.Personagem;
import util.Defesa;
import util.Tamanho;
import util.TipoPersonagem;

public class FrancesesFactory implements PersonagemFactory{

	private String nomeFactory = "Frances";
	
	@Override
	public Personagem criarGuerreiro() {
		Personagem personagem = new Personagem(Tamanho.MEDIO, new AtaqueMedio(), Defesa.MEDIA, TipoPersonagem.GUERREIRO);
		personagem.setArma(new Afiado((new Espada())));
		return personagem;
	}

	@Override
	public Personagem criarArqueiro() {
		Personagem personagem = new Personagem(Tamanho.PEQUENO, new AtaqueMedio(), Defesa.FRACA, TipoPersonagem.ARQUEIRO);
		personagem.setArma(new Reforcado(new ArcoEFlecha()));
		return personagem;
	}

	@Override
	public Personagem criarLanceiro() {
		Personagem personagem = new Personagem(Tamanho.MEDIO, new AtaqueForte(), Defesa.BOA, TipoPersonagem.LANCEIRO);
		personagem.setArma(new Reforcado(new Lanca()));
		return personagem;
	}

	@Override
	public String getNomeFactory() {
		return nomeFactory;
	}
	
}
