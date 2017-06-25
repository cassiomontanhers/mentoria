package factory;

import personagem.Personagem;

public interface PersonagemFactory {
	Personagem criarGuerreiro();
	Personagem criarArqueiro();
	Personagem criarLanceiro();
	String getNomeFactory();
}
