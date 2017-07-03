package state;

public class ConstituicaoMuitoBoa implements ConstituicaoState{

	@Override
	public int getValorConstituicao() {
		return 25;
	}

	@Override
	public String getDescricaoConstituicao() {
		return "Muito Boa";
	}

	@Override
	public ConstituicaoState getProximoEstado() {
		return this;
	}

	@Override
	public ConstituicaoState getEstadoAnterior() {
		return new ConstituicaoBoa();
	}

}
