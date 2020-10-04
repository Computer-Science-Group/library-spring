package com.csg.libraryspring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
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

  @ManyToOne
  @JoinColumn(name = "CATEGORY_ID")
  private Category category;

  public Book(String title) {
    this.title = title;
  }

  public Book(String title, Category category) {
    this.title = title;
    this.category = category;
  }
}