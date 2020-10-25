package model;

public class Sanduiche {
	
	private TipoSanduiche tipo;
	
	public Sanduiche(TipoSanduiche tipo) {
		this.tipo = tipo;
	}
	

	@Override
	public String toString() {
		return this.tipo.toString();
	}

	
}
