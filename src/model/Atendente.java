package model;

public class Atendente {
	
	private Montador montador;
	
	public Pedido solicitarKitInfantil(Sanduiche sanduiche, Batata batata, Bebida bebida, Brinquedo brinquedo) {
		montador = new MontadorKitInfantil();
		montador.comecarNovoPedido();
		montador.montarParteDeDentro(sanduiche, batata, brinquedo);
		montador.montarParteDeFora(bebida);
		return montador.colocarPedidoNoBalcao();
	}

}
