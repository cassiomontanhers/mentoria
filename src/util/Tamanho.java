package util;

public enum Tamanho {

	GRANDE(3),
	MEDIO(2),
	PEQUENO(1);
	
	private Integer valor;
	
	Tamanho(Integer tamanho){
		this.valor = tamanho;
	}

	public Integer getValor() {
		return valor;
	}

}
