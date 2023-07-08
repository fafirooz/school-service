package ir.schoolservice.model;

import jakarta.persistence.*;

@Entity
public class Dars {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false, unique = true)
    private String name;
}
