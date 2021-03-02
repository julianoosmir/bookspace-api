package com.juliano.bookstore.service;

import java.util.Optional;

import com.juliano.bookstore.domain.Categoria;
import com.juliano.bookstore.dtos.CategoriaDTO;
import com.juliano.bookstore.repository.CategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;

import com.juliano.bookstore.service.exceptions.ObjectNotFoundExecption;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria findById(Integer id) {
        Optional<Categoria> obj = categoriaRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundExecption(
                "Objeto nao encontrado ID:" + id + ", Tipo" + Categoria.class.getName()));
    }

    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

    public Categoria create(Categoria obj) {
        obj.setId(null);
        return categoriaRepository.save(obj);
    }

    public Categoria update(Integer id, CategoriaDTO objDto) {
        Categoria obj = findById(id);
        obj.setNome(objDto.getNome());
        obj.setDescricao(objDto.getDescricao());
        return categoriaRepository.save(obj);
    }

    public void delete(Integer id) {
        findById(id);
        
        try {
            categoriaRepository.deleteById(id);
        } catch (DataIntegrityViolationException e) {
           throw new com.juliano.bookstore.service  .exceptions.DataIntegrityViolationException(
               "categoria não pode ser deletada! possui livros associados");
        }
	}

}
