package com.juliano.bookstore.service;

import java.util.List;
import java.util.Optional;

import com.juliano.bookstore.domain.Categoria;
import com.juliano.bookstore.domain.Livro;
import com.juliano.bookstore.repository.LivroRepository;
import com.juliano.bookstore.service.exceptions.ObjectNotFoundExecption;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {
    @Autowired
    private LivroRepository repository;

    @Autowired
    private CategoriaService categoriaService;
    public Livro findById(Integer id) {
        Optional<Livro> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundExecption(
            "Objeto não enontrado!  Id:" + id + ", Tipo " + Livro.class.getName()));
    }

	public List<Livro> findAll(Integer id_cat) {
        categoriaService.findById(id_cat);
        return repository.findAllByCategoria(id_cat);
    }

	public Livro update(Integer id, Livro obj) {
        Livro newObj = findById(id);
        updateData(newObj,obj);
        return repository.save(newObj);
	}

    private void updateData(Livro newObj, Livro obj) {
        newObj.setTitulo(obj.getTitulo());
        newObj.setTexto(obj.getTexto());
        newObj.setNome_autor(obj.getNome_autor());
    }

	public Livro create(Integer id_cat, Livro obj) {
        obj.setId(null);
        Categoria cat = categoriaService.findById(id_cat);
        obj.setCategoria(cat);
        return repository.save(obj);
	}

	public void delete(Integer id) {
        Livro obj = findById(id);
        repository.delete(obj);
	}
}
