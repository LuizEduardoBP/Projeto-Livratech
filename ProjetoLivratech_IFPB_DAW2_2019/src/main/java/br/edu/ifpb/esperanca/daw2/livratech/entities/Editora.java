package br.edu.ifpb.esperanca.daw2.livratech.entities;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="USUARIO")
public class Editora {
	
	@Id
	@Column(name="editora_cnpj")
	private Integer cnpj;
	
	@Column(name="editora_nome")
	private String nomeEditora;
	
	@Column(name="editora_edereco")
	private String Endereco;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@Column(name="ENDERECO_ID")
	private ArrayList <Endereco> enderecos;
	
	public Integer getCnpj() {
		return cnpj;
	}
	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}
	public String getNomeEditora() {
		return nomeEditora;
	}
	public void setNomeEditora(String nomeEditora) {
		this.nomeEditora = nomeEditora;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Endereco == null) ? 0 : Endereco.hashCode());
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
		result = prime * result + ((nomeEditora == null) ? 0 : nomeEditora.hashCode());
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
		Editora other = (Editora) obj;
		if (Endereco == null) {
			if (other.Endereco != null)
				return false;
		} else if (!Endereco.equals(other.Endereco))
			return false;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		if (nomeEditora == null) {
			if (other.nomeEditora != null)
				return false;
		} else if (!nomeEditora.equals(other.nomeEditora))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Editora [cnpj=" + cnpj + ", nomeEditora=" + nomeEditora + ", Endereco=" + Endereco + "]";
	}
	public Editora() {
		super();
		this.cnpj = cnpj;
		this.nomeEditora = nomeEditora;
		Endereco = getEndereco();
	}
}


