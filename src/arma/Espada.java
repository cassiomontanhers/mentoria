package arma;

public class Espada extends ArmaBase{
	
	
	public Espada(){
		setNome("Espada");
		setAtaque(10);
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
