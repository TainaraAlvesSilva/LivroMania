package com.biblioteca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.model.Livro;
import com.biblioteca.repository.LivroRepository;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;
    // implemente a lógica da sua parte do CRUD nessa class
//Faz a comunicação entre o LivroRepository e o LivroController.
//Ele organiza a lógica de salvar, buscar, atualizar e deletar livros, utilizando os métodos do LivroRepository.
public void deletar(Long id) {
    livroRepository.findById(id).map(livro -> {
        livroRepository.delete(livro);
        return null;
    }).orElseThrow(() -> new RuntimeException("Livro não encontrado"));
}

    public Livro atualizar(Long id, Livro livroAtualizado) {
        return livroRepository.findById(id).map(livro -> {
            livro.setNome(livroAtualizado.getTitulo());
            livro.setAutor(livroAtualizado.getAutor());
            livro.setAno(livroAtualizado.getAno());
            return livroRepository.save(livro);
        }).orElseThrow(() -> new RuntimeException("Livro não encontrado"));
    }

	public Object listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object listarTodosDescricao(String pesquisa) {
		// TODO Auto-generated method stub
		return null;
	}
}
