package br.edu.ifpb.esperanca.daw2.livratech.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AREA")
public class Area implements Identificavel{
	
	@Id
	@GeneratedValue
	@Column(name="area_id")
	private Long id;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="area_nome")
	private String nomeArea;
	
	
	public String getNomeArea() {
		return nomeArea;
	}
	public void setNomeArea(String nomeArea) {
		this.nomeArea = nomeArea;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nomeArea == null) ? 0 : nomeArea.hashCode());
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
		Area other = (Area) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nomeArea == null) {
			if (other.nomeArea != null)
				return false;
		} else if (!nomeArea.equals(other.nomeArea))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Area [idArea=" + id + ", nomeArea=" + nomeArea + "]";
	}
	public Area() {
		super();
		this.id = id;
		this.nomeArea = nomeArea;
	}
	
	
}

