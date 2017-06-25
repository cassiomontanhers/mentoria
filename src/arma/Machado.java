package arma;

public class Machado implements Arma{

	private String nome = "Machado";
	private int ataque = 20;
	
	@Override
	public int PoderDeAtaque() {
		return ataque;
	}

	@Override
	public String Descricao() {
		return nome;
	}

}
