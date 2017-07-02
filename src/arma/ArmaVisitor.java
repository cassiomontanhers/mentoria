package arma;

import poder.Poder;

public interface ArmaVisitor {

	public String accept(Reforcado reforcado);

	public String accept(Afiado afiado);

	public String accept(Arma afiado);

	public String accept(Poder poder);

}
