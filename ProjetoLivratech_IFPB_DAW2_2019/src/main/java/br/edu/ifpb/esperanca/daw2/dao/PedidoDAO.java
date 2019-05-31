package br.edu.ifpb.esperanca.daw2.dao;

import java.util.List;

import br.edu.ifpb.esperanca.daw2.filtros.GerenciadorFiltro;
import br.edu.ifpb.esperanca.daw2.livratech.entities.Pedido;

public class PedidoDAO extends DAO<Pedido> {
	
	public PedidoDAO() {
		super(Pedido.class);
	}
}
