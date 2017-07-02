package adapter;

import arma.Arma;
import arma.ArmaVisitor;
import poder.Poder;

public class PoderArmaAdapter implements Arma{

	private Poder poder;

	public PoderArmaAdapter(Poder poder){
		this.poder = poder;
	}

	@Override
	public int PoderDeAtaque() {
		return poder.getPoderDeMagia();
	}

	@Override
	public String Descricao() {
		return poder.getDescricao();
	}

	@Override
	public String visit(ArmaVisitor visitor) {
		return visitor.accept(this.poder);
	}

}
