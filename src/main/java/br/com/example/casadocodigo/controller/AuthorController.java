package br.com.example.casadocodigo.controller;

import br.com.example.casadocodigo.dto.request.AuthorDto;
import br.com.example.casadocodigo.dto.response.AuthorResponseDto;
import br.com.example.casadocodigo.entity.Author;
import br.com.example.casadocodigo.repository.AuthorRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        repository.save(author);
        return ResponseEntity.ok(new AuthorResponseDto(author));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") Long id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
