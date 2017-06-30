
public class Sayadin implements Estado {

	@Override
	public int getForca() {
		return 10;
	}

	@Override
	public String getAparencia() {
		return "Sayadin";
	}

	@Override
	public Estado getProximoEstado() {
		return new SuperSayadin();
	}

}
