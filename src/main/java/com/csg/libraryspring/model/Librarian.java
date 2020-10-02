package com.csg.libraryspring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Librarian {

  @Id
  @GeneratedValue
  private Long id;

  @NonNull
  private String name;

  private String phone;

  private String email;


  private LocalDate createdAt;

  private LocalDate updatedAt;

  @Version
  private int version;


}
