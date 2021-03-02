package com.juliano.bookstore.resources;

import java.security.Provider.Service;

import com.juliano.bookstore.domain.Livro;
import com.juliano.bookstore.service.LivroService;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/livros")
public class LivroResouce {

    @Autowired
    private LivroService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Livro> findById(@PathVariable Integer id){
        Livro obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
