package arma;

public class Machado extends ArmaBase{

	
	public Machado(){
		setNome("Machado");
		setAtaque(20);
	}
	
	@Override
	public int PoderDeAtaque() {
		return getAtaque();
	}

	@Override
	public String Descricao() {
		return getNome();
	}

}
