package state;

public class ConstituicaoBoa implements ConstituicaoState{

	@Override
	public int getValorConstituicao() {
		return 20;
	}

	@Override
	public String getDescricaoConstituicao() {
		return "Boa";
	}

	@Override
	public ConstituicaoState getProximoEstado() {
		return new ConstituicaoMuitoBoa();
	}

	@Override
	public ConstituicaoState getEstadoAnterior() {
		return new ConstituicaoMedia();
	}


}
