
public class Goku {

	private Estado estado = new EstadoNormal();

	public int getForca() {
		return estado.getForca();
	}

	public String getAparencia() {
		return estado.getAparencia();
	}

	public void evoluir() {
		this.estado = estado.getProximoEstado();
		System.out.println("Goku evoluiu para "+estado.getAparencia());
	}

}
