package com.juliano.bookstore.service;

import java.util.Optional;

import com.juliano.bookstore.domain.Categoria;
import com.juliano.bookstore.repository.CategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
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
}
