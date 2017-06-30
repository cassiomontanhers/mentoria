package arma;

public class Lanca extends ArmaBase {

	
	public Lanca(){
		setNome("Lança");
		setAtaque(15);
	}

	@Override
	public int PoderDeAtaque() {
		return this.getAtaque();
	}

	@Override
	public String Descricao() {
		return this.getNome();
	}


}
