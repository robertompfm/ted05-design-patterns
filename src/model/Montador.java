package model;

public interface Montador {

	public void comecarNovoPedido();
	
	public void montarParteDeDentro(Sanduiche sanduiche, Batata batata, Brinquedo brinquedo);
	
	public void montarParteDeFora(Bebida bebida);
	
	public Pedido colocarPedidoNoBalcao();
}
