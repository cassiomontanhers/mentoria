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
import state.ConstituicaoBoa;
import state.ConstituicaoMedia;
import state.ConstituicaoMuitoBoa;
import util.Defesa;
import util.TipoPersonagem;

public class BritanicosFactory implements PersonagemFactory{

	private String nomeFactory = "Britanicos";

	@Override
	public HumanoComum criarGuerreiro() {
		HumanoComum personagem = new HumanoComum(new ConstituicaoBoa(), new AtaqueMedio(), Defesa.BOA, TipoPersonagem.GUERREIRO);
		personagem.setArma(new Reforcado(new Afiado((new Espada()))));
		return personagem;
	}

	@Override
	public HumanoComum criarArqueiro() {
		HumanoComum personagem = new HumanoComum(new ConstituicaoMedia(), new AtaqueForte(), Defesa.FRACA, TipoPersonagem.ARQUEIRO);
		personagem.setArma(new Reforcado(new ArcoEFlecha()));
		return personagem;
	}

	@Override
	public HumanoComum criarLanceiro() {
		HumanoComum personagem = new HumanoComum(new ConstituicaoBoa(), new AtaqueMedio(), Defesa.MEDIA, TipoPersonagem.LANCEIRO);
		personagem.setArma(new Afiado(new Lanca()));
		return personagem;
	}

	@Override
	public String getNomeFactory() {
		return nomeFactory;
	}

	@Override
	public HumanoHeroi criarHeroi() {
		HumanoHeroi heroi = new HumanoHeroi(new ConstituicaoMuitoBoa(), new AtaqueForte(), Defesa.MUITO_BOA, TipoPersonagem.HEROI);
		heroi.setArma(new PoderArmaAdapter(new PoderIluminado()));
		return heroi;
	}

}
