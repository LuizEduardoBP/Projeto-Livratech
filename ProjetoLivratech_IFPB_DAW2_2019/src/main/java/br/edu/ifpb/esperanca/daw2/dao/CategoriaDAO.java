package br.edu.ifpb.esperanca.daw2.dao;

import java.util.List;

import br.edu.ifpb.esperanca.daw2.filtros.GerenciadorFiltro;
import br.edu.ifpb.esperanca.daw2.livratech.entities.Categoria;

public class CategoriaDAO extends DAO<Categoria> {
	
	public CategoriaDAO() {
		super(Categoria.class);
	}
}
