package factory;

import adapter.PoderArmaAdapter;
import arma.Afiado;
import arma.ArcoEFlecha;
import arma.Lanca;
import arma.Machado;
import personagem.AtaqueForte;
import personagem.AtaqueFraco;
import personagem.AtaqueMedio;
import personagem.HumanoComum;
import personagem.HumanoHeroi;
import poder.PoderIluminado;
import util.Defesa;
import util.Tamanho;
import util.TipoPersonagem;

public class BarbaroFactory implements PersonagemFactory{
	
	private String nomeFactory = "Barbaro";

	@Override
	public HumanoComum criarGuerreiro() {
		HumanoComum personagem = new HumanoComum(Tamanho.GRANDE, new AtaqueForte(), Defesa.FRACA, TipoPersonagem.GUERREIRO);
		personagem.setArma(new Afiado(new Machado()));
		return personagem;
	}

	@Override
	public HumanoComum criarArqueiro() {
		HumanoComum personagem = new HumanoComum(Tamanho.MEDIO, new AtaqueFraco(), Defesa.MUITO_FRACA, TipoPersonagem.ARQUEIRO);
		personagem.setArma(new ArcoEFlecha());
		return personagem;
	}

	@Override
	public HumanoComum criarLanceiro() {
		HumanoComum personagem = new HumanoComum(Tamanho.MEDIO, new AtaqueMedio(), Defesa.FRACA, TipoPersonagem.LANCEIRO);
		personagem.setArma(new Lanca());
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
