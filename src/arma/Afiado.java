package arma;

public class Afiado extends ReforcoArma{

	public Afiado(Arma arma) {
		super(arma);
		this.setNome(" Afiado");
		this.setAtaque(7);
	}

	@Override
	public String visit(ArmaVisitor visitor) {
		return  this.arma.visit(visitor)+ " -> "+visitor.accept(this);
	}

}
