package factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Exercito.Exercito;
import personagem.HumanoHeroi;
import personagem.Personagem;

public class ExercitoFactory {

	Random random = new Random();

	public Exercito montarExercito(PersonagemFactory fabrica) {

		Exercito exercito = gerarPersonagens(fabrica);
		inserirHeroi(fabrica, exercito);
		inserirMoral(exercito);
		return exercito;
	}

	private Exercito gerarPersonagens(PersonagemFactory fabrica) {
		Exercito exercito = new Exercito(fabrica.getNomeFactory());

		exercito.addPersonagemNoExercito(cria(fabrica::criarGuerreiro));
		exercito.addPersonagemNoExercito(cria(fabrica::criarArqueiro));
		exercito.addPersonagemNoExercito(cria(fabrica::criarLanceiro));
		return exercito;
	}

	private void inserirHeroi(PersonagemFactory fabrica, Exercito exercito) {
		if(exercito.getPersonagens().size() < 15){
			exercito.addPersonagemNoExercito(fabrica.criarHeroi());
		}
	}

	private void inserirMoral(Exercito exercito) {
		
		for(Personagem personagem : exercito.getPersonagens()){
			if (personagem instanceof HumanoHeroi){
				exercito.ganharMoral();
			}
		}
		
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
