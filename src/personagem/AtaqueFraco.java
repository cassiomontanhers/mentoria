package personagem;

import util.NumerosMagicos;

public class AtaqueFraco implements Ataque{

	@Override
	public Integer atacar(Personagem personagem) {
		return Math.multiplyExact(personagem.getTamanho().getValor(), NumerosMagicos.UM.getValor());
	}
	
}
