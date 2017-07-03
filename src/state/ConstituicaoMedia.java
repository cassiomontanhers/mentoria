package state;

public class ConstituicaoMedia implements ConstituicaoState {

	@Override
	public int getValorConstituicao() {
		return 15;
	}

	@Override
	public String getDescricaoConstituicao() {
		return "Media";
	}

	@Override
	public ConstituicaoState getProximoEstado() {
		return new ConstituicaoBoa();
	}

	@Override
	public ConstituicaoState getEstadoAnterior() {
		return new ConstituicaoBaixa();
	}

}
