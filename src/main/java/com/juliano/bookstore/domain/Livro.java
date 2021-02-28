package com.juliano.bookstore.domain;

public class Livro {

  private Integer id;
  private String titulo;
  private String nome_autor;
  private String texto;

  private Categria categria;

  public Livro(){
    super();
  }


  public Livro(Integer id, String titulo, String nome_autor, String texto, Categria categria) {
    super();
    this.id = id;
    this.titulo = titulo;
    this.nome_autor = nome_autor;
    this.texto = texto;
    this.categria = categria;
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

  public String getNome_autor() {
    return this.nome_autor;
  }

  public void setNome_autor(String nome_autor) {
    this.nome_autor = nome_autor;
  }

  public String getTexto() {
    return this.texto;
  }

  public void setTexto(String texto) {
    this.texto = texto;
  }

  public Categria getCategria() {
    return this.categria;
  }

  public void setCategria(Categria categria) {
    this.categria = categria;
  }


  @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Livro)) {
            return false;
        }
        Livro livro = (Livro) o;
        return Objects.equals(id, livro.id);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(id);
  }

  
}