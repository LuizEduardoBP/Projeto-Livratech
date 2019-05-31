package br.edu.ifpb.esperanca.daw2.livratech.beans;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.ifpb.esperanca.daw2.livratech.entities.Gerenciador;
import br.edu.ifpb.esperanca.daw2.services.UserService;

@ViewScoped
@Named
public class GerenciadorBean implements Serializable {

	@Inject
	private UserService service;

	protected Gerenciador entidade;

	protected Collection<Gerenciador> entidades;

	public GerenciadorBean() {
	}
	
	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}

	public void remove(Gerenciador entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Gerenciador getEntidade() {
		return entidade;
	}

	public void setEntidade(Gerenciador entidade) {
		this.entidade = entidade;
	}

	public Collection<Gerenciador> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Gerenciador> entidades) {
		this.entidades = entidades;
	}

	public void save() {
		getService().save(entidade);
		limpar();
	}

	public void editar(Long id) {
		this.getEntidade().setId(id);
		save();
	}

	public void limpar() {
		entidades = getService().getAll();
		entidade = newEntidade();
	}

	protected Gerenciador newEntidade() {
		return new Gerenciador();
	}

	public UserService getService() {
		return service;
	}

}
