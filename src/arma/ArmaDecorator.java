package arma;

public abstract class ArmaDecorator extends Arma{
	
	Arma arma;

	public ArmaDecorator(Arma armaDecorator) {
		arma = armaDecorator;
	}

	
	public String getNome() {
		return arma.getNome() + nome;
	}

	public int getDano() {
		return arma.getDano() + dano;
	}
	
}
