package com.csg.libraryspring;

import com.csg.libraryspring.model.Book;
import com.csg.libraryspring.model.Category;
import com.csg.libraryspring.model.Librarian;
import com.csg.libraryspring.repository.AuthorRepository;
import com.csg.libraryspring.repository.BookRepository;
import com.csg.libraryspring.repository.CategoryRepository;
import com.csg.libraryspring.repository.LibrarianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;
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
  @Autowired
  private BookRepository bookRepository;

  @PostConstruct
  public void initData() {
    //initLibrarian();
    initCategory();
    initBook();
  }

  public void initLibrarian() {
    List<Librarian> librarians = Stream.of(
        new Librarian("med", "med@gmail.com"),
        new Librarian("morad", "morad@gmail.com")
    ).collect(Collectors.toList());

    librarianRepository.saveAll(librarians);
  }

  public void initCategory() {
    List<Category> librarians = Stream.of(
        new Category("frontend"),
        new Category("backend")
    ).collect(Collectors.toList());

    categoryRepository.saveAll(librarians);
  }

  public void initBook() {
    Optional<Category> backend = categoryRepository.findByName("backend");
    Optional<Category> frontend = categoryRepository.findByName("frontend");
    List<Book> librarians = Stream.of(
        new Book("javascript", frontend.get()),
        new Book("spring boot", backend.get())
    ).collect(Collectors.toList());

    bookRepository.saveAll(librarians);
  }
}
