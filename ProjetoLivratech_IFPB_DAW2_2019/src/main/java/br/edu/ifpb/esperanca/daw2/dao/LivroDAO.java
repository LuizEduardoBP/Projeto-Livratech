package br.edu.ifpb.esperanca.daw2.dao;

import java.util.List;

import br.edu.ifpb.esperanca.daw2.filtros.GerenciadorFiltro;
import br.edu.ifpb.esperanca.daw2.livratech.entities.Livro;

public class LivroDAO extends DAO<Livro> {
	
	public LivroDAO() {
		super(Livro.class);
	}
}
