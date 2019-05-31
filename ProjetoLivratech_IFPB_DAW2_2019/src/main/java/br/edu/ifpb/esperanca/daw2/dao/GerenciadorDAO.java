package br.edu.ifpb.esperanca.daw2.dao;

import java.util.List;

import br.edu.ifpb.esperanca.daw2.filtros.GerenciadorFiltro;
import br.edu.ifpb.esperanca.daw2.livratech.entities.Gerenciador;

public class GerenciadorDAO extends DAO<Gerenciador> {
	
	public GerenciadorDAO() {
		super(Gerenciador.class);
	}
}
