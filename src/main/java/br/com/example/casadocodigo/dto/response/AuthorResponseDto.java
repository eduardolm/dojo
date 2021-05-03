package br.com.example.casadocodigo.dto.response;

import br.com.example.casadocodigo.entity.Author;

import java.time.LocalDateTime;

public class AuthorResponseDto {

    private Long id;
    private String name;
    private String email;
    private String description;
    private LocalDateTime createdAt;

    public AuthorResponseDto(Author author) {
        this.id = author.getId();
        this.name = author.getName();
        this.email = author.getEmail();
        this.description = author.getDescription();
        this.createdAt = author.getCreatedAt();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
