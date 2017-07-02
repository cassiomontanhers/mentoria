package util;

public enum Dificuldade {
	
	FACIL(1),
	MEDIA(2),
	DIFICIL(3);
	
	private int valor;
	
	Dificuldade(int valor){
		this.valor = valor;
	}
	
	public int getValor(){
		return this.valor;
	}

}
