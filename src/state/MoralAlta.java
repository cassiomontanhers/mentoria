package state;

import util.NumerosMagicos;

public class MoralAlta implements MoralState{

	private String descricaoMoral = "Moral Alta";

	@Override
	public int getForcaMoral() {
		return NumerosMagicos.CINCO.getValor();
	}

	@Override
	public String getDescricaoMoral() {
		return descricaoMoral;
	}

	@Override
	public MoralState getProximoEstado() {
		return this;
	}

	@Override
	public MoralState getEstadoAnterior() {
		return new MoralNormal();
	}

}
