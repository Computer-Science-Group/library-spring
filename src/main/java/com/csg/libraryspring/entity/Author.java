package com.csg.libraryspring.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @Column
    String firstname;

    @Column
    String lastname;
}
