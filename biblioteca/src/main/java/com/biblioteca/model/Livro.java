package com.biblioteca.model;
import javax.xml.crypto.Data;

import jakarta.persistence.Entity;

@Entity
@lombok.Data
public class Livro {
    //aqui esta os dados que seram armazenados no banco, o @Entity indica que ela é uma tabela no banco de datos,
    // e o @Data gera automaticamente  os métodos getters, setters, equals, hashCode, e toString. 
    public Long id;
    public String titulo;
    public String autor;
    public Data ano;
    
}
