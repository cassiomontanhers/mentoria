package arma;

public class ElementoFogo extends ArmaDecorator{

	public ElementoFogo(Arma arma) {
		super(arma);
		nome = " de Fogo";
		dano = 10;
	}

}
