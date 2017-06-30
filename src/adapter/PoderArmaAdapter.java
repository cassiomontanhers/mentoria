package adapter;

import arma.Arma;
import poder.Poder;

public class PoderArmaAdapter extends Poder implements Arma{
	
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

}
