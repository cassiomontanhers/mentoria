package personagem;

import state.ConstituicaoState;
import util.Defesa;
import util.TipoPersonagem;

public class HumanoHeroi extends Personagem {

	public HumanoHeroi(ConstituicaoState tamanho, Ataque ataque, Defesa defesa, TipoPersonagem tipoPersonagem) {
		super(tamanho, ataque, defesa, tipoPersonagem);
	}

	@Override
	public String getNome(){
		return super.getNome() + " Heroi";
	}

}
