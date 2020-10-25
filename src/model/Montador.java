package model;

public class Montador {
	
	private Pedido pedidoAtual;
	
	
	public void comecarNovoPedido() {
		pedidoAtual = new Pedido();
	}
	
	public void montarParteDeDentro(Sanduiche sanduiche, Batata batata) {
		pedidoAtual.adicionarDentroDaCaixa(sanduiche.toString());
		pedidoAtual.adicionarDentroDaCaixa(batata.toString());
	}
	
	public void montarParteDeFora(Bebida bebida, Brinquedo brinquedo) {
		pedidoAtual.adicionarForaDaCaixa(bebida.toString());
		pedidoAtual.adicionarForaDaCaixa(brinquedo.toString());
	}
	
	public Pedido colocarPedidoNoBalcao() {
		return pedidoAtual;
	}
	


}
