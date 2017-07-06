package Exercito;

import java.util.ArrayList;
import java.util.List;

import arma.Afiado;
import arma.Arma;
import arma.ArmaVisitor;
import arma.Reforcado;
import observer.Ambiente;
import observer.AmbienteObserver;
import personagem.Personagem;
import poder.Poder;
import state.MoralNormal;
import state.MoralState;

public class Exercito implements AmbienteObserver {

	private List<Personagem> personagensList = new ArrayList<>();
	private String nomeExercito;
	private MoralState moralState;

	public Exercito(String nome){
		this.setNomeExercito(nome);
		this.moralState = new MoralNormal();
	}

	public void addPersonagemNoExercito(Personagem personagem){
		getPersonagens().add(personagem);
	}

	public void addPersonagemNoExercito(List<Personagem> personagens) {
		personagensList.addAll(personagens);
	}

	public void info(){

		int forcaAtaqueDoExercitoMoral = 0;
		int forcaAtaqueDoExercito = 0;
		int defesaDoExercito = 0;

		int quantidadeArqueiros = 0;
		int quantidadeGuerreiro = 0;
		int quantidadeLanceiros = 0;
		int quantidadeHeroi = 0;

		for (Personagem personagem : getPersonagens()) {

			forcaAtaqueDoExercito += personagem.getPoderDeAtaque();
			forcaAtaqueDoExercitoMoral += personagem.getPoderDeAtaque()+moralState.getForcaMoral();

			defesaDoExercito += personagem.getDefesa().getValor();

			switch (personagem.getTipoPersonagem()) {
			case ARQUEIRO:
				quantidadeArqueiros++;
				break;
			case GUERREIRO:
				quantidadeGuerreiro++;
				break;
			case LANCEIRO:
				quantidadeLanceiros++;
				break;
			case HEROI:
				quantidadeHeroi++;
				break;
			default:
				break;
			}

		}

		System.out.println(" -- INFO EXERCITO "+getNomeExercito()+" -- ");
		System.out.println("Moral Exercito : " + moralState.getDescricaoMoral());
		System.out.println("Tamanho do exercito : " + this.getPersonagens().size());
		System.out.println("    Guerreiros : "+	quantidadeGuerreiro);
		System.out.println("    Arqueiros : "+	quantidadeArqueiros);
		System.out.println("    Lanceiros : "+	quantidadeLanceiros);
		System.out.println("    HEROI : "+	quantidadeHeroi);
		System.out.println("Força do exercito : " + forcaAtaqueDoExercito);
		System.out.println("Força do exercito + Moral : " + forcaAtaqueDoExercitoMoral);
		System.out.println("Defesa do exercito : "+ defesaDoExercito);

	}

	public void showArmasExercito(){

		System.out.println("---------------------------------------ARMAS DOS PERSONAGENS DO EXERCITO "+nomeExercito+"---------------------------------------");

		personagensList.stream()
		.map(p -> {
			return p.getArma().visit(new ArmaVisitor() {

				@Override
				public String accept(Arma arma) {
					return arma.getClass().getSimpleName();
				}

				@Override
				public String accept(Afiado afiado) {
					return afiado.getClass().getSimpleName();
				}

				@Override
				public String accept(Reforcado reforcado) {
					return reforcado.getClass().getSimpleName();
				}

				@Override
				public String accept(Poder poder) {
					return poder.getClass().getSimpleName();
				}

			});

		}).forEach(System.out::println);
	}

	public List<Personagem> getPersonagens() {
		return personagensList;
	}

	public void setPersonagens(List<Personagem> personagens) {
		this.personagensList = personagens;
	}

	public void ganharMoral(){
		this.moralState = this.moralState.getProximoEstado();
		updateMoralPersonagens();
	}

	public void perderMoral(){
		this.moralState = this.moralState.getEstadoAnterior();
		updateMoralPersonagens();
	}

	private void updateMoralPersonagens() {
		for (Personagem personagem : personagensList) {
			personagem.setMoral(this.moralState);
		}
	}

	public String getNomeExercito() {
		return nomeExercito;
	}

	public void setNomeExercito(String nomeExercito) {
		this.nomeExercito = nomeExercito;
	}

	@Override
	public void update(Ambiente ambiente) {
		switch (ambiente.getClima().getDificuldade()) {
		case DIFICIL:
			this.perderMoral();
			break;
		case MEDIA:
			break;
		case FACIL:
			this.ganharMoral();
			break;
		default:
			break;
		}

	}

}
