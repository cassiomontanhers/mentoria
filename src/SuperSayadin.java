
public class SuperSayadin implements Estado {

	@Override
	public int getForca() {
		return 20;
	}

	@Override
	public String getAparencia() {
		return "Super Sayadin";
	}

	@Override
	public Estado getProximoEstado() {
		return this;
	}

}
