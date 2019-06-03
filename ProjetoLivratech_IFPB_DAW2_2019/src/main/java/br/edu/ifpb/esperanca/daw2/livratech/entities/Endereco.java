package br.edu.ifpb.esperanca.daw2.livratech.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Embeddable
@Table(name="ENDERECO")
public class Endereco implements Identificavel{
	
	@Id
	@GeneratedValue
	@Column(name="endereco_numero")
	private Long id;
	
	@Column(name="endereco_rua", nullable = false)
	private String rua; 
	
	@Column(name="endereco_bairro", nullable = false)
	private String bairro;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((rua == null) ? 0 : rua.hashCode());
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
		Endereco other = (Endereco) obj;
		if (bairro == null) {
			if (other.bairro != null)
				return false;
		} else if (!bairro.equals(other.bairro))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (rua == null) {
			if (other.rua != null)
				return false;
		} else if (!rua.equals(other.rua))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Endereco [numero=" + id + ", rua=" + rua + ", bairro=" + bairro + "]";
	}
	public Endereco(Integer numero, String rua, String bairro) {
		super();
		this.id = id;
		this.rua = rua;
		this.bairro = bairro;
	}
	
	
}
