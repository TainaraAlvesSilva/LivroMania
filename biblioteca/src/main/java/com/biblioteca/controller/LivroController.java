package com.biblioteca.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.model.Livro;
import com.biblioteca.service.LivroService;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;
    //função dessa classe: Recebe as requisições HTTP (como GET, POST, PUT, DELETE) e as direciona para o LivroService.
    //Adicione aqui os demais métodos do CRUD

    //Talita, método para DELETE
    @DeleteMapping("/{id}")
    public void deletarLivro (@PathVariable Long id) {
        livroService.deletar(id);
    }
    //Tainara, método para UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<Livro> atualizarLivro(@PathVariable Long id, @RequestBody Livro livro) {
        return ResponseEntity.ok(livroService.atualizar(id, livro));
    }

}
