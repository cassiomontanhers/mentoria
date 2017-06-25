package arma;

public class ArcoEFlecha implements Arma{

	private String nome = "Arco e Flecha";
	private int ataque = 25;
	
	@Override
	public int PoderDeAtaque() {
		return ataque;
	}

	@Override
	public String Descricao() {
		return nome;
	}
	
}
