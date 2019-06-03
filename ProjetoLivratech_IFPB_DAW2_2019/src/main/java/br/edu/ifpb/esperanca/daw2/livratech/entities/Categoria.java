package br.edu.ifpb.esperanca.daw2.livratech.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CATEGORIA") 
public class Categoria implements Identificavel{
	
	@Id
	@GeneratedValue
	@Column(name="categoria_id")
	private Long id;
	
	@Column(name="categoria_nome")
	private String nomeCategoria;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNomeCategoria() {
		return nomeCategoria;
	}
	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nomeCategoria == null) ? 0 : nomeCategoria.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nomeCategoria == null) {
			if (other.nomeCategoria != null)
				return false;
		} else if (!nomeCategoria.equals(other.nomeCategoria))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Categoria [idCategoria=" + id + ", nomeCategoria=" + nomeCategoria + "]";
	}
	public Categoria() {
		super();
		this.id = id;
		this.nomeCategoria = nomeCategoria;
	}
	
	
}
