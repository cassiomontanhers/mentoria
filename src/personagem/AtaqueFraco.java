package personagem;

import util.NumerosMagicos;

public class AtaqueFraco implements Ataque{

	@Override
	public Integer atacar(Personagem personagem) {
		return Math.multiplyExact(personagem.getTamanho().getValor(), NumerosMagicos.UM.getValor());
	}
	
	@Override
	public Integer atacarComArma(Personagem personagem) {
		if(personagem.getArma() != null){
			return this.atacar(personagem) + personagem.getArma().getDano();			
		}
		System.out.println("O " + personagem.getNome() + " não possui arma, ele ira atacar desarmado.");
		return this.atacar(personagem);
	}
	
}
