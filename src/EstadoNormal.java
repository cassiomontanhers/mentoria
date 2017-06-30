
public class EstadoNormal implements Estado {

	@Override
	public int getForca() {
		return 0;
	}

	@Override
	public String getAparencia() {
		return "Normal";
	}

	@Override
	public Estado getProximoEstado() {
		return new Sayadin();
	}

}
