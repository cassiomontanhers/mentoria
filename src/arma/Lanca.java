package arma;

public class Lanca implements Arma {

	private String nome = "Lança";
	private int ataque = 15;
	
	public Lanca(){
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
