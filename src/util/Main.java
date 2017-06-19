package util;

import personagem.Personagem;

public class Main {

	public static void main(String[] args) {

		
		Personagem guerreiro = new Personagem(Tamanho.MEDIO,ForcaAtaque.FORTE, "Guerreiro");
		
		Personagem aldeao = new Personagem(Tamanho.GRANDE,ForcaAtaque.FRACO, "Aldeao");
		
		guerreiro.Atacar();
		aldeao.Atacar();
		
		
	}

}
