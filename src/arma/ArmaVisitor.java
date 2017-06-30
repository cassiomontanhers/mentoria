package arma;

public interface ArmaVisitor {

	public String accept(Reforcado reforcado);

	public String accept(Afiado afiado);

	public String accept(Arma afiado);

}
