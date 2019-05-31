package br.edu.ifpb.esperanca.daw2.Interface;

import java.util.ArrayList;

import br.edu.ifpb.esperanca.daw2.livratech.entities.Area;
import br.edu.ifpb.esperanca.daw2.livratech.entities.Autor;
import br.edu.ifpb.esperanca.daw2.livratech.entities.Categoria;
import br.edu.ifpb.esperanca.daw2.livratech.entities.Editora;
import br.edu.ifpb.esperanca.daw2.livratech.entities.Gerenciador;
import br.edu.ifpb.esperanca.daw2.livratech.entities.Livro;
import br.edu.ifpb.esperanca.daw2.livratech.entities.Pedido;

public interface InterfaceGerenciador {

//pesquisar livros//
public Livro[] pesquisaSimples(String termo);

//Consulta livros em falta//
public void consultaPedidos(Pedido pedidos);

// Adicionar //

//adicionar livro ao sistema//
public Livro adicionarLivro(Livro livros);

//adicionar editora ao sistema//
public Editora adicionarEditora(Editora editoras);

//adicionar uma area de livro ao sistema//
public Area adicionarArea(Area areas);

//adicionar um autor de livro ao sistema//
public Autor adicionarAutor(Autor autores);

//adicionar categoria de um livro ao sistema//
public Categoria adicionarCategoria(Categoria categoria);

// Remover //

//remover um livro do sistema//
public Livro removerLivro (Livro livros);

//remover uma editora do sistema//
public Editora removerEditora (Editora editoras);

//remover uma area do sistema//
public Area removerArea (Area areas);

//remover um autor do sistema//
public Autor removerAutor (Autor autores);

//remover uma categoria do sistema//
public Categoria removerCategoria (Categoria categoria);

// Atualizar //

//atualizar um livro do sistema//
public Livro atualizarLivro (Livro livros);

//atualizar uma editora do sistema//
public Editora atualizarEditora(Editora editoras);

//atualizar uma area do sistema//
public Area atualizarArea(Area areas);

//atualizar um autor do sistema//
public Autor atualizarAutor(Autor autores);

//atualizar uma categoria do sistema//
public Categoria atualizarCategoria (Categoria categoria);


}