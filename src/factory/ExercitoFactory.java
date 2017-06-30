package factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Exercito.Exercito;
import personagem.Personagem;

public class ExercitoFactory {

	Random random = new Random();

	public Exercito montarExercito(PersonagemFactory fabrica) {

		Exercito exercito = new Exercito(fabrica.getNomeFactory());

		exercito.addPersonagemNoExercito(cria(fabrica::criarGuerreiro));
		exercito.addPersonagemNoExercito(cria(fabrica::criarArqueiro));
		exercito.addPersonagemNoExercito(cria(fabrica::criarLanceiro));

		if(exercito.getPersonagens().size() < 15){
			exercito.addPersonagemNoExercito(fabrica.criarHeroi());
		}

		return exercito;
	}

	private List<Personagem> cria(java.util.function.Supplier<Personagem> supplier) {
		int range = 10 - 1 + 1;
		int quantidade =  random.nextInt(range) + 1;
		List<Personagem> result = new ArrayList<Personagem>();

		for (int i = 0; i < quantidade; i++) {
			result.add(supplier.get());
		}
		return result;
	}

}
