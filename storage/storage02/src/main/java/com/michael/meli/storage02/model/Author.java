package com.michael.meli.storage02.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false) // nome é obrigatorio
    private String name;

    @OneToOne(mappedBy = "author")
    @JsonIgnoreProperties("author") // não preencher o atributo author novamente
    private Address address;

    @ManyToMany
    @JoinTable(  // tabela de junçao
            name = "author_books", // nome da tabela
            joinColumns = @JoinColumn(name = "id_author", referencedColumnName = "id"), // cria uma coluna com o name id_author referenciado o id da tabela author
            inverseJoinColumns = @JoinColumn(name = "id_book", referencedColumnName = "id") // mesmo do de cima, mas inverso
    )
    @JsonIgnoreProperties("authors")
    private Set<Book> books;
}
