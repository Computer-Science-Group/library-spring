package com.csg.libraryspring.repository;

import com.csg.libraryspring.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource
public interface BookRepository extends JpaRepository<Book, Long> {
  Optional<Book> findByIsbn(@Param("isbn") String isbn);
}