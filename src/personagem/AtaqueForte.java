package personagem;

import util.NumerosMagicos;

public class AtaqueForte implements Ataque{

	@Override
	public Integer atacar(Personagem personagem) {
		return Math.multiplyExact(personagem.getTamanho().getValor(), NumerosMagicos.DOIS.getValor());
	}

}
