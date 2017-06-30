package arma;

public class ArcoEFlecha extends ArmaBase{

	public ArcoEFlecha(){
		setNome("Arco e Flecha");
		setAtaque(25);
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
