package state;

public class ConstituicaoMuitoBaixa implements ConstituicaoState {

	@Override
	public int getValorConstituicao() {
		return 5;
	}

	@Override
	public String getDescricaoConstituicao() {
		return "Muito Baixa";
	}

	@Override
	public ConstituicaoState getProximoEstado() {
		return new ConstituicaoBaixa();
	}

	@Override
	public ConstituicaoState getEstadoAnterior() {
		return new ConstituicaoNenhuma();
	}

}
