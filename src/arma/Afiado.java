package arma;

public class Afiado extends ArmaDecorator{

	public Afiado(Arma arma) {
		super(arma);
		this.setNome(" Afiado");
		this.setAtaque(7);
	}

}
