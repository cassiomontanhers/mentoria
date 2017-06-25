package Controller;

import java.util.Random;

import Exercito.Exercito;
import factory.PersonagemFactory;

public class ExercitoController {

	Random random = new Random();
	
	public Exercito montarExercito(PersonagemFactory fabrica) {

		Exercito exercito = new Exercito(fabrica.getNomeFactory());

		gerarGuerriros(exercito, fabrica);
		gerarArqueiros(exercito, fabrica);
		gerarLanceiros(exercito, fabrica);
		
		return exercito;
	}

	private void gerarLanceiros(Exercito exercito, PersonagemFactory fabrica) {
		int range = 10 - 1 + 1;
		int quantidade =  random.nextInt(range) + 1;

		for (int i = 0; i < quantidade; i++) {
			exercito.addPersonagemNoExercito(fabrica.criarLanceiro());
		}
	}

	private void gerarArqueiros(Exercito exercito, PersonagemFactory fabrica) {
		int range = 10 - 1 + 1;
		int quantidade =  random.nextInt(range) + 1;

		for (int i = 0; i < quantidade; i++) {
			exercito.addPersonagemNoExercito(fabrica.criarArqueiro());
		}
	}

	private void gerarGuerriros(Exercito exercito, PersonagemFactory fabrica) {
		int range = 10 - 1 + 1;
		int quantidade =  random.nextInt(range) + 1;

		for (int i = 0; i < quantidade; i++) {
			exercito.addPersonagemNoExercito(fabrica.criarGuerreiro());
		}
	}

	
}
