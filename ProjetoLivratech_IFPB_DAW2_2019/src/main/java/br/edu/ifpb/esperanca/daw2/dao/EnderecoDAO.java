package br.edu.ifpb.esperanca.daw2.dao;

import java.util.List;

import br.edu.ifpb.esperanca.daw2.filtros.GerenciadorFiltro;
import br.edu.ifpb.esperanca.daw2.livratech.entities.Endereco;

public class EnderecoDAO extends DAO<Endereco> {
	
	public EnderecoDAO() {
		super(Endereco.class);
	}
}
