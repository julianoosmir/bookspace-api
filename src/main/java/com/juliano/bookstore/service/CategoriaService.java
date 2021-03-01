package com.juliano.bookstore.service;

import java.util.Optional;

import com.juliano.bookstore.domain.Categoria;
import com.juliano.bookstore.repository.CategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria findById(Integer id) {
        Optional<Categoria> obj = categoriaRepository.findById(id);
        return obj.orElse(null);

    }
}
