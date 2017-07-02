package state;

import util.NumerosMagicos;

public class MoralNormal implements MoralState{

	private String descricaoMoral = "Moral Normal";
	
	@Override
	public int getForcaMoral() {
		return NumerosMagicos.ZERO.getValor();
	}

	@Override
	public String getDescricaoMoral() {
		return descricaoMoral;
	}

	@Override
	public MoralState getProximoEstado() {
		return new MoralAlta();
	}

	@Override
	public MoralState getEstadoAnterior() {
		return new MoralBaixa();
	}

}
