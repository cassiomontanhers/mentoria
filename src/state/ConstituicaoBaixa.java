package state;

public class ConstituicaoBaixa implements ConstituicaoState {

	@Override
	public int getValorConstituicao() {
		return 10;
	}

	@Override
	public String getDescricaoConstituicao() {
		return "Baixa";
	}

	@Override
	public ConstituicaoState getProximoEstado() {
		return new ConstituicaoMedia();
	}

	@Override
	public ConstituicaoState getEstadoAnterior() {
		return new ConstituicaoMuitoBaixa();
	}

}
