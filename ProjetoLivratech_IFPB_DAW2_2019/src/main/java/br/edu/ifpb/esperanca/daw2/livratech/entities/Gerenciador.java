package br.edu.ifpb.esperanca.daw2.livratech.entities;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="GERENCIADOR")
public class Gerenciador implements Identificavel{
	
	@Id
	@GeneratedValue(generator="gerenciador_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="gerenciador_seq")
	@Column(name="gerenciador_cpf")
	private Long id;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	private Integer cpf;
	
	@Column(name="funcionario_nome")
	private String nomeFuncionario;
	
	@Column(name="funcionario_email")
	private String emailfuncionario;
	
	@Column(name="funcionario_senha")
	private String senha;
	
	@ManyToMany
	@JoinColumn(name = "area_id")
	private ArrayList<Area> areas;
	
	@ManyToMany
	@JoinColumn(name = "autor_id")
	private ArrayList<Autor> autores;
	
	@ManyToMany
	@JoinColumn(name = "categoria_id")
	private ArrayList<Categoria> categorias;
	
	@ManyToMany
	@JoinColumn(name = "livro_isbn")
	private ArrayList<Livro> livros;
	
	@ManyToOne
	@JoinColumn(name = "editora_cnpj")
	private ArrayList<Editora> editoras;
	
	
	public Integer getCpf() {
		return cpf;
	}
	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	public String getEmailfuncionario() {
		return emailfuncionario;
	}
	public void setEmailfuncionario(String emailfuncionario) {
		this.emailfuncionario = emailfuncionario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public ArrayList<Area> getAreas() {
		return areas;
	}
	public void setAreas(ArrayList<Area> areas) {
		this.areas = areas;
	}
	public ArrayList<Autor> getAutores() {
		return autores;
	}
	public void setAutores(ArrayList<Autor> autores) {
		this.autores = autores;
	}
	public ArrayList<Categoria> getCategorias() {
		return categorias;
	}
	public void setCategorias(ArrayList<Categoria> categorias) {
		this.categorias = categorias;
	}
	public ArrayList<Livro> getLivros() {
		return livros;
	}
	public void setLivros(ArrayList<Livro> livros) {
		this.livros = livros;
	}
	public ArrayList<Editora> getEditoras() {
		return editoras;
	}
	public void setEditoras(ArrayList<Editora> editoras) {
		this.editoras = editoras;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((areas == null) ? 0 : areas.hashCode());
		result = prime * result + ((autores == null) ? 0 : autores.hashCode());
		result = prime * result + ((categorias == null) ? 0 : categorias.hashCode());
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((editoras == null) ? 0 : editoras.hashCode());
		result = prime * result + ((emailfuncionario == null) ? 0 : emailfuncionario.hashCode());
		result = prime * result + ((livros == null) ? 0 : livros.hashCode());
		result = prime * result + ((nomeFuncionario == null) ? 0 : nomeFuncionario.hashCode());
		result = prime * result + ((senha == null) ? 0 : senha.hashCode());
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
		Gerenciador other = (Gerenciador) obj;
		if (areas == null) {
			if (other.areas != null)
				return false;
		} else if (!areas.equals(other.areas))
			return false;
		if (autores == null) {
			if (other.autores != null)
				return false;
		} else if (!autores.equals(other.autores))
			return false;
		if (categorias == null) {
			if (other.categorias != null)
				return false;
		} else if (!categorias.equals(other.categorias))
			return false;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (editoras == null) {
			if (other.editoras != null)
				return false;
		} else if (!editoras.equals(other.editoras))
			return false;
		if (emailfuncionario == null) {
			if (other.emailfuncionario != null)
				return false;
		} else if (!emailfuncionario.equals(other.emailfuncionario))
			return false;
		if (livros == null) {
			if (other.livros != null)
				return false;
		} else if (!livros.equals(other.livros))
			return false;
		if (nomeFuncionario == null) {
			if (other.nomeFuncionario != null)
				return false;
		} else if (!nomeFuncionario.equals(other.nomeFuncionario))
			return false;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Gerenciador [cpf=" + cpf + ", nomeFuncionario=" + nomeFuncionario + ", emailfuncionario="
				+ emailfuncionario + ", senha=" + senha + ", areas=" + areas + ", autores=" + autores + ", categorias="
				+ categorias + ", livros=" + livros + ", editoras=" + editoras + "]";
	}
	
}
