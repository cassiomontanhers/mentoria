package observer;

public abstract class Observer {

	Ambiente ambiente;
	
	public Observer(Ambiente ambiente) {
		this.ambiente = ambiente;
	}
	
	public abstract void update();

}
