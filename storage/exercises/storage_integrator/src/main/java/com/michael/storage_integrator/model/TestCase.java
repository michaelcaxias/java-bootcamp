package com.michael.storage_integrator.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class TestCase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String description;

    @Column(nullable = false)
    private boolean tested;

    @Column(nullable = false)
    private boolean passed;

    private int number_of_tries;

    private LocalDateTime last_update;
}