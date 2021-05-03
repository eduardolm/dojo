package br.com.example.casadocodigo.dto.request;

import br.com.example.casadocodigo.entity.Author;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class AuthorDto {

    @NotBlank
    @NotEmpty
    private String name;

    @NotBlank
    @NotEmpty
    @Email
    private String email;

    @NotEmpty
    @NotBlank
    @Size(max = 400)
    private String description;

    public AuthorDto(String name, String email, String description) {
        this.name = name;
        this.email = email;
        this.description = description;
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

    public Author toModel(){
        return new Author(name, email, description);
    }
}
