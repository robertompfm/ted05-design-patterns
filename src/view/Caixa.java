package view;

import model.Atendente;
import model.Batata;
import model.Bebida;
import model.Brinquedo;
import model.Pedido;
import model.Sanduiche;
import model.Tamanho;
import model.TipoBebida;
import model.TipoBrinquedo;
import model.TipoSanduiche;

public class Caixa {
	
	public static void main(String[] args) {
		Atendente atendente = new Atendente();
		
		Sanduiche sanduiche = new Sanduiche(TipoSanduiche.CHEESEBURGER);
		Batata batata = new Batata(Tamanho.M);
		Bebida bebida = new Bebida(TipoBebida.GUARANA);
		Brinquedo brinquedo = new Brinquedo(TipoBrinquedo.CARRINHO);
		
		Pedido pedido = atendente.solicitarKitInfantil(sanduiche, batata, bebida, brinquedo);
		
		System.out.println(pedido);
	}

}
