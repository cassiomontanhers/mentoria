package util;

public enum TipoPersonagem {

	GUERREIRO("Guerreiro"),
	ARQUEIRO("Arqueiro"),
	LANCEIRO("Lanceiro"),
	HEROI("Heroi");
	
	private String tipo;
	
	TipoPersonagem(String tipo){
		this.tipo = tipo;
	}
	
	public String getValor(){
		return this.tipo;
	}
	
}
