package br.edu.ifpb.esperanca.daw2.livratech.entities;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="LIVRO")
public class Livro implements Identificavel{
	
	@Id
	@Column(name="livro_isbn")
	private Long id;
	
	@Column(name="livro_nome")
	private String nomeLivro;
	
	@Column(name="livro_preco")
	private String preco;
	
	@Column(name="livro_resumo")
	private String resumo;
	
	@Column(name="livro_edicao")
	private Integer edicao;
	
	@Column(name="livro_quant")
	private String quantLivro;
	
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
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNomeLivro() {
		return nomeLivro;
	}
	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}
	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}
	public String getResumo() {
		return resumo;
	}
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	public Integer getEdicao() {
		return edicao;
	}
	public void setEdicao(Integer edicao) {
		this.edicao = edicao;
	}
	public String getQuantLivro() {
		return quantLivro;
	}
	public void setQuantLivro(String quantLivro) {
		this.quantLivro = quantLivro;
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
		result = prime * result + ((edicao == null) ? 0 : edicao.hashCode());
		result = prime * result + ((editoras == null) ? 0 : editoras.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((livros == null) ? 0 : livros.hashCode());
		result = prime * result + ((nomeLivro == null) ? 0 : nomeLivro.hashCode());
		result = prime * result + ((preco == null) ? 0 : preco.hashCode());
		result = prime * result + ((quantLivro == null) ? 0 : quantLivro.hashCode());
		result = prime * result + ((resumo == null) ? 0 : resumo.hashCode());
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
		Livro other = (Livro) obj;
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
		if (edicao == null) {
			if (other.edicao != null)
				return false;
		} else if (!edicao.equals(other.edicao))
			return false;
		if (editoras == null) {
			if (other.editoras != null)
				return false;
		} else if (!editoras.equals(other.editoras))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (livros == null) {
			if (other.livros != null)
				return false;
		} else if (!livros.equals(other.livros))
			return false;
		if (nomeLivro == null) {
			if (other.nomeLivro != null)
				return false;
		} else if (!nomeLivro.equals(other.nomeLivro))
			return false;
		if (preco == null) {
			if (other.preco != null)
				return false;
		} else if (!preco.equals(other.preco))
			return false;
		if (quantLivro == null) {
			if (other.quantLivro != null)
				return false;
		} else if (!quantLivro.equals(other.quantLivro))
			return false;
		if (resumo == null) {
			if (other.resumo != null)
				return false;
		} else if (!resumo.equals(other.resumo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Livro [isbn=" + id + ", nomeLivro=" + nomeLivro + ", preco=" + preco + ", resumo=" + resumo
				+ ", edicao=" + edicao + ", quantLivro=" + quantLivro + ", areas=" + areas + ", autores=" + autores
				+ ", categorias=" + categorias + ", livros=" + livros + ", editoras=" + editoras + "]";
	}
	public Livro() {
		super();
		this.id = id;
		this.nomeLivro = nomeLivro;
		this.preco = preco;
		this.resumo = resumo;
		this.edicao = edicao;
		this.quantLivro = quantLivro;
		this.areas = areas;
		this.autores = autores;
		this.categorias = categorias;
		this.livros = livros;
		this.editoras = editoras;
	}
	
	
}
