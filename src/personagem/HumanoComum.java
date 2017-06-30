package personagem;

import util.Defesa;
import util.Tamanho;
import util.TipoPersonagem;

public class HumanoComum extends Personagem{

	public HumanoComum(Tamanho tamanho, Ataque ataque, Defesa defesa, TipoPersonagem tipoPersonagem) {
		super(tamanho, ataque, defesa, tipoPersonagem);
	}

}
