package state;

public class ConstituicaoNenhuma implements ConstituicaoState {

	@Override
	public int getValorConstituicao() {
		return 0;
	}

	@Override
	public String getDescricaoConstituicao() {
		return "Nenhuma";
	}

	@Override
	public ConstituicaoState getProximoEstado() {
		return new ConstituicaoMuitoBaixa();
	}

	@Override
	public ConstituicaoState getEstadoAnterior() {
		return this;
	}

}
