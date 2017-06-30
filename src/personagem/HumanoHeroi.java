package personagem;

import util.Defesa;
import util.Tamanho;
import util.TipoPersonagem;

public class HumanoHeroi extends Personagem {

	public HumanoHeroi(Tamanho tamanho, Ataque ataque, Defesa defesa, TipoPersonagem tipoPersonagem) {
		super(tamanho, ataque, defesa, tipoPersonagem);
	}
	
	@Override
	public String getNome(){
		return super.getNome() + " Heroi";
	}

}
