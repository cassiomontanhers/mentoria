package factory;

import adapter.PoderArmaAdapter;
import arma.Afiado;
import arma.ArcoEFlecha;
import arma.Espada;
import arma.Lanca;
import arma.Reforcado;
import personagem.AtaqueForte;
import personagem.AtaqueMedio;
import personagem.HumanoComum;
import personagem.HumanoHeroi;
import poder.PoderIluminado;
import util.Defesa;
import util.Tamanho;
import util.TipoPersonagem;

public class BritanicosFactory implements PersonagemFactory{
	
	private String nomeFactory = "Britanicos";
	
	@Override
	public HumanoComum criarGuerreiro() {
		HumanoComum personagem = new HumanoComum(Tamanho.MEDIO, new AtaqueMedio(), Defesa.BOA, TipoPersonagem.GUERREIRO);
		personagem.setArma(new Reforcado(new Afiado((new Espada()))));
		return personagem;
	}

	@Override
	public HumanoComum criarArqueiro() {
		HumanoComum personagem = new HumanoComum(Tamanho.PEQUENO, new AtaqueForte(), Defesa.FRACA, TipoPersonagem.ARQUEIRO);
		personagem.setArma(new Reforcado(new ArcoEFlecha()));
		return personagem;
	}

	@Override
	public HumanoComum criarLanceiro() {
		HumanoComum personagem = new HumanoComum(Tamanho.MEDIO, new AtaqueMedio(), Defesa.MEDIA, TipoPersonagem.LANCEIRO);
		personagem.setArma(new Afiado(new Lanca()));
		return personagem;
	}

	@Override
	public String getNomeFactory() {
		return nomeFactory;
	}

	@Override
	public HumanoHeroi criarHeroi() {
		HumanoHeroi heroi = new HumanoHeroi(Tamanho.GRANDE, new AtaqueForte(), Defesa.MUITO_BOA, TipoPersonagem.HEROI);
		heroi.setArma(new PoderArmaAdapter(new PoderIluminado()));
		return heroi;
	}

}
