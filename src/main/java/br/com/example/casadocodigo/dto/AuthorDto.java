package br.com.example.casadocodigo.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

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
    @Max(400)
    private String description;


}
