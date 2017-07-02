package arma;

public class Reforcado extends ReforcoArma{

	public Reforcado(Arma arma) {
		super(arma);
		this.setAtaque(5);
		this.setNome(" Refor�ado");
	}

	@Override
	public String visit(ArmaVisitor visitor) {
		return  this.arma.visit(visitor)+ " -> "+visitor.accept(this);
	}


}
