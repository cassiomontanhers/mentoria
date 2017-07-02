package state;

public interface MoralState {

	int getForcaMoral();

	String getDescricaoMoral();
	
	MoralState getProximoEstado();
	
	MoralState getEstadoAnterior();

}
