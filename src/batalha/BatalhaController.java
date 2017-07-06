package batalha;

import java.util.List;
import java.util.stream.Collectors;

import Exercito.Exercito;
import personagem.Personagem;
import state.ConstituicaoNenhuma;
import util.TipoPersonagem;

public class BatalhaController {

	private Exercito exercitoUm;
	private Exercito exercitoDois;

	public void batalhar(Exercito exercitoUm, Exercito exercitoDois){
		this.exercitoUm = exercitoUm;
		this.exercitoDois = exercitoDois;

		System.out.println("+++++++++++++++++++++++++++++++++INICIO DA BATALHA+++++++++++++++++++++++++++++++++");
		combateBatalhao(TipoPersonagem.GUERREIRO);
		combateBatalhao(TipoPersonagem.ARQUEIRO);
		combateBatalhao(TipoPersonagem.LANCEIRO);
		avaliarMoral();

		System.out.println("++++++++++++++++++++++++++++++++RESULTADO DA BATALHA+++++++++++++++++++++++++++++++");

	}

	private void avaliarMoral() {
		if(exercitoUm.getPersonagens().size() != exercitoDois.getPersonagens().size()){
			if(exercitoUm.getPersonagens().size() > exercitoDois.getPersonagens().size()){
				exercitoUm.ganharMoral();
				exercitoDois.perderMoral();
			}else{
				exercitoDois.ganharMoral();
				exercitoUm.perderMoral();
			}
		}
	}

	private void combateBatalhao(TipoPersonagem tipoPersonagem) {

		List<Personagem> personagensUm = (List<Personagem>) exercitoUm.getPersonagens().stream()
		.filter(p -> p.getTipoPersonagem().equals(tipoPersonagem))
		.map(p->p)
		.collect(Collectors.toList());

		List<Personagem> personagensDois = (List<Personagem>) exercitoDois.getPersonagens().stream()
		.filter(p -> p.getTipoPersonagem().equals(tipoPersonagem))
		.map(p->p)
		.collect(Collectors.toList());


		if(personagensUm.size() >= personagensDois.size()){
			for (int i = 0; i < personagensDois.size(); i++) {
				batalharPersonagem(personagensUm.get(i), personagensDois.get(i));
			}
		}else{
			for (int i = 0; i < personagensUm.size(); i++) {
				batalharPersonagem(personagensUm.get(i), personagensDois.get(i));
			}
		}
	}

	private void batalharPersonagem(Personagem personagemUm, Personagem personagemDois) {

		System.out.println("--------------------------------------COMBATE--------------------------------------");

		System.out.println(personagemUm.getNome()+" do exercito "+exercitoUm.getNomeExercito()+ " ataque:");
		int valorDanoAtaqueDoGolpe = personagemUm.atacar(personagemDois);
		aplicarDanoNoPersonagem(personagemDois, valorDanoAtaqueDoGolpe);

		System.out.println(personagemDois.getNome()+" do exercito "+exercitoDois.getNomeExercito()+ " ataque:");
		valorDanoAtaqueDoGolpe = personagemDois.atacar(personagemUm);
		aplicarDanoNoPersonagem(personagemUm, valorDanoAtaqueDoGolpe);

		avaliarMorte(personagemUm, exercitoUm);
		avaliarMorte(personagemDois, exercitoDois);
	}


	private void avaliarMorte(Personagem personagem, Exercito exercito) {
		if(personagem.getConstituicao().getClass().equals(ConstituicaoNenhuma.class)){
			System.out.println(personagem.getNome()+ " do exercito " + exercito.getNomeExercito()+ " morreu. RIP");
			exercito.getPersonagens().remove(personagem);
		}
	}

	private void aplicarDanoNoPersonagem(Personagem personagem, int valorDanoAtaque) {
		int qntDeEstadosConstituicaoParaReduzir = Math.abs(valorDanoAtaque/5);
		for (int i = 0; i < qntDeEstadosConstituicaoParaReduzir; i++) {
			personagem.setConstituicao(personagem.getConstituicao().getEstadoAnterior());
			System.out.println("Personagem "+personagem.getNome() +" teve sua consituicao reduzida a "+personagem.getConstituicao().getDescricaoConstituicao());
		}
	}
}
