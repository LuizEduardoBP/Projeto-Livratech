package br.edu.ifpb.esperanca.daw2.dao;

import java.util.List;

import br.edu.ifpb.esperanca.daw2.filtros.GerenciadorFiltro;
import br.edu.ifpb.esperanca.daw2.livratech.entities.Autor;

public class AutorDAO extends DAO<Autor> {
	
	public AutorDAO() {
		super(Autor.class);
	}
}
