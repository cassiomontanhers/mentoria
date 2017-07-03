package util;

public enum NumerosMagicos {

	ZERO(0),
	UM(1),
	DOIS(2),
	TRES(3),
	CINCO(5),
	DEZ(10);

	private int valor;

	NumerosMagicos(int valor){
		this.valor = valor;
	}

	public int getValor(){
		return this.valor;
	}

}
