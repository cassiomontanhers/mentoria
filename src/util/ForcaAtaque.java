package util;

public enum ForcaAtaque {

	FORTE("forte"),
	FRACO("fraco");
	
	private String forca;
	
	ForcaAtaque(String forca){
		this.forca = forca;
	}
	
	public String getForcaAtaque(){
		return this.forca;
	}
}
