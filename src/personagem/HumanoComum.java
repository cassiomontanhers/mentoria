package personagem;

import state.ConstituicaoState;
import util.Defesa;
import util.TipoPersonagem;

public class HumanoComum extends Personagem{

	public HumanoComum(ConstituicaoState tamanho, Ataque ataque, Defesa defesa, TipoPersonagem tipoPersonagem) {
		super(tamanho, ataque, defesa, tipoPersonagem);
	}

}
