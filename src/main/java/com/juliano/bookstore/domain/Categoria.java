package com.juliano.bookstore.domain;
import java.util.List;

public class Categria{

    private Integer id;
    private String nome;
    private String descricao;
    private List<Livro> livros = new ArrayList<>(); 


    public Categria(){
        super();
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

    public List<Livro> getLivros() {
        return this.livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

   

}