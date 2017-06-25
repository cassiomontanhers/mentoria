package personagem;

import util.NumerosMagicos;

public class AtaqueForte implements Ataque{

	@Override
	public Integer atacar(Personagem personagem) {
		return Math.multiplyExact(personagem.getTamanho().getValor(), NumerosMagicos.TRES.getValor());
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
