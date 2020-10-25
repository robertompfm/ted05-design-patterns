package model;

public interface Montador {

	public void comecarNovoPedido();
	
	public void montarParteDeDentro(Sanduiche sanduiche, Batata batata);
	
	public void montarParteDeFora(Bebida bebida, Brinquedo brinquedo);
	
	public Pedido colocarPedidoNoBalcao();
}
