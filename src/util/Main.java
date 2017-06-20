package util;

import arma.Arma;
import arma.ElementoFogo;
import arma.ElementoVento;
import arma.Espada;
import arma.Lanca;
import personagem.Personagem;

public class Main {

	public List<Personagem> montaExercito(FabricaPersonagem fabrica) {

		resultado.add(fabrica.criaGuerreiro());
		resultado.add(fabrica.criaLanceiro());
		resultado.add(fabrica.criaCavaleiro());
		return resultado;
	}

	public void criaExercitos() {
		exercitoIngles = montaExercito(new FabricaIngles());
		exercitoSaxonico = montaExercito(new FabricaSaxonico());
	}


	public static void main(String[] args) {







		//CRIANDO OS 2 PERSONAGENS
		Personagem guerreiro = new Personagem(Tamanho.MEDIO,ForcaAtaque.FORTE, "Guerreiro");
		Personagem aldeao = new Personagem(Tamanho.GRANDE,ForcaAtaque.FRACO, "Aldeao");

		//ATACANDO
		guerreiro.Atacar();
		aldeao.Atacar();

		//CRIANDO UMA ESPADA DE FOGO PARA O GUERREIRO
		Arma espadaDeFogo = new ElementoFogo(new Espada());
		guerreiro.setArma(espadaDeFogo);

		//GUERREIRO ATACANDO COM ARMA
		guerreiro.AtacarComArma();

		//ALDEAO ATACANDO COM ARMA COMUM
		aldeao.setArma(new Espada());
		aldeao.AtacarComArma();

		//ALDEAO ATACANDO COM ARMA MELHORADA
		aldeao.setArma(new ElementoVento(aldeao.getArma()));
		aldeao.AtacarComArma();

		//ALDEAO ATACANDO COM NOVA ARMA
		aldeao.setArma(new ElementoVento(new Lanca()));
		aldeao.AtacarComArma();


	}

}
