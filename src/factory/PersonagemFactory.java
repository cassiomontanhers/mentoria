package factory;

import personagem.HumanoComum;
import personagem.HumanoHeroi;

public interface PersonagemFactory {
	HumanoComum criarGuerreiro();
	HumanoComum criarArqueiro();
	HumanoComum criarLanceiro();
	HumanoHeroi criarHeroi();
	String getNomeFactory();
}
