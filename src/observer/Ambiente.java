package observer;

import java.util.ArrayList;
import java.util.List;

public class Ambiente {

	private List<AmbienteObserver> observers = new ArrayList<>();
	private Clima clima;

	public void attach(AmbienteObserver observer) {
		observers.add(observer);
	}

	public void detach(int indice) {
		observers.remove(indice);
	}

	private void notifyObservers() {
		for (AmbienteObserver observer : observers) {
			observer.update(this);
		}
	}

	public Clima getClima() {
		return clima;
	}

	public void setClima(Clima clima) {
		this.clima = clima;
		System.out.println("---------------------------------------CLIMA "+clima.getClass().getSimpleName()+"---------------------------------------");
		notifyObservers();
	}

}
