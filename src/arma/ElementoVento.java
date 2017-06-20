package arma;

public class ElementoVento extends ArmaDecorator {

	public ElementoVento(Arma arma) {
		super(arma);
		nome = " de Vento";
		dano = 5;
	}
	
}
