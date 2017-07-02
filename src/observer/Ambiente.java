package observer;

import java.util.ArrayList;
import java.util.List;

public class Ambiente {
	
	private List<Observer> observers = new ArrayList<>();
	private Clima clima;

	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void detach(int indice) {
		observers.remove(indice);
	}

	private void notifyObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

	public Clima getClima() {
		return clima;
	}

	public void setClima(Clima clima) {
		this.clima = clima;
		notifyObservers();
	}
	
}
