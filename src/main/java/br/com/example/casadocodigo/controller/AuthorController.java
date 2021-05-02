package br.com.example.casadocodigo.controller;

import br.com.example.casadocodigo.dto.AuthorDto;
import br.com.example.casadocodigo.entity.Author;
import br.com.example.casadocodigo.repository.AuthorRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/author")
public class AuthorController {

    private final AuthorRepository repository;

    public AuthorController(AuthorRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody @Valid AuthorDto authorDto) {
        Author author = authorDto.toModel();
        return ResponseEntity.ok(new AuthorDto(author.getName(), author.getEmail(), author.getDescription()))
    }
}
