package com.juliano.bookstore.dtos;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import com.juliano.bookstore.domain.Categoria;

import org.hibernate.validator.constraints.Length;

public class CategoriaDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    @NotEmpty(message = "Campo nome é requerido")
    @Length(min = 3,max = 100,message = "o campo nome deve ter entre 3 a 100 caracteres")
    private String nome;
    @NotEmpty(message = "Campo nome é requerido")
    @Length(min = 3,max = 100,message = "o campo nome deve ter entre 3 a 100 caracteres")
    private String descricao;

    public CategoriaDTO() {
        super();
    }

    public CategoriaDTO(Categoria obj) {
        super();
        this.id = obj.getId();
        this.nome =obj.getNome();
        this.descricao = obj.getDescricao();
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
