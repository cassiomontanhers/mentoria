package arma;

public class Espada implements Arma{
	
	private String nome = "Espada";
	private int ataque = 10;
	
	public Espada(){
	}

	@Override
	public int PoderDeAtaque() {
		return this.ataque;
	}

	@Override
	public String Descricao() {
		return this.nome;
	}

}
