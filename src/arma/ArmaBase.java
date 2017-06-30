package arma;

public class ArmaBase implements Arma{

	private String nome;
	private int ataque;

	@Override
	public int PoderDeAtaque() {
		return this.getAtaque();
	}

	@Override
	public String Descricao() {
		return this.getNome();
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

	@Override
	public String visit(ArmaVisitor visitor) {
		return visitor.accept(this);
	}

}
