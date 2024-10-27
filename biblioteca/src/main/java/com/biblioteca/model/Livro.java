package com.biblioteca.model;
import javax.xml.crypto.Data;

import jakarta.persistence.Entity;

@Entity
@lombok.Data
public class Livro {
    //aqui esta os dados que seram armazenados no banco, o @Entity indica que ela é uma tabela no banco de datos,
    // e o @Data gera automaticamente  os métodos getters, setters, equals, hashCode, e toString. 
    public Long id;
    public String nome;
    public String autor;
    public Data ano;
	public Object getTitulo() {
		// TODO Auto-generated method stub
		return null;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Data getAno() {
		return ano;
	}
	public void setAno(Data ano) {
		this.ano = ano;
	}
	public void setNome(Object object) {
		this.nome = (String) object;
	}
	public String getNome() {
		return nome;
	}

		
	}
    

