package personagem;

public class AtaqueMedio implements Ataque{

	@Override
	public Integer atacar(Personagem personagem) {
		return Math.abs(personagem.getConstituicao().getValorConstituicao()/10)+3;
	}

	@Override
	public Integer atacarComArma(Personagem personagem) {
		if(personagem.getArma() != null){
			return this.atacar(personagem) + personagem.getArma().PoderDeAtaque();
		}
		System.out.println("O " + personagem.getNome() + " n�o possui arma, ele ira atacar desarmado.");
		return this.atacar(personagem);
	}

}
