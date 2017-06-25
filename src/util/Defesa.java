package util;

public enum Defesa {

	MUITO_BOA(60),
	BOA(50),
	MEDIA(40),
	FRACA(30),
	MUITO_FRACA(20),
	NENHUMA(10);
	
	private int defesa;
	
	Defesa(int defesa){
		this.defesa = defesa;
	}
	
	public int getValor(){
		return this.defesa;
	}
	
}
