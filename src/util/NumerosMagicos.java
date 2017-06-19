package util;

public enum NumerosMagicos {
	
	UM(1),
	DOIS(2),
	TRES(3);
	
	private int valor;
	
	NumerosMagicos(int valor){
		this.valor = valor;
	}

	public int getValor(){
		return this.valor;
	}

}
