package state;

public interface ConstituicaoState {

	int getValorConstituicao();

	String getDescricaoConstituicao();

	ConstituicaoState getProximoEstado();

	ConstituicaoState getEstadoAnterior();

}
