package com.csg.libraryspring.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

@Data

@NoArgsConstructor
@Entity
public class Book {

  @Id
  @GeneratedValue
  private Long id;

  @NonNull
  private String title;

  private String isbn;

  private String summary;

  @Version
  private int version;
}