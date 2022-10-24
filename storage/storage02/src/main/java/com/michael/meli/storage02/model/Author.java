package com.michael.meli.storage02.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

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
}