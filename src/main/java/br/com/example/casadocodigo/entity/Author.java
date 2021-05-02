package br.com.example.casadocodigo.entity;

import javax.persistence.*;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String description;

    @Deprecated
    public Author(){ }

    public Author(String name, String email, String description) {
        this.name = name;
        this.email = email;
        this.description = description;
    }

    public long getId() {
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
}
