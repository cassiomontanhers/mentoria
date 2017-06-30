package arma;

public interface Arma {

	public int PoderDeAtaque();

	public String Descricao();

	public String visit(ArmaVisitor visitor);

}
