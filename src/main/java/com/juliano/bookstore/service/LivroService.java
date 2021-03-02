package com.juliano.bookstore.service;

import java.util.Optional;

import com.juliano.bookstore.domain.Livro;
import com.juliano.bookstore.repository.LivroRepository;
import com.juliano.bookstore.service.exceptions.ObjectNotFoundExecption;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {
    @Autowired
    private LivroRepository repository;

    public Livro findById(Integer id) {
        Optional<Livro> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundExecption(
            "Objeto não enontrado!  Id:" + id + ", Tipo " + Livro.class.getName()));
    }
}
