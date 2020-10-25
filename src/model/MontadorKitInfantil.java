package model;

public class MontadorKitInfantil implements Montador {
	
	private Pedido pedidoAtual;
	
	@Override
	public void comecarNovoPedido() {
		pedidoAtual = new Pedido();
	}
	
	@Override
	public void montarParteDeDentro(Sanduiche sanduiche, Batata batata) {
		pedidoAtual.adicionarDentroDaCaixa(sanduiche.toString());
		pedidoAtual.adicionarDentroDaCaixa(batata.toString());
	}
	
	@Override
	public void montarParteDeFora(Bebida bebida, Brinquedo brinquedo) {
		pedidoAtual.adicionarForaDaCaixa(bebida.toString());
		pedidoAtual.adicionarForaDaCaixa(brinquedo.toString());
	}
	
	@Override
	public Pedido colocarPedidoNoBalcao() {
		return pedidoAtual;
	}
	


}
