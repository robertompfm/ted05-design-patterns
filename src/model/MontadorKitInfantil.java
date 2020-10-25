package model;

public class MontadorKitInfantil implements Montador {
	
	private Pedido pedidoAtual;
	
	@Override
	public void comecarNovoPedido() {
		pedidoAtual = new Pedido();
	}
	
	@Override
	public void montarParteDeDentro(Sanduiche sanduiche, Batata batata, Brinquedo brinquedo) {
		pedidoAtual.adicionarDentroDaCaixa(sanduiche.toString());
		pedidoAtual.adicionarDentroDaCaixa(batata.toString());
		pedidoAtual.adicionarDentroDaCaixa(brinquedo.toString());
	}
	
	@Override
	public void montarParteDeFora(Bebida bebida) {
		pedidoAtual.adicionarForaDaCaixa(bebida.toString());
	}
	
	@Override
	public Pedido colocarPedidoNoBalcao() {
		return pedidoAtual;
	}
	


}
