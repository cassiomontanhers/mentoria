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

public class BritanicosFactory implements PersonagemFactory{
	
	private String nomeFactory = "Britanicos";
	
	@Override
	public Personagem criarGuerreiro() {
		Personagem personagem = new Personagem(Tamanho.MEDIO, new AtaqueMedio(), Defesa.BOA, TipoPersonagem.GUERREIRO);
		personagem.setArma(new Reforcado(new Afiado((new Espada()))));
		return personagem;
	}

	@Override
	public Personagem criarArqueiro() {
		Personagem personagem = new Personagem(Tamanho.PEQUENO, new AtaqueForte(), Defesa.FRACA, TipoPersonagem.ARQUEIRO);
		personagem.setArma(new Reforcado(new ArcoEFlecha()));
		return personagem;
	}

	@Override
	public Personagem criarLanceiro() {
		Personagem personagem = new Personagem(Tamanho.MEDIO, new AtaqueMedio(), Defesa.MEDIA, TipoPersonagem.LANCEIRO);
		personagem.setArma(new Afiado(new Lanca()));
		return personagem;
	}

	@Override
	public String getNomeFactory() {
		return nomeFactory;
	}

}
