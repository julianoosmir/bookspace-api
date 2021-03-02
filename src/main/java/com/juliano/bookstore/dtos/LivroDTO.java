package com.juliano.bookstore.dtos;

import java.io.Serializable;

import com.juliano.bookstore.domain.Livro;

public class LivroDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String titulo;
    public LivroDTO(){
        super();
    }

    public LivroDTO(Livro objLivro) {
        super();
        this.id = objLivro.getId();
        this.titulo = objLivro.getTitulo();
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
