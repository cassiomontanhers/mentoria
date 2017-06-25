package arma;

public class Reforcado extends ArmaDecorator{

	public Reforcado(Arma arma) {
		super(arma);
		this.setAtaque(5);
		this.setNome(" Reforçado");
	}

}
