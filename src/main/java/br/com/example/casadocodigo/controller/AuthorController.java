package br.com.example.casadocodigo.controller;

import br.com.example.casadocodigo.dto.AuthorDto;
import br.com.example.casadocodigo.entity.Author;
import br.com.example.casadocodigo.repository.AuthorRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class AuthorController {

    private final AuthorRepository repository;

    public AuthorController(AuthorRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Author create(@RequestBody @Valid AuthorDto authorDto) {

    }
}
