package com.juliano.bookstore.domain;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GenetedValue;
import javax.persistence.GenerationType;

@Entity 
public class Categria implements Serializable{

    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String descricao;
    private List<Livro> livros = new ArrayList<>(); 


    public Categria(){
        super();
    }    

    public Categria(Integer id, String nome, String descricao, List<Livro> livros) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.livros = livros;
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



    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Categria)) {
            return false;
        }
        Categria categria = (Categria) o;
        return Objects.equals(id, categria.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
   

}