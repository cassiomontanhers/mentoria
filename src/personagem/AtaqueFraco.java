package personagem;

public class AtaqueFraco implements Ataque{

	@Override
	public Integer atacar(Personagem personagem) {
		return Math.abs(personagem.getConstituicao().getValorConstituicao()/10)+1;
	}

	@Override
	public Integer atacarComArma(Personagem personagem) {
		if(personagem.getArma() != null){
			return this.atacar(personagem) + personagem.getArma().PoderDeAtaque();
		}
		System.out.println("O " + personagem.getNome() + " não possui arma, ele ira atacar desarmado.");
		return this.atacar(personagem);
	}

}
