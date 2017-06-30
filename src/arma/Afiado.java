package arma;

public class Afiado extends ReforcoArma{

	public Afiado(Arma arma) {
		super(arma);
		this.setNome(" Afiado");
		this.setAtaque(7);
	}

	@Override
	public String visit(ArmaVisitor visitor) {
		return visitor.accept(this) + " -> "+this.arma.visit(visitor);
	}

}
