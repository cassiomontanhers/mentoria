package observer;

import Exercito.Exercito;

public class ExercitoObserver extends Observer {

	private Exercito exercito;

	public ExercitoObserver(Ambiente ambiente, Exercito exercito) {
		super(ambiente);
		this.exercito = exercito;
	}

	@Override
	public void update() {
		updateMoral();
	}

	private void updateMoral() {
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
