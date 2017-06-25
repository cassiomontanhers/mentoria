package arma;

public class ArmaDecorator implements Arma{

	Arma arma;
	private String nome;
	private int ataque;
	
	public ArmaDecorator(Arma arma){
		this.arma = arma;
	}

	@Override
	public int PoderDeAtaque() {
		return this.arma.PoderDeAtaque() + this.ataque;
	}

	@Override
	public String Descricao() {
		return this.arma.Descricao() + this.nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	
}
