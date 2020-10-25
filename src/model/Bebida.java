package model;

public class Bebida {
	
	private TipoBebida tipo;
	
	public Bebida(TipoBebida tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return tipo.toString();
	}
	
	

}
