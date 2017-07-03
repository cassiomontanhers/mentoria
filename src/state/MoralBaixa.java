package state;

import util.NumerosMagicos;

public class MoralBaixa implements MoralState{

	private String descricaoMoral = "Moral Baixa";

	@Override
	public int getForcaMoral() {
		return -NumerosMagicos.CINCO.getValor();
	}

	@Override
	public String getDescricaoMoral() {
		return descricaoMoral;
	}

	@Override
	public MoralState getProximoEstado() {
		return new MoralNormal();
	}

	@Override
	public MoralState getEstadoAnterior() {
		return this;
	}

}
