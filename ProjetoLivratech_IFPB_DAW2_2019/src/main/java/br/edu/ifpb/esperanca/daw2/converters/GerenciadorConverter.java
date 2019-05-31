package br.edu.ifpb.esperanca.daw2.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.dao.DAO;
import br.edu.ifpb.esperanca.daw2.dao.GerenciadorDAO;
import br.edu.ifpb.esperanca.daw2.livratech.entities.Gerenciador;
import br.edu.ifpb.esperanca.daw2.livratech.entities.Identificavel;

@FacesConverter(forClass=Gerenciador.class)
public class GerenciadorConverter implements Converter {

	@Inject
	private GerenciadorDAO gerenciadorDAO;
	
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String id) {
		return gerenciadorDAO.getByID(Long.parseLong(id));
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object entidade) {
		return ((Identificavel)entidade).getId().toString();
	}

	
	
}
