package observer;

import Exercito.Exercito;

public class ExercitoObserver implements AmbienteObserver {

	private Exercito exercito;

	public ExercitoObserver(Exercito exercito) {
		super();
		this.exercito = exercito;
	}

	@Override
	public void update(Ambiente ambiente) {
		switch (ambiente.getClima().getDificuldade()) {
		case DIFICIL:
			exercito.perderMoral();
			break;
		case MEDIA:
			break;
		case FACIL:
			exercito.ganharMoral();
			break;
		default:
			break;
		}
	}

	public Exercito getExercito() {
		return exercito;
	}

	public void setExercito(Exercito exercito) {
		this.exercito = exercito;
	}

}
