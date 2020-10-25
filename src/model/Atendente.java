package model;

public class Atendente {
	
	private Montador montador;
	
	public Pedido solicitarKitInfantil(Sanduiche sanduiche, Batata batata, Bebida bebida, Brinquedo brinquedo) {
		montador = new Montador();
		montador.comecarNovoPedido();
		montador.montarParteDeDentro(sanduiche, batata);
		montador.montarParteDeFora(bebida, brinquedo);
		return montador.colocarPedidoNoBalcao();
	}

}
