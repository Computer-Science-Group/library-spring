package com.csg.libraryspring;

import com.csg.libraryspring.model.Librarian;
import com.csg.libraryspring.repository.AuthorRepository;
import com.csg.libraryspring.repository.CategoryRepository;
import com.csg.libraryspring.repository.LibrarianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class LibrarySpringApplication {

  public static void main(String[] args) {
    SpringApplication.run(LibrarySpringApplication.class, args);
  }

  @Autowired
  private LibrarianRepository librarianRepository;
  @Autowired
  private CategoryRepository categoryRepository;
  @Autowired
  private AuthorRepository authorRepository;

  @PostConstruct
  public void initData() {

    List<Librarian> librarians = Stream.of(
        new Librarian("med", "med@gmail.com"),
        new Librarian("morad", "morad@gmail.com")
    ).collect(Collectors.toList());

    librarianRepository.saveAll(librarians);
  }

}
