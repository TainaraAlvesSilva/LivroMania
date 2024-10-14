package com.biblioteca.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

    //É uma interface que herda de JpaRepository, fornecendo métodos 
    //prontos para realizar operações no banco de dados, como salvar, atualizar, deletar e buscar livros.
//Não precisa de implementação manual.
}

